// Narrow TypeCasting
// 1. it is the process of converting a larger data type into a smaller data type manually. Sin
// 2. it is also called as Explicit typeCasting

package com.variables;

public class NarrowTypecasting {
    public static void main(String[] args) {
        float a = 100.67f;
        //int b = a; // compile time error
        int b = (int)a;
        System.out.println(b); // 100
    }
}
