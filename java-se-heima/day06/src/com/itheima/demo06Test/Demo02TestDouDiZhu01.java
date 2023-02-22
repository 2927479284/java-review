package com.itheima.demo06Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
    斗地主综合案例
        1.准备牌
        2.洗牌
        3.发牌
        4.排序
        5.看牌
 */
public class Demo02TestDouDiZhu01 {
    public static void main(String[] args) {
        HashMap<Integer, String> jihePai = new HashMap<>();
        //储存牌的索引
        ArrayList<Integer> suoyin = new ArrayList<>();
        int index = 0;
        jihePai.put(index,"小王");
        suoyin.add(index);
        index++;
        jihePai.put(index,"大王");
        suoyin.add(index);
        index++;
        //保存13张牌的集合
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        //保存4种花色 13张牌每个四种
        ArrayList<String> strings1 = new ArrayList<>();
        Collections.addAll(strings1,"♠","♥","♣","♦");
        //for循环开始生成所有牌
        for (String pai : strings) {
            for (String huase : strings1) {
                jihePai.put(index,huase+" "+pai);
                suoyin.add(index);
                index++;
            }
        }

        //54张牌生成成功
        //开始洗牌 洗的是所有牌的索引
        Collections.shuffle(suoyin);
        //3.发牌
        //定义4个List集合,存储玩家的牌和底牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //遍历存储牌索引的ArrayList集合,获取每一个牌的索引
        for (int i = 0; i < suoyin.size(); i++) {
            Integer paiIndex = suoyin.get(i);
            //判断集合的索引>=51,给底牌发牌
            if(i>=51){
                diPai.add(paiIndex);
            }else if(i%3==0){
                //判断集合的索引%3==0,给玩家1发牌
                player01.add(paiIndex);
            }else if(i%3==1){
                //判断集合的索引%3==1,给玩家2发牌
                player02.add(paiIndex);
            }else if(i%3==2){
                //判断集合的索引%3==2,给玩家3发牌
                player03.add(paiIndex);
            }
        }
        //System.out.println(player01);
        //System.out.println(player02);
        //System.out.println(player03);
        //System.out.println(diPai);

        //4.排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);
        //System.out.println(player01);
        //System.out.println(player02);
        //System.out.println(player03);
        //System.out.println(diPai);

        //5.看牌:调用看牌方法
        lookPoker("小明",jihePai,player01);
        lookPoker("张三",jihePai,player02);
        lookPoker("junjun",jihePai,player03);
        lookPoker("底牌",jihePai,diPai);

    }

    /*
        定义一个看牌的方法
        参数:
            String name:玩家姓名
            HashMap<Integer,String> poker:存储牌的Map集合
            ArrayList<Integer> list:玩家的牌|底牌
        查表法:
            遍历玩家牌的集合|底牌的集合,获取Map集合中每一个key
            根据key(牌的索引),获取value(组装好的牌)
     */
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        //打印玩家姓名,不换行
        System.out.print(name+": ");
        //遍历玩家牌的集合|底牌的集合,获取Map集合中每一个key
        for (Integer key : list) {
            //根据key(牌的索引),获取value(组装好的牌)
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        //打印完每个玩家的牌,换行
        System.out.println();
    }
}
