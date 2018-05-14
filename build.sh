#!/usr/bin/env bash

SKIP_TESTS=" -DskipTests"

./mvnw clean install dependency:tree $SKIP_TESTS
