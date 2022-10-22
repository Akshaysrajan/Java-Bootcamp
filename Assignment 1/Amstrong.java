package Assignment_1;

import java.util.Scanner;

public class Amstrong {
    //    To find Armstrong Number between two given number.
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter range : ");
        int range1 = input.nextInt();
        int range2 = input.nextInt();

        System.out.printf("Armstrong numbers found : \n");
        Armfinder(range1, range2);
    }

    static void Armfinder(int range1, int range2) {

        for (int i = range1 + 1; i < range2; i++) {
//            System.out.print(i);
            int num = i;
            int r, sum = 0;

            while (num > 0) {
                r = num % 10;
                sum = sum + r * r * r;
                num = num / 10;
            }

            if (sum == i) {
                System.out.print(" "+sum+",");
            }
        }
    }
}

