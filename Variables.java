package com.variables;
// 1. Variable is a container which store the data value.
// 2. Variable is a name of memory location where it is stored.
// 3. It is a combination of "vary + able" which means its value can be changed.
// 4. There are three types of variables :- local, instance, static variable

// Local
// 1. it is declared inside the body or method.
// 2. another methods are in the class  not aware about local variables.
// 3. it can not be  defined with the 'static' keyword.

// instance
// 1. it is declared inside the class but outside the body of the method.
// 2. it is not declared as static.
// 3. it is declared inside the main method.
//4. it is instance-specific and is not share among instances.

// staic
// 1. it is declared as static.
// 2. it cannot be local.
// 3. it creates a single copy and share it among all instance in the class.
// 4. it Once allocates the memory when class is loaded.

public class Variables {
    static String str = "Ram";   //static variable

    void method() {
        String str = "kiran";  //local variable
    }

    public static void main(String args[]) {
        String data = "kumar"; // instance variable
    }
} // end of class

// Widening
