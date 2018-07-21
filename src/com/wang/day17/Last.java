package com.wang.day17;

import java.io.File;
import java.util.Scanner;

public class Last {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入要搜索的文件夹位置：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            File file = new File(line);
            if (file.isDirectory()) {
                System.out.println("请输入后缀名：");
                Scanner s = new Scanner(System.in);
                String key = s.nextLine();
                find(file, key);
                break;
            } else
                System.out.print("输入错误，");
        }
    }
    public static void find(File file, String key) {
        File[] files = file.listFiles();
        for (File f : files) {
            String fileName = f.getName().substring(f.getName().lastIndexOf('.') + 1);
             if (key.equals(fileName)) {
                System.out.println(f.getAbsolutePath());
            }
            if (f.isDirectory()) {
                find(f, key);
            }

        }
    }
}
