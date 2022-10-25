package Assignment_2;

import java.util.Scanner;

public class  Largest_of_three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int m = Math.max(c, Math.max(a,b));
        System.out.println(m);
    }
}
