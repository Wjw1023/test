package com.wang.day06;

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
    static List<Double> d = new ArrayList<>();

    public static void main(String[] args) {
        Test t = new Test();
        t.init();
    }
    public static void check(){
        for (;;) {
            System.out.println();
            System.out.println("老板，请选择你要执行的操作：");
            System.out.println("1:流水查询 2：总收入查询 3：查询货物 4：添加新货物 5：删除货物 6：修改货物 7：退出查询");
            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            switch (c) {
                case 1:
                    showFlow();
                    check();
                    break;
                case 2:
                    showMoney();
                    check();
                    break;
                case 3:
                    query();
                    check();
                    break;
                case 4:
                    addGoods();
                    check();
                    break;
                case 5:
                    deleteGoods();
                    check();
                    break;
                case 6:
                    amend();
                    check();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    check();
            }
            break;
        }
    }

    public static void showFlow(){
        for (int i = 0; i < d.size(); i++){
            System.out.println("第" + (i+1) + "笔交易:" + d.get(i));
        }
    }

    public static void showMoney(){
        Double dd = 0.0;
        for (int i = 0; i < d.size(); i++){
            dd = dd + d.get(i);
        }
        System.out.println("今天的销售金额为：" + dd);
    }

    public static void query(){
        System.out.println("商品编号    商品名称    商品单价    计价单位");

        for (int i = 0; i < list.size(); i++){
            Test t = list.get(i);
            System.out.println(t.ID + "     " + t.name + "     " + t.prise + "      " + t.unit);
        }
    }

    public static void addGoods(){
        Test t = new Test();

        System.out.println("请输入新水果的名称：");
        Scanner sc = new Scanner(System.in);
        String nn = sc.nextLine();

        System.out.println("请输入新水果的编号：");
        Scanner sc1 = new Scanner(System.in);
        int ni = sc1.nextInt();

        System.out.println("请输入新水果的单价：");
        Scanner sc2 = new Scanner(System.in);
        Double nd = sc2.nextDouble();

        System.out.println("请输入新水果的计价单位：");
        Scanner sc3 = new Scanner(System.in);
        String nu = sc3.nextLine();

        t.name = nn;
        t.ID = ni;
        t.prise = nd;
        t.unit = nu;

        list.add(t);
        System.out.println("水果添加成功");
    }

    public static void deleteGoods(){
        System.out.println("请输入你要删除的水果编号");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        list.remove(x-1);
        System.out.println("水果信息删除完毕！");
    }

    public static void amend(){
        Test t = new Test();

        System.out.println("请输入你要修改的水果编号：");
        Scanner ss = new Scanner(System.in);
        int xi = ss.nextInt();
        list.remove(xi-1);
        System.out.println("请输入新的水果的名称：");
        Scanner sc = new Scanner(System.in);
        String nn = sc.nextLine();

        System.out.println("请输入新的水果的编号：");
        Scanner sc1 = new Scanner(System.in);
        int ni = sc1.nextInt();

        System.out.println("请输入新的水果的单价：");
        Scanner sc2 = new Scanner(System.in);
        Double nd = sc2.nextDouble();

        System.out.println("请输入新的水果的计价单位：");
        Scanner sc3 = new Scanner(System.in);
        String nu = sc3.nextLine();

        t.name = nn;
        t.ID = ni;
        t.prise = nd;
        t.unit = nu;

        list.add(t);
        System.out.println("水果信息修改完毕");
    }

    public static void init1(){
        System.out.println("            欢迎光临！");
        System.out.println("");
        System.out.println("请输入你的操作");
        System.out.println("1：买东西，重新购买 2：付款《打印小票》 3：放弃购买");
        System.out.println("");
        System.out.println("你输入的内容为：");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x){
            case 1:
                Test.buy();
                break;
            case 2:
                Test.print();
                break;
            case 3:
                break;
        }
    }

    public static void buy(){
        System.out.println();
        System.out.println("商品编号    商品名称    商品单价    计价单位");

        for (int i = 0; i < list.size(); i++){
            Test t = list.get(i);
            System.out.println(t.ID + "     " + t.name + "     " + t.prise + "      " + t.unit);
        }
        System.out.println("");
        System.out.println("             好消息！年底大促销：");
        System.out.println("    满300，打九五折！");
        System.out.println("    满600，打九折！！");
        System.out.println("    满1000，打八折！！！");
        System.out.println("    满1000且榴莲购买超过10个，立减50元！！！！");
        System.out.println("");

        for (;;){
            System.out.println();
            System.out.println("选定商品输入商品编号，如果选完请按0退出");
            System.out.println("\n" + "你的选择是：");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if (x == 0 ){
                Test.init1();
                break;
            }
            System.out.println("请输入你要购买的个数");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            list.get(x - 1).number = n;
        }
    }

    public static void print(){
        int x = 0;
        Double y = 0.0;
        Double z = 0.0;

        System.out.println("这是你这次的购物小票");
        System.out.println("==================================");
        System.out.println("           欢  迎  光  临");
        System.out.println("品名         售价    数量   金额");
        System.out.println("———————————--------");

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).number == 0){continue;}
            list.get(i).money = list.get(i).prise * list.get(i).number;
            x++;
            y = y + list.get(i).money;
            System.out.println(list.get(i).name + "<" + list.get(i).ID + ">      " + list.get(i).prise + "  *  " + list.get(i).number + "<" + list.get(i).unit + ">    =  " + list.get(i).money);
        }

        if (y >= 300 && y < 600){
            z = y * 0.95;
        }else if (y >= 600 && y < 1000){
            z = y * 0.9;
        }else if (y >= 1000 && list.get(0).number > 10){
            z = y * 0.8 - 50;
        }else if (y < 300){
            z = y;
        }else {
            z = y * 0.8;
        }

        d.add(z);

        System.out.println("-----------------------------");
        System.out.println(x + "项水果");
        System.out.println("总计：" + y + "元");
        System.out.println("优惠活动让你省了" + (y-z) + "元");
        System.out.println("==================================");
    }

    public static void init(){

        Test t1 = new Test();
        t1.ID = 1;
        t1.name = "泰国空运大榴莲";
        t1.prise = 120.0;
        t1.unit = "个";

        Test t2 = new Test();
        t2.ID = 2;
        t2.name = "昌平农家有机草莓";
        t2.prise = 20.0;
        t2.unit = "斤";

        Test t3 = new Test();
        t3.ID = 3;
        t3.name = "新疆原产哈密瓜";
        t3.prise = 7.0;
        t3.unit = "斤";

        list.add(t1);
        list.add(t2);
        list.add(t3);

        System.out.println("           欢迎使用《水果超市管理系统》！");
        System.out.println("请输入您的身份：");
        System.out.println("1：我是顾客，我要开始购物 2：我是老板，我要查货 3：退出系统");
        System.out.println();
        System.out.println("你输入的内容是：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        switch (x){
            case 1:
                Test.init1();
                break;
            case 2:
                Test.check();
                break;
            case 3:
                break;
        }
    }
}
