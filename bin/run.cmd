call config.cmd

cd ..

set PROFILE=default
set DATABASE_URL = "jdbc:postgresql://localhost:5432/learn-neo4j?user=jdbc&password=jdbcpwd&schema=public"

mvnw.cmd clean spring-boot:run
