package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int i;
	    int len;

	    String word = scanner.next();
	    len = word.length();
	    char[] toArr = word.toCharArray();

	    for(i = len - 1; i >= 0; i--){
	        System.out.print(toArr[i]);
        }
    }
}
