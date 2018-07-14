package com.wang.day03;

import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Random r = new Random();
        int rn = r.nextInt(100) + 1;
        int temp = 1;

        for (int i = 0; i < 5; i++){
            System.out.println("请输入一个1-100的整数");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (temp == 5){
                System.out.println("sorry,你没有机会了");
                break;
            }
            if (a == rn){
                System.out.println("恭喜您，答对了！");
                break;
            }else if (a > rn){
                temp++;
                System.out.println("sorry,你猜大了");
                continue;
            }else if(a < rn){
                    temp++;
            System.out.println("sorry,你猜小了");
            continue;
        }

    }
    }
}