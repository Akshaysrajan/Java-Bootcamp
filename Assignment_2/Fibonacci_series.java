package Assignment_2;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //nth fibonacci element
        int a = 0;
        int b = 1;
        int count = 2; //indexing from 2nd position two elements are already present

        while(count<=n){
            int temp = b; // initializing temp as a local variable
            b = b + a;
            a = temp;
            count++ ;

        }

        System.out.println(b);

    }
}
