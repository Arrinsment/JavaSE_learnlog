package com.itihema.arithmeticoporator;

import java.util.Scanner;

public class arithmeticoporatorDemo1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("输入你的座位");
        int a = SC.nextInt();
        if (a <= 200) {
            if (a % 2 == 0) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        }
    }
