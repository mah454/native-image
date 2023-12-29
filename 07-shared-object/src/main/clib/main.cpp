#include <iostream>
#include <HelloWorld.h>

int main() {
    std::cout << "### Start application ###" << std::endl;

    graal_isolate_t *isolate = NULL;
    graal_isolatethread_t *thread = NULL;

    if (graal_create_isolate(NULL, &isolate, &thread) != 0) {
        fprintf(stderr, "initialization error\n");
        return 1;
    }

    sayHello(thread);

}