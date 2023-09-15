## Docker Compose Utility
A simple spring boot - posgres application using docker compose utility.

#### Docker Commands

* docker ps - To list running docker containers

* docker exec -it docker-compose-postgres-1 psql -u myuser -d mydatabase
  * Docker command to login into postgres container - psql cli
  * \dt - list of tables in postgres

* Find docker ip address
  * Find docker container id - `docker ps`
  * Grep IP Address - `docker inspect <<CONTAINER_ID>> | grep IPAddress`

* Docker JSON file - docker_pgadmin_servers.json
  * To connect with posgres without login everytime.

#### Useful Links

* PGAdmin Docker Compose Link - https://github.com/asaikali/docker-compose-postgres