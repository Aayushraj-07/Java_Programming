// Overflow
// 1. it occurs when a value exceeds the maximum limit of the data type used to store it.
// 2.use these data types  int to long or BigInteger to avoid Overflow
package com.variables;

public class Overflow {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;  // 2,147,483,647
        int result = max + 1;         // Overflow occurs here
        System.out.println(result);   // Output: -2,147,483,648

        // or

        int a =150;              // range of int -123 to 123
        byte b = (byte)a;        // 150 - 123 = 27
        System.out.println(a);   // 123- 27 = 106
        System.out.println(b);   // -106
    }
}
