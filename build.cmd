@REM echo %JAVA_HOME%
@REM echo %M2_HOME%
@REM echo %M2_REPO%
@REM echo %MAVEN_BATCH_ECHO%
@REM echo %MAVEN_BATCH_PAUSE%
@REM echo %MAVEN_OPTS%

mvnw.cmd clean install dependency:tree site
