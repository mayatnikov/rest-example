# это полезные команды для управления приложением в swarm
 image собирается командой 
````
 mvn fabric8:build
````
## Далее:
* создать локальный registry в кластере
* переименовать image в 127.0.0.1:5000/rest-example:latest
* выполнить:
````shell
docker stack deploy -c swarm-stack.yml
````
### Другие команды управления swarm

Команда | Пояснение
------- | -------
docker node ls | list of nodes
docker stack ls | List all running applications on this Docker host
docker stack deploy -c composefile appname | Run the specified Compose file
docker stack services appname | List the services associated with an app
docker stack ps appname | List the running containers associated with an app
docker stack rm appname | Tear down an application
