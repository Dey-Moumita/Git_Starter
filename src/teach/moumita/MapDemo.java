package teach.moumita;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(101,"Soumya");//put method is working like add method here
        map.put(102,"Soumya");
        map.put(103,"Moumita");
        map.put(103,"Mona");//map does not contain duplicate key that's why when duplicate key arrives it'll replaced the first value with the second value
        //map.clear();//it's clear the all map
        map.put(null,"null");
        map.put(null,"apple");
        //in map duplicate values can be inserted but duplicate keys can not
        System.out.println(map.containsKey(102));
        System.out.println(map.containsValue("Soumyadeep"));
        System.out.println(map.get(101));
        System.out.println(map);

    }
}
