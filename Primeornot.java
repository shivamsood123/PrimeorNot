package primeornot;

import java.util.Scanner;

public class Primeornot {

    public static void main(String[] args) {
        int n, c = 0;
        System.out.println("Please insert any number: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        for(int i = 2; i < n ; i++)
        {
            if(n % i == 0)
            {
                c++;
                break;
        }
        }
        if(c == 0)
        {
         System.out.println( n + " is prime number");
        }
        else
        {
         System.out.println(n + " is not prime number");
        }
        
     }
    
}
