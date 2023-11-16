#include "native-library.h" 
JNIEXPORT jint JNICALL Java_ir_moke_ni_jni_NativeLibrary_sum(JNIEnv *env, jclass, jint ja, jint jb) {
  return ja + jb;
}
