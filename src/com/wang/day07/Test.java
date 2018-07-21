package com.wang.day07;

public class Test {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        SendTask st = new SendTask();
        v.setNum("001");
        v.setType("bmw");
        v.setPc("张三");

//        v.tr();
//        v.keep();

        st.setOdd("12345");
        st.setWeight(4.3);

        st.sendBefore();
        System.out.println("-----------------");
        st.send(v);
        System.out.println("==================");
        st.sendAfter(v);

    }
}
