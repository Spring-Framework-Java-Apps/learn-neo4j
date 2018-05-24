#!/usr/bin/env bash

export DATABASE_URL='jdbc:postgresql://localhost:5432/learn-neo4j?user=jdbc&password=jdbcpwd&schema=public'

source config.sh

cd ..

./mvnw clean spring-boot:run
