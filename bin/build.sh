#!/usr/bin/env bash

source config.sh

../mvnw clean install dependency:tree
