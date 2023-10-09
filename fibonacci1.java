//Write a program to print fibonacci series at the given number using loops.
package DailyPractice.Fibonacci;

import java.util.Scanner;

public class fibonacci1 {

    public static void main(String[] args){

    //create scanner object for user input
    Scanner sc = new Scanner(System.in);

    //variable declaration
    int n;
    int firstTerm= 0, secondTerm = 1;
    int nextTerm;
    int i =0;
  
    //prompt the user to enter a integer value and store integer in n variable
    System.out.print("Enter the number :- ");
    n = sc.nextInt();         // input n= 5

    System.out.println(firstTerm);
    System.out.println(secondTerm);

    // logic using while loop
    /* 
    
     while(i < n){
        nextTerm = firstTerm + secondTerm;
        System.out.println(nextTerm);
        firstTerm = secondTerm;
        secondTerm = nextTerm;
        i++;
     } 
     */

    // logic using do while loop
     do{

        nextTerm = firstTerm + secondTerm;
        System.out.println(nextTerm);
        firstTerm = secondTerm;
        secondTerm = nextTerm;
        i++;
        
     }
     while( i < n);

    

    // logic using for loop
    /* 
     for(; i<n; i++){
        nextTerm = firstTerm+secondTerm;
        System.out.println(nextTerm);
        firstTerm = secondTerm;
        secondTerm = nextTerm;
     }

     */

    }
    
}
