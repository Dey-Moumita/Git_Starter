package teach.moumita;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(1,"apple");
        map.put(3,"mango");
        map.put(2,"avogado");
        map.put(4,"litchi");

//        map.put("apple",1);
//        map.put("mango",2);
//        map.put("avogado",3);

        System.out.println(map);//it has default sorting order
        System.out.println(map.ceilingEntry(2));//it returns greater or equals value
        System.out.println(map.ceilingKey(1));
        System.out.println(map.firstEntry());//it returns proper value
        System.out.println(map.floorEntry(5));//it returns lesser or equals value
//        System.out.println(map.get(2));
//        System.out.println(map.get(7));
        System.out.println(map.headMap(2));//it returns a sorted map which is store first element
        System.out.println(map.getOrDefault(5,"banana"));
        System.out.println(map.higherEntry(2));//it returns only greater value
        System.out.println(map.keySet());
//        System.out.println(map.pollFirstEntry());//it shows what it removes
//        System.out.println(map);
//        map.remove(1);
//        System.out.println(map);
        System.out.println(map.subMap(1,3));
        map.replace(3,"watermelon");
        System.out.println(map);
        System.out.println(map.size());

//        map.clear();
//        System.out.println(map);
    }
}
