#!/usr/bin/env sh 

#entramos a cada proyecto para poder crear las imagenes de cada proyecto
#con docker
cd base-datos
docker build -t garciliano/base-datos:0.0.1 ./
cd ../
cd persona
mvn clean
mvn clean compile install -DskipTests
docker build -t garciliano/persona:0.0.1-SNAPSHOT .
cd ../
cd amigos
mvn clean
mvn clean compile install -DskipTests
docker build -t garciliano/amigos:0.0.1-SNAPSHOT .
cd ../
cd post
mvn clean
mvn clean compile install -DskipTests
docker build -t garciliano/post:0.0.1-SNAPSHOT .
cd ../
cd libro
mvn clean
mvn clean compile install -DskipTests
docker build -t garciliano/libro:0.0.1-SNAPSHOT .
cd ../
cd librosfavoritos
mvn clean
mvn clean compile install -DskipTests
docker build -t garciliano/librosfavoritos:0.0.1-SNAPSHOT .
cd ..
cd discovery-server-eureka
#./gradlew clean
#./gradlew build
docker build -t garciliano/discovery-server-eureka:latest .
cd ../

#ejecutamos el docker composer para ejecutar todas las imagenes
docker-compose up --build

docker-compose stop
docker-compose kill
docker-compose rm -f
