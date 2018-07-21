package com.wang.day15;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Poker {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("♠");
        color.add("♥");
        color.add("♦");
        color.add("♣");

        List<String> num = new ArrayList<>();
        Collections.addAll(num,"3","4","5","6","7","8","9","10","J","Q","K","A","2");

        HashMap<Integer,String> map = new HashMap<>();

        int index = 0;
        for (String thisNum : num){
            for (String thisColor : color){
                map.put(index++,thisColor + thisNum);
            }
        }

        map.put(index++, "小☺");
        map.put(index++, "大☻");

        List<Integer> card = new ArrayList<>();
        for (int i = 0; i < 54; i++){
            card.add(i);
        }
        Collections.shuffle(card);

        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();
        List<Integer> secretCards = new ArrayList<>();

        for (int i = 0; i < card.size(); i++){
            if (i < 3){
                secretCards.add(card.get(i));
            }else {
                if (i % 3 == 0){
                    player1.add(card.get(i));
                }else if (i % 3 == 1){
                    player2.add(card.get(i));
                }else {
                    player3.add(card.get(i));
                }
            }
        }

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);

        List<String> sPlayer1 = new ArrayList<>();
        List<String> sPlayer2 = new ArrayList<>();
        List<String> sPlayer3 = new ArrayList<>();
        List<String> sSecretCards = new ArrayList<>();

        for (Integer key1 :
                player1) {
            sPlayer1.add(map.get(key1));
        }

        for (Integer key2 :
                player2) {
            sPlayer2.add(map.get(key2));
        }

        for (Integer key3 :
                player3) {
            sPlayer3.add(map.get(key3));
        }

        for (Integer key4 :
                secretCards) {
            sSecretCards.add(map.get(key4));
        }

        System.out.println(sPlayer1);
        System.out.println(sPlayer2);
        System.out.println(sPlayer3);
        System.out.println(sSecretCards);


    }

}
