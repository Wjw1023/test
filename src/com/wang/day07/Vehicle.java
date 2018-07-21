package com.wang.day07;

public class Vehicle {
    private String num;
    private String type;
    private String pc;

    public void tr(){
        System.out.println("运输货物了！");
    }
    public void keep(){
        System.out.println("检查保养了！");
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
