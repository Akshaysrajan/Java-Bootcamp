package Assignment_2;

import java.util.Scanner;

public class inputCount {
//    Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

         int sum = 0;
        while(true){
            int num = input.nextInt();
            sum = sum + num;
            if (num == 0){
                break;
            }

        }
        System.out.print("sum = "+sum);

    }

}
