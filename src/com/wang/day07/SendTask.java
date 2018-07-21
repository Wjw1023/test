package com.wang.day07;

public class SendTask {
    private String odd;
    private Double weight;

    public void sendBefore (){
        System.out.println("货物检查完毕");
        System.out.println("快递单号检查完毕");
        System.out.println("活物填装完毕");
        System.out.println("货物人通知完毕");
    }
    public void send(Vehicle v){
        System.out.println("开始使用" + v.getType() + "发送货物");
        v.tr();
    }
    public void sendAfter(Vehicle v){
        System.out.println("满意度调查");
        System.out.println(v.getPc() + "已归还");
        v.keep();
    }
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd;
    }


}
