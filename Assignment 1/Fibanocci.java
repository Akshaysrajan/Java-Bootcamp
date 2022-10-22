package Assignment_1;

import java.util.Scanner;

public class Fibanocci {

//    To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int limit = input.nextInt();

        int num1=0,num2=1,num3;
        System.out.printf(num1+"  "+num2+" ");

        for (int i=2;i<limit;i++){
            num3 = num1 + num2;
            System.out.print(" "+num3+ " ");
            num1=num2;
            num2=num3;

        }
    }
}
