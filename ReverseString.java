package bhagirath;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the original string: ");
        String S = sc.nextLine();
        
        String r = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            r += S.charAt(i);
        }
        
        System.out.println("Reversed String: " + r);
    }
}
