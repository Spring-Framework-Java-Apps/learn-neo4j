echo "run smoketests"

call config.cmd
cd ..
set JAVA_OPTS=
set MAVEN_OPTS=
set MVN_PROFILE=smoketestss
set UNIT_TEST_SUITE=MyTestSuiteForRunningAllTests
set DATABASE_URL="jdbc:postgresql://localhost:5432/learn-neo4j-smoketests?user=jdbc&password=jdbcpwd&schema=public"

mvnw.cmd clean install dependency:tree site -P%MVN_PROFILE% -Dtest=%UNIT_TEST_SUITE%

mvnw clean install -B -V
mvnw clean site site:deploy -%PROFILE%P -Dtest=%UNIT_TEST_SUITE%  -B -V


