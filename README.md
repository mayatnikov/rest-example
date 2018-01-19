# rest-example
## simple rest service for docker swarm test
### Это простой рест сервис для тестирования работы docker swarm
### Для демонстрации возможности одновременно возвращать XML или JSON
* Для сборки выполнить: gradle build
* для запуска: java -jar app1.jar
* Для проверки:curl -XPOST http://127.0.0.1:8888/inf
* Для принудительного завершения сервиса: curl -XPOST http://127.0.0.1:8888/kill
* Для проверки разных форматов ответа
** curl -XPOST --header "Accept: application/xml" localhost:8888/humans
** curl -XPOST --header "Accept: application/json" localhost:8888/humans

