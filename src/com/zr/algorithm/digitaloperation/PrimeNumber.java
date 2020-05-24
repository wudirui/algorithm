package com.zr.algorithm.digitaloperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目描述：令Pi表示第i个素数。现任给两个正整数M <= N <= 10000，请输出PM到PN的所有素数。
 * <p>
 * 输入描述：输入在一行中给出M和N，其间以空格分隔。
 * <p>
 * 输出描述：输出从PM到PN的所有素数，每10个数字占1行，其间以空格分隔，但行末不得有多余空格。
 * <p>
 * 输入例子：5 27
 * <p>
 * 输出例子：
 * 11 13 17 19 23 29 31 37 41 43
 * 47 53 59 61 67 71 73 79 83 89
 * 97 101 103
 */
public class PrimeNumber {
    public static void main(String[] args) {
        findPrimeNumber();
    }

    /**
     * 找第m个素数到第n个的所有素数
     */
    public static void findPrimeNumber() {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        List<Integer> list = new ArrayList<>();
        int num = 3;
        int count = 1;
        if (first == count)
            list.add(2);

        while (true) {
            boolean b = true;
            s:
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    b = false;
                    break s;
                }
            }
            if (b) {
                count++;
                if (count >= first && count <= second)
                    list.add(num);
            }
            num++;
            if (count >= second)
                break;
        }

        int time = 1;
        for (int i = 0; i < list.size(); i++) {
            if (time % 10 == 0) {
                System.out.println(list.get(i));

            } else {
                if (time == list.size()) {
                    System.out.print(list.get(i));

                } else
                    System.out.print(list.get(i) + " ");
            }
            time++;
        }
    }

    /**
     * 找到m到n范围的所有素数
     */
    public static void findPrimeNumberOfMToN() {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        List<Integer> list = new ArrayList<>();
        if (first <= second) {
            for (int i = first; i <= second; i++) {
                if (i == 2) {
                    list.add(i);
                    continue;
                }
                boolean b = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    list.add(i);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}
