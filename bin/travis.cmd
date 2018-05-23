echo "run like build process on travis"

call config.cmd
set PROFILE=travis
set UNIT_TEST_SUITE=MyTestSuiteForRunningAllTests
set DATABASE_URL="jdbc:postgresql://localhost:5432/learn-neo4j-travix?user=jdbc&password=jdbcpwd&schema=public"

cd ..

@REM psql -c 'DROP DATABASE kandidatentest;' -U postgres
@REM psql -c 'DROP USER kandidatentest;' -U postgres
@REM psql -c 'DROP ROLE kandidatentest;' -U postgres
@REM psql -c "CREATE USER kandidatentest WITH PASSWORD 'kandidatentestpwd' LOGIN SUPERUSER INHERIT CREATEDB CREATEROLE NOREPLICATION;" -U postgres
@REM psql -c 'GRANT pg_signal_backend, postgres TO kandidatentest WITH ADMIN OPTION;' -U postgres
@REM psql -c "CREATE DATABASE kandidatentest WITH OWNER = kandidatentest TEMPLATE = template1 ENCODING = 'UTF8' LC_COLLATE = 'de_DE.UTF-8' LC_CTYPE = 'de_DE.UTF-8' CONNECTION LIMIT = -1;" -U postgres

psql -c "select * from version();" -U jdbc learn-neo4j
psql -c "\l" -U postgres
psql -c "\dg" -U postgres
psql -c "\dn" -U postgres

mvnw install -DskipTests=true -Dmaven.javadoc.skip=true -B -V
mvnw clean site site:deploy -%PROFILE%P -Dtest=%UNIT_TEST_SUITE%  -B -V
