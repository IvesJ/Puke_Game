package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Puke {
    public List<String> pukeList;

    public Puke(){
        this.pukeList = new ArrayList<>();
    }

    public void setPukeList(){
        System.out.println("-------------------创建扑克----------------------");
            String[] HuaSe = {"方片","梅花","红桃","黑桃"};
            for (String huase:HuaSe) {
                for (int i = 2; i < 15 ; i++){
                    String str = huase;
                    if (i < 11) {
                        str += i;
                    } else {
                        switch (i) {
                            case 11:
                                str += "J";
                                break;
                            case 12:
                                str += "Q";
                                break;
                            case 13:
                                str += "K";
                                break;
                            case 14:
                                str += "A";
                                break;
                        }
                    }
                    pukeList.add(str);
                }
            }
        System.out.println("-------------------创建扑克牌成功！----------------------");
        System.out.print("为：[");
        for (String strList:pukeList) {
            System.out.print(strList + " ");
        }
        System.out.println("]");
    }

    public void Shuffle(){
        System.out.println("-------------------开始洗牌----------------------");
        Collections.shuffle(pukeList);
        System.out.println("-------------------洗牌结束！----------------------");
    }

    public static void main(String[] args){
        Puke puke = new Puke();
        puke.setPukeList();
        puke.Shuffle();
    }
}
