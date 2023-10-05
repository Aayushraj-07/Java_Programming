//Write a Program to print the factorial of given number.
package JavaPoint;


import java.util.Scanner;
public class Factorial {

    public static void main(String[] args)
    {
        //create scanner object for user input.
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;

        //prompt the user to enter the a integer value and store integer in num variable.
        System.out.println("Enter a number");
        num = sc.nextInt();

        //logic using while loop
        int i=0;
        while(i<5){
            fact = fact*(num-i);
            i++;
        }
        

            //logic using while loop
          /* 
            int i=0;
            do
            {
                fact = fact * (num-i);
                i++;
            }
            while(i<5);
            */


        
        //logic of factorial usin for loop
      /* for(int i =0; i<5; i++){
            fact = fact * (num-i);
        }
        */

        //prompt the output
        System.out.println("Factorial of " +num+ " is = "+fact);
    }
    
}
