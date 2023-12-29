CC=clang++-11
CFLAGS=-Wall -fPIC -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/linux -lstdc++
BUILD_DIR=src/main/clib/build
SOURCE_DIR=src/main/clib

.PHONY: all clean 

all: main

init:
	mkdir -p $(BUILD_DIR)

main: init
	$(CC) $(CFLAGS) ${SOURCE_DIR}/main.cpp -o $(BUILD_DIR)/output -Itarget/ target/HelloWorld.so
	strip --strip-all $(BUILD_DIR)/output

clean: 
	rm -rfv *.so $(BUILD_DIR)
