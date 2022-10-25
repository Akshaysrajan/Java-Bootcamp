package Assignment_2;

import java.util.Scanner;

public class Up_Low {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a character : ");
        // there is no method to input character directly so we use trim() & charAt() method on a string
        // trim() - removes the space
        // charAt(0) - indexes the element in zeroth position
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.print("lower case !!!");
        }else {
            System.out.print("UPPER CASE !!!");
        }
    }
}
