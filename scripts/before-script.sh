#!/bin/bash

git clone "https://$GTOKEN@github.com/morteza-binary/java-api-wrapper-config.git" "~/morteza-binary/java-api-wrapper/binary-api-wrapper/src/test/resources";

cat "~/morteza-binary/java-api-wrapper/binary-api-wrapper/build/resources/test/resources/TestEnvironment.properties";
