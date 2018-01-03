# rest-example
## simple rest service for docker swarm test
### Это простой рест сервис для тестирования работы docker swarm
* Для сборки выполнить: gradle build
* для запуска: java -jar app1.jar
* Для проверки:curl -XPOST http://127.0.0.1:8888/inf
* Для принудительного завершения сервиса: curl -XPOST http://127.0.0.1:8888/kill  
