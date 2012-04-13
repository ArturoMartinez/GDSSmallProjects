#!/bin/bash

OUT="release"
CXXOPTS="-I/usr/include -I/usr/java/jdk1.6.0_31/include -I /usr/java/jdk1.6.0_31/include/linux -ansi -Wall -fPIC -fexceptions"
LINKOPTS="-L/usr/lib64 -L./lib -shared -fPIC -fexceptions"

if [ -d $OUT ]; then 
  rm -R $OUT
fi

mkdir $OUT

echo Compiling...
g++ -c $CXXOPTS MPMerge.cpp -o $OUT/MPMerge.o

echo Linking...

g++ -o $OUT/MPMerge.so $LINKOPTS $OUT/MPMerge.o -Wl,--whole-archive -lmerge -Wl,--no-whole-archive
