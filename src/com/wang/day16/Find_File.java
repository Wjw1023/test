package com.wang.day16;

import java.io.File;
import java.util.Scanner;

public class Find_File {
    static int dirCount = 0;
    static int fileCount = 0;

    public static void main(String[] args) {
        while (true){
            System.out.println("请输入一个文件夹目录：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            System.out.println("请输入关键字：");
            Scanner s = new Scanner(System.in);
            String k = s.nextLine();

            File file = new File(line);
            if (file.exists()){
                if (file.isFile()){
                    System.out.println("请输入一个文件夹目录：");
                    continue;
                }else {
                    find(file,k);
                    break;
                }
            }
        }
    }
    public static void find(File file,String key) {

        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                String fileName = f.getName();
                if (fileName.contains(key)){
                    String prefix = "";
                    if (f.isDirectory()){
                        prefix = "目录";
                        dirCount++;
                    }else {
                        prefix = "文件";
                        fileCount++;
                    }
                    System.out.println(prefix + ": " + f.getAbsolutePath());
                }
                if (f.isDirectory()){
                    find(f,key);
                }
            }
        }
    }
}
