#! /bin/bash

build=`test "$1" == 'compile' && echo 'clean compile' || echo ''`
mvn $build exec:java 2>/dev/null | grep -v INFO | grep -v WARNING
