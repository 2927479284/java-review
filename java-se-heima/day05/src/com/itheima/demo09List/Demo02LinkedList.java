package com.itheima.demo09List;

import java.util.LinkedList;

/*
    LinkedList集合中有一些操作首尾元素的特有方法:
        public void addFirst(E e) :将指定元素插入此列表的开头。
        public void push(E e) :将元素推入此列表所表示的堆栈。
        public void addLast(E e) :将指定元素添加到此列表的结尾。

        public E getFirst() :返回此列表的第一个元素。
        public E getLast() :返回此列表的最后一个元素。

        public E removeFirst() :移除并返回此列表的第一个元素。
        public E pop() :从此列表所表示的堆栈处弹出一个元素。
        public E removeLast() :移除并返回此列表的最后一个元素。

        public boolean isEmpty() ：如果列表不包含元素，则返回true。
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show04();
    }

    /*
        public E removeFirst() :移除并返回此列表的第一个元素。
        public E pop() :从此列表所表示的堆栈处弹出一个元素。此方法等效于 removeFirst()。
        public E removeLast() :移除并返回此列表的最后一个元素。
     */
    private static void show04() {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("aaa");
        linked.add("bbb");
        linked.add("ccc");
        linked.add("ddd");
        System.out.println(linked);//[aaa, bbb, ccc, ddd]
        //String a = linked.removeFirst();
        String a = linked.pop();
        System.out.println("a:"+a);//a:aaa
        System.out.println(linked);//[bbb, ccc, ddd]

        String b = linked.removeLast();
        System.out.println("b:"+b);//b:ddd
        System.out.println(linked);//[bbb, ccc]
    }

    /*
        public E getFirst() :返回此列表的第一个元素。
        public E getLast() :返回此列表的最后一个元素。
     */
    private static void show03() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("aaa");
        linked.add("bbb");
        linked.add("ccc");
        linked.add("ddd");

        linked.clear();//清空集合

        //为了防止NoSuchElementException:没有这个元素异常,增加一个判断
        if(!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println("first:"+first);//first:aaa

            String last = linked.getLast();
            System.out.println("last:"+last);//last:ddd
        }

        if(linked.size()!=0){
            String first = linked.getFirst();
            System.out.println("first:"+first);//first:aaa

            String last = linked.getLast();
            System.out.println("last:"+last);//last:ddd
        }
    }

    private static void show02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.addFirst("a");
        linked.addFirst("b");
        linked.addFirst("c");
        linked.addFirst("d");
        linked.addLast("1");
        linked.addLast("2");
        linked.addLast("3");
        System.out.println(linked);//[d, c, b, a, 1, 2, 3]
    }

    /*
        public void addFirst(E e) :将指定元素插入此列表的开头。
        public void push(E e) :将元素推入此列表所表示的堆栈。此方法等效于 addFirst(E)。
        public void addLast(E e) :将指定元素添加到此列表的结尾。
     */
    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("aaa");
        linked.add("bbb");
        linked.add("ccc");
        linked.add("ddd");
        System.out.println(linked);//[aaa, bbb, ccc, ddd]

        //public void addFirst(E e) :将指定元素插入此列表的开头。
        //linked.addFirst("www");
        linked.push("www");
        System.out.println(linked);//[www, aaa, bbb, ccc, ddd]

        //public void addLast(E e) :将指定元素添加到此列表的结尾。
        linked.addLast("com");
        System.out.println(linked);//[www, aaa, bbb, ccc, ddd, com]
    }
}
