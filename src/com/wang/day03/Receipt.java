package com.wang.day03;
import com.wang.day04.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Receipt extends Test {

    public Receipt(){}

    public Receipt(String name, String id, Double price,int number){
        super();
    }

    public static void sc(String name, String id, Double price, int number) {
        double money = price * number;
        if (name.length() > 7) {
            String Name = name.substring(0, 7) + "...";
            System.out.println(Name + "   " + price + (" * ") + number + "\n" + '(' + id + "   )=     " + money);
        } else {
        }
        System.out.println(name + "   " + price + (" * ") + number + "\n" + '(' + id + "   )=     " + money);


    }

    public static void main(String[] args) {
        System.out.println("   欢  迎  光  临      ");
        System.out.println("品名     售价   数量    金额");
        System.out.println("----------------------------");

        Receipt sls = new Receipt("少林寺酥饼核桃","090115",15.50,22);

        sls.sc("少林寺酥饼核桃","090115",15.50,22);

        sls.setName("少林寺酥饼核桃");
        sls.setId("090115");
        sls.setPrice(15.50);
        sls.setNumber(22);

        double slsMoney = sls.getPrice() * sls.getNumer();
        if (sls.getName().length() > 7){
            String slsName = sls.getName().substring(0,7) + "...";
            System.out.println(slsName + "   " + sls.getPrice() + (" * ") + sls.getNumer() + "\n" + '(' + sls.getId() + "   )=     " + slsMoney);
        }else{
            System.out.println(sls.getName() + "   " + sls.getPrice() + (" * ") + sls.getNumer() + "\n" + '(' + sls.getId() + "   )=     " + slsMoney);
        }

        Test rgay = new Test();
        rgay.setName("然光a移");
        rgay.setId("090028");
        rgay.setPrice(16.00);
        rgay.setNumber(55);
        double rgayMoney = rgay.getPrice() * rgay.getNumer();

        if (rgay.getName().length() > 7){
            String rgayName = rgay.getName().substring(0,7) + "...";
            System.out.println(rgayName + "   " + rgay.getPrice() + (" * ") + rgay.getNumer() + "\n" + '(' + rgay.getId() + "   )=     " + rgayMoney);
        }else{
            System.out.println(rgay.getName() + "   " + rgay.getPrice() + (" * ") + rgay.getNumer() + "\n" + '(' + rgay.getId() + "   )=     " + rgayMoney);
        }

        Test skzl = new Test();
        skzl.setName("尚康杂粮牡丹饼");
        skzl.setId("090027");
        skzl.setPrice(14.50);
        skzl.setNumber(24);
        double skzlMoney = skzl.getPrice() * skzl.getNumer();

        if (skzl.getName().length() > 7){
            String skzlName = skzl.getName().substring(0,7) + "...";
            System.out.println(skzlName + "   " + skzl.getPrice() + (" * ") + skzl.getNumer() + "\n" + '(' + skzl.getId() + "   )=     " + skzlMoney);
        }else{
            System.out.println(skzl.getName() + "   " + skzl.getPrice() + (" * ") + skzl.getNumer() + "\n" + '(' + skzl.getId() + "   )=     " + skzlMoney);
        }

        System.out.println("------------------------");

        int totalItemsNumber = 3;
        int totalNumber = sls.getNumer() + rgay.getNumer() + skzl.getNumer();
        double totalmoney = slsMoney + rgayMoney + skzlMoney;
        double pay = 1600.00;

        if (totalmoney > 300 && totalmoney <= 600){
            totalmoney = totalNumber * 0.95;
        }else if (totalmoney > 1000 && sls.getNumer() > 30){
            totalmoney = totalmoney * 0.8 - 20;
        }else if (totalmoney <= 300){
            totalmoney = totalmoney;
        }else {
            totalmoney = totalmoney * 0.9;
        }
        totalmoney = Math.round(totalmoney);
        double change = pay - totalmoney;

        System.out.println("  " + totalItemsNumber + "  项产品        " + "共计:  " + totalNumber + "件");
        System.out.println("总记:  " + totalmoney);
        System.out.println("实付:  " + pay + "  找零: " + change);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(new Date()));

        System.out.println("凭此小票换取发票！");


        List<Double> a = new ArrayList<>();
        a.add(totalmoney);
        double sum = 0.0;

        System.out.println("请选择接下来的操作：1，继续购物；2：打印小票；3: 展示流水；4:展示总收入；5：直接退出");
        Scanner ss = new Scanner(System.in);
        int s = ss.nextInt();
        switch (s){
            case 1:
                System.out.println("请选择需要购买的商品");
                break;
            case 2:
                System.out.println("打印小票成功，请取出小票");
                break;
            case 5:
                System.out.println("祝您购物愉快，欢迎下次光临");
            case 3:
                for (int i = 0; i < a.size(); i++){
                    System.out.println("第" + (i+1) +"次销售额为" + a.get(i) + "元");
                    sum += a.get(i);
                }
                break;
            case 4:
                System.out.println("总收入为" + sum + "元");
        }
    }

}
