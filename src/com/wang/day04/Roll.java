package com.wang.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Roll {
    public static void main(String[] args) {
        List al = new ArrayList();
        al.add("张三");
        al.add("李四");
        al.add("王五");
        al.add("赵六");

        for (int i = 0; i <= 3; i++){
            System.out.print(al.get(i) + " ");
        }
        System.out.println();

        Random r = new Random();
        int rn = r.nextInt(4) + 1;

        System.out.println("随机点名   " + al.get(rn));
    }
}
