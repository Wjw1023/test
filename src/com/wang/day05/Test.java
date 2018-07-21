package com.wang.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    String name;
    int ID;
    Double prise;
    String unit;
    int number;
    Double money;
    Double allMoney = 0.0;
    static List<Test> list = new ArrayList<>();

    public static void main(String[] args) {
        Test t = new Test();
        t.init();
        t.buy();
    }
    public static void check(){
        for (;;){
            System.out.println();
            System.out.println("老板，请选择你要执行的操作：");
            System.out.println("1:流水查询 2：总收入查询 3：库存货物 4：添加新货物 5：退出查询");
            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            switch (c){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("请重新输入");
            }
        }
    }
    public static void showFlow(){
        System.out.println();
    }

    public static void showMoney(){
        Test t = new Test();
    }

    public static void add() {
        Test newTest = new Test();
        newTest.ID = list.size() + 1;

        System.out.println("请输入物品名称");
        Scanner sc1 = new Scanner(System.in);
        String na = sc1.nextLine();

        System.out.println("请输入物品单价");
        Scanner sc2 = new Scanner(System.in);
        Double pr = sc2.nextDouble();

        System.out.println("请输入物品计价单位");
        Scanner sc3 = new Scanner(System.in);
        String un = sc3.nextLine();

        list.add(newTest);
    }

    public static void buy(){
        System.out.println();
        System.out.println("商品编号    商品名称    商品单价    计价单位");
        for (int i = 0; i < list.size(); i++){
            Test t = list.get(i);
            System.out.println(t.ID + "     " + t.name + "     " + t.prise + "      " + t.unit);
        }
        for (;;){
            System.out.println();
            System.out.println("选定商品输入商品编号，如果选完请按0退出");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if (x == 0 ){
                break;
            }
            System.out.println("请输入你要购买的个数");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            list.get(x - 1).number = n;
        }
    }

    public static void init(){

        Test t1 = new Test();
        t1.ID = 1;
        t1.name = "少林寺酥饼核桃";
        t1.prise = 15.5;
        t1.unit = "个";

        Test t2 = new Test();
        t2.ID = 2;
        t2.name = "然光a移";
        t2.prise = 16.0;
        t2.unit = "个";

        Test t3 = new Test();
        t3.ID = 3;
        t3.name = "尚康杂粮牡丹饼";
        t3.prise = 14.5;
        t3.unit = "个";

        list.add(t1);
        list.add(t2);
        list.add(t3);
    }
}
