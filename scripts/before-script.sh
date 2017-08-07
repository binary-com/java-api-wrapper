#!/bin/bash

git clone "https://$GTOKEN@github.com/morteza-binary/java-api-wrapper-config.git" "binary-api-wrapper/build/resources/test";

cat "binary-api-wrapper/build/resources/test/TestEnvironment.properties"

