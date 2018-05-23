call config.cmd

..\mvnw clean install

..\mvnw clean release:prepare

echo "..\mvnw release:perform"

echo "git commit -m 'after release'"

echo "git push"

exit 0
