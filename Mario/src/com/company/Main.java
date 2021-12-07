package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n;
        do {
            System.out.print("Size: ");
            n = keyboard.nextInt();
        }
        while (n < 1 || n > 8);{
            for (int x= 0; x<= n; x++){
                for (int y=1; y<=n-x; y++){
                    System.out.print(" ");
                }
                for (int z=0;z<=x;z++){
                    System.out.print("#");
                }
                System.out.println(" ");
            }
        }
    }
}