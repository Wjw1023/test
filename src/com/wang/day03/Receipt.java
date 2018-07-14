package com.wang.day03;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Receipt {

    public static void main(String[] args) {
        System.out.println("   欢  迎  光  临      ");
        System.out.println("品名     售价   数量    金额");
        System.out.println("----------------------------");

        String slsName = "少林寺酥饼核桃";
        String slsId = "090115";
        double slsPrice = 15.50;
        int slsNumble = 22;
        double slsMoney = slsPrice * slsNumble;
        if (slsName.length() > 7){
            slsName = slsName.substring(0,7) + "...";
        }
        System.out.println(slsName + "   " + slsPrice + (" * ") + slsNumble + "\n" + '(' + slsId + "   )=     " + slsMoney);

        String rgayName = "然光a移";
        String rgayId = "090028";
        double rgayPrice = 16.00;
        int rgayNumble = 55;
        double rgayMoney = rgayPrice * rgayNumble;
        if (rgayName.length() > 7){
            rgayName = rgayName.substring(0,7) + "...";
        }
        System.out.println(rgayName + "         " + rgayPrice + (" * ") + rgayNumble + "\n" + '(' + rgayId + "   )=     " + rgayMoney );

        String skzlName = "尚康杂粮牡丹饼";
        String skzlId = "090027";
        double skzlPrice = 14.50;
        int skzlNumble = 24;
        double skzlMoney = skzlPrice * skzlNumble;
        if (skzlName.length() > 7){
            skzlName = skzlName.substring(0,7) + "...";
        }

        System.out.println(skzlName + "   " + skzlPrice + (" * ") + skzlNumble + "\n" + '(' + skzlId + "   )=     " + skzlMoney);

        System.out.println("------------------------");

        int totalItemsNumber = 3;
        int totalNumber = slsNumble + rgayNumble + skzlNumble;
        double totalmoney = slsMoney + rgayMoney + skzlMoney;
        double pay = 1600.00;

        if (totalmoney > 300 && totalmoney <= 600){
            totalmoney = totalNumber * 0.95;
        }else if (totalmoney > 1000 && slsNumble > 30){
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

        System.out.println("请选择接下来的操作：1，继续购物；2：打印小票；3：直接退出");
        Scanner ss = new Scanner(System.in);
        int s = ss.nextInt();
        switch (s){
            case 1:
                System.out.println("请选择需要购买的商品");
                break;
            case 2:
                System.out.println("打印小票成功，请取出小票");
            case 3:
                System.out.println("祝您购物愉快，欢迎下次光临");
        }
    }

}
