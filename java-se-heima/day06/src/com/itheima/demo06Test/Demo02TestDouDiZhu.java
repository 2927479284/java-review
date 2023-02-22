package com.itheima.demo06Test;

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
public class Demo02TestDouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个Map集合,key:牌的索引,value:准备好的牌
        HashMap<Integer,String> poker = new HashMap<>();
        //定义一个List集合,存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义一个int类型的变量index,初始值为0,记录牌的索引
        int index = 0;
        //往集合中添加大王和小王
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //定义一个集合,存储牌的13个序号
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        //定义一个集合,存储牌的4个花色
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"♠","♥","♣","♦");
        //循环嵌套遍历两个集合,组装52牌
        for (String number : numbers) {
            for (String color : colors) {
                //System.out.println(color+number);
                //把组装好52张牌,存储到集合中
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
        //System.out.println(poker);
        //System.out.println(pokerIndex);

        //2.洗牌
        Collections.shuffle(pokerIndex);
        //System.out.println(pokerIndex);

        //3.发牌
        //定义4个List集合,存储玩家的牌和底牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //遍历存储牌索引的ArrayList集合,获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer paiIndex = pokerIndex.get(i);
            //判断集合的索引>=51,给底牌发牌
            if(i>51){
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
        lookPoker("刘德华",poker,player01);
        lookPoker("周润发",poker,player02);
        lookPoker("周星驰",poker,player03);
        lookPoker("底牌",poker,diPai);
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
