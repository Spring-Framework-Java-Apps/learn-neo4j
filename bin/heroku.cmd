echo "run like build process on heroku"

call config.cmd

set PORT=8080
set JAVA_OPTS='-Xmx350m -Xss512k'

../mvnw clean install

java -Dserver.port=$PORT $JAVA_OPTS -jar target/kandidaten-0.0.18-SNAPSHOT.jar
