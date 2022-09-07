/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hexadecimal;

import java.util.Scanner;

/**
 *
 * @author mesha
 */
public class HexadecimalConversion {

    int num;
    //myArray[] = [10];

    public HexadecimalConversion() {
    }

    public int getNum() {
        if (num > 0 && num <= 10000) {
            return num;
        } else {
            throw new IllegalArgumentException("Number should be in range of 0 to 10000");
        }
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int change() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        num = input.nextInt();

        int rem;
        // For storing result
        String str2 = "";

        // Digits in hexadecimal number system
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (num > 0) {
            rem = num % 16;
            str2 = hex[rem] + str2;
            num = num / 16;
        }
        System.out.println("Method 2: Decimal to hexadecimal: " + str2);

//        int sum = 0; // initialize sum

        // Iterate through all elements
        // and add them to sum
        /**for (int i = 0; i < n; i++) {
            sum += myArray[i];
        }**/

        return num;

    }

}
