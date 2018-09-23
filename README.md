# rest-example
## simple rest service for docker swarm test
### Это простой рест сервис для тестирования работы docker swarm
### Так же работает для тестирования кластера kubernates
### Для демонстрации возможности одновременно возвращать XML или JSON
* Для сборки выполнить: mvn clean package
* для запуска: java -jar target/rest-example-1.0.0.jar
* Для проверки:curl -XPOST http://127.0.0.1:8888/inf
* Для принудительного завершения сервиса: curl -XPOST http://127.0.0.1:8888/kill
* Для проверки разных форматов ответа
* Проверка rest с JSON ответом  curl -XPOST http://127.0.0.1:8888/humans
** curl -XPOST --header "Accept: application/xml" localhost:8888/humans
** curl -XPOST --header "Accept: application/json" localhost:8888/humans

### Для работы с docker
* Сборка image: __mvn package fabric8:build__ - сборка docker-image (docker должен работать)
* запуск на локальном docker: __docker run --name swt -d -p 8888:8888 mayatnikov/rest-example:latest__
* проверка __curl ......__ (все те же команды)

### Для сохранения docker-image public registry
* mvn -Ddocker.username=mayatnikov -Ddocker.password=xxxxx fabric8:push (Это только для меня)

### Для запуска в кластере kubernates
* откорректировать содержимое директории [project-home]/fabric8 под свой кластер
* mvn fabric8:deploy 
#### Другие полезные команды для работы с кластером
* __mvn fabric8:resource__ - генерация файлов-ресурсов kubernates
* __mvn fabric8:deploy__ - запустить приложение в кластере
  
