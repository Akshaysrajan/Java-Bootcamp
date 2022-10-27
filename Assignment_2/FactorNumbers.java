package Assignment_2;

import java.util.Scanner;

public class FactorNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        System.out.print("factors are : ");
        for (int count = 1; count <= num; count++){

            if (num%count==0){
                System.out.print(","+count);
            }
            }
        }
    }

