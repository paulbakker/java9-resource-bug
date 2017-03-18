#!/bin/bash
javac --module-path=lib --module-source-path=src -d out $(find src -name '*.java')
java --module-path=lib:out  -m testconsumer/consumer.Consumer