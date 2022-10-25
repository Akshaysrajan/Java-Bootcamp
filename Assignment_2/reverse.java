package Assignment_2;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();

//        MY METHOD
//        while(num>0){
//            int rev = num%10;
//            System.out.print(rev);
//            num /= 10;

//        ORIGINAL METHOD
        int ans = 0;
        while(num > 0){
            int rem = num%10;
            num /= 10;
            ans = ans*10 + rem;
        }
        System.out.printf("reverse = "+ ans);
    }
}
