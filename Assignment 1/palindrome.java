package Assignment_1;

import java.util.Scanner;

public class palindrome {
//    To find out whether the given String is Palindrome or not.

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:  ");
        String word = input.nextLine();

//        System.out.print(word.length()); - method to know the length of string

        String rev = ""; //empty string to store reversed string
        for (int i = word.length()-1; i>=0; i--){  //string length indexes from 0 so last letter of a string means length -1

            rev = rev + word.charAt(i); //charAt() method select the alphabet according to the index ie. i
        }
        System.out.println("Reversed String : " +rev);

        if (rev.equals(word)){ //method used for comparing string var1.equals(var2)
            System.out.println("It's a palindrome!!");
        }else System.out.println("Not a palindrome!!");

    }
}
