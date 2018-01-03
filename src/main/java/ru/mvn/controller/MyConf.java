package ru.mvn.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: vitaly
 * Date: 09/07/17
 ; ЕшьуЖ 09Ж03
 */
@Configuration
public class MyConf implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
    int port;
    private static Log L = LogFactory.getLog(MyConf.class);

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost_ip() {
        return host_ip;
    }

    public void setHost_ip(String host_ip) {
        this.host_ip = host_ip;
    }

    String host_ip;

    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
        port = event.getEmbeddedServletContainer().getPort();
        InetAddress ip;
        String hostname;
        try {
            host_ip  = InetAddress.getLocalHost().toString();
            L.debug ("App1 started on host:"+host_ip);
        } catch (UnknownHostException e) {

            e.printStackTrace();
        }
    }
}
