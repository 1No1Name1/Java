package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfString;
        int i;
        int num = 0;
        int ch = 0;
        int space = 0;
        int other = 0;


        String word = scanner.next();
        lengthOfString = word.length();
        char[] toArr = word.toCharArray();

        for (i = 0; i <= lengthOfString - 1; i++) {
            if (Character.isDigit(toArr[i])) {
                num++;
            }
            if(Character.isSpaceChar(toArr[i])){
                space++;
            }
            if(Character.isLetter(toArr[i])){
                ch++;
            }
            else {
                other++;
            }
        }
        System.out.println("Number of Letters: " + ch);
        System.out.println("Number of numbers: " + num);
        System.out.println("Number of spaces: " + space);
        System.out.println("Number of other symbols: " + other);
    }
}
