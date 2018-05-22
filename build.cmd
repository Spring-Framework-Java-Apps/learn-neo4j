set SKIP_TESTS= -DskipTests=true

mvnw.cmd clean install dependency:tree %SKIP_TESTS%
