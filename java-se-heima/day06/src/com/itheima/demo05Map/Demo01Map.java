package com.itheima.demo05Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*
    Map的常用方法(重点)
    public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
    public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
    public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
    public boolean containKey(Object key):判断该集合中是否有此键。
    public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
 */
public class Demo01Map {
    public static void main(String[] args) {
        show05();
    }

    /*
        public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
        Collection<V> values():  获取Map集合中所有的值，存储到Collection集合中。
        int size()  获取Map集合的长度,键值对的个数
     */
    private static void show05() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",168);
        map.put("古力娜扎",165);
        map.put("冯提莫",150);
        map.put("唐嫣",178);
        Set<String> set = map.keySet();
        System.out.println(set);//[迪丽热巴, 冯提莫, 唐嫣, 古力娜扎]

        Collection<Integer> values = map.values();
        System.out.println(values);//[168, 150, 178, 165]

        System.out.println(map.size());//4
    }

    /*
        boolean containsKey(Object key) 判断集合中是否包含指定的key
        boolean containsValue(Object value) 判断集合中是否包含指定的value
        返回值:boolean
            包含,返回true
            不包含,返回false
     */
    private static void show04() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",168);
        map.put("古力娜扎",165);
        map.put("冯提莫",150);
        map.put("唐嫣",178);
        System.out.println(map.containsKey("唐嫣"));//true
        System.out.println(map.containsKey("柳岩"));//false
        System.out.println(map.containsValue(178));//true
        System.out.println(map.containsValue(188));//false
    }

    /*
        public V get(Object key):根据key,获取value值
        返回值:V(值)
            key存在,返回对应的value值
            key不存在,返回null
     */
    private static void show03() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",168);
        map.put("古力娜扎",165);
        map.put("冯提莫",150);
        map.put("唐嫣",178);

        Integer v1 = map.get("古力娜扎");
        System.out.println("v1:"+v1);//v1:165

        Integer v2 = map.get("马尔扎哈");
        System.out.println("v2:"+v2);//v2:null
    }

    /*
        public V remove(Object key): 根据key删除键值对,返回被删除健值对中值
        返回值:V(值)
            删除键值对存在,返回被删除健值对中值
            删除键值对不存在,返回null
     */
    private static void show02() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",168);
        map.put("古力娜扎",165);
        map.put("冯提莫",150);
        map.put("唐嫣",178);
        System.out.println(map);//{迪丽热巴=168, 冯提莫=150, 唐嫣=178, 古力娜扎=165}

        Integer v1 = map.remove("冯提莫");
        System.out.println("v1:"+v1);//v1:150
        System.out.println(map);//{迪丽热巴=168, 唐嫣=178, 古力娜扎=165}

        Integer v2 = map.remove("杨幂");
        System.out.println("v2:"+v2);//v2:null
        System.out.println(map);//{迪丽热巴=168, 唐嫣=178, 古力娜扎=165}
    }

    /*
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
        返回值:V(值)
            添加键值对key不重复,返回值V就是null
            添加键值对key重复,会使用新的vlaue,替换之前的vlaue,返回V被替换的值
     */
    private static void show01() {
        //创建HashMap集合对象
        HashMap<String,String> map = new HashMap<>();
        String v1 = map.put("黄晓明", "赵薇");
        System.out.println("v1:"+v1);//v1:null
        System.out.println(map);//{黄晓明=赵薇}

        String v2 = map.put("黄晓明", "杨颖");
        System.out.println("v2:"+v2);//v2:赵薇
        System.out.println(map);//{黄晓明=杨颖}
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        map.put("尹志平","小龙女");
        System.out.println(map);//{杨过=小龙女, 尹志平=小龙女, 郭靖=黄蓉, 张无忌=赵敏, 黄晓明=杨颖}
    }
}
