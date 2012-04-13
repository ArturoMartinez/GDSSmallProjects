#!/bin/bash

OUT="release"
CXXOPTS="-I/usr/include -ansi -Wall"

if [ -d $OUT ]; then 
  rm -R $OUT
fi

mkdir $OUT

echo Compiling...
g++ -c $CXXOPTS merge.cpp -o $OUT/merge.o

echo Linking...

g++ -o $OUT/merge $OUT/merge.o -L/usr/lib64 -L./lib -lmerge

