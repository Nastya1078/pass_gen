package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("введите длину пароля");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Вы ввели: " + number);
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]);
        }

    }
}
