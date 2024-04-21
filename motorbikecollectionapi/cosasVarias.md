

Para levantar la bbdd:
docker run -d --rm=true --name motorbikedb -e POSTGRES_USER=user -e POSTGRES_PASSWORD=secret -e POSTGRES_DB=motorbikedb -p 5432:5432 postgres:13.3

para atacar la API:
http://localhost:8080/motorbikes