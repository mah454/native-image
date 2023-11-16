CC=clang++-11
CFLAGS=-Wall -fPIC -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/linux -lstdc++
BUILD_DIR=src/main/clib/build
SOURCE_DIR=src/main/clib

.PHONY: all clean 

all: native-library

init:
	mkdir -p $(BUILD_DIR)

native-library: init
	$(CC) $(CFLAGS) -shared -o $(BUILD_DIR)/native-library.so ${SOURCE_DIR}/native-library.cpp
	strip --strip-all $(BUILD_DIR)/native-library.so

clean: 
	rm -rfv *.so $(BUILD_DIR)
