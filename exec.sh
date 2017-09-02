#!/usr/bin/env bash
echo "Cleaning up..."
rm ./bin/$1.jar

echo "Building..."
kotlinc src/$1.kt -include-runtime -d bin/$1.jar

if [ $? -eq 0 ]; then
  echo "Running..."
  java -jar bin/$1.jar
else
  echo "Build failed"
fi
