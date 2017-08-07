#!/bin/bash

git clone "https://$GTOKEN@github.com/morteza-binary/java-api-wrapper-config" "~/morteza-binary/java-api-wrapper/binary-api-wrapper/build/resources/test/resources";

cat $(ls "~/morteza-binary/java-api-wrapper/binary-api-wrapper/build/resources/test/resources");
