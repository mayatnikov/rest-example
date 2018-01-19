package ru.mvn.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.mvn.domain.DataResponse;
import ru.mvn.domain.Human;

import java.util.List;

import static ru.mvn.Application.thisApp;

/**
 * Created with IntelliJ IDEA.
 * User: vitaly
 * Date: 11/06/16
 * Time: 20:27
 */

@RestController
public class RestApi {

    private static Log L = LogFactory.getLog(RestApi.class);

    @Autowired
    DataResponse humans;

    @Autowired
    MyConf conf;

    int tik=0;

    /**
     * возвращает имя ноды которая ответила
     * @return
     */
    @RequestMapping( value={"/inf"}, method = RequestMethod.POST )
    public @ResponseBody String getStat() {
        tik++;
        String answer = "OK. tik="+tik+" "+conf.getHost_ip()+":"+conf.getPort();
        L.debug(answer);
        return answer;
    }

    /**
     * Иллюстрация того, что данные могут возвращаться как в XML так и в JSON
     *  curl -XPOST --header "Accept: application/xml" localhost:8888/humans
     *  curl -XPOST --header "Accept: application/json" localhost:8888/humans
     * @return
     */
    @RequestMapping(value = "/humans", method = RequestMethod.POST,
            produces={"application/json","application/xml"})
    public @ResponseBody  List<Human> getHumans() {

        L.info("Humans size="+humans.getHumans().size());

        return humans.getHumans();
    }


    /**
     * команда умереть процессу
     * @return
     */
    @RequestMapping( value={"/kill"}, method = RequestMethod.POST )
    public @ResponseBody String killMe() {
        thisApp.close();
        return "I am dead!";
    }

}
