package teach.moumita;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

       // HashMap hashMap = new HashMap();
        HashMap<Integer,String> hashMap = new HashMap();
        hashMap.put(1,"apple");
        hashMap.put(2,"banana");
        hashMap.put(3,"mango");
        hashMap.put(4,"watermelon");
        System.out.println(hashMap);
        for(Map.Entry entry :hashMap.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

//        Set set = hashMap.entrySet();
//        System.out.println(set);
//
//        Iterator iterator = set.iterator();
//        while(iterator.hasNext())
//        {
//            //System.out.println(iterator.next());
//            Map.Entry entry = (Map.Entry) iterator.next();//eta typecast korahyeche Map.Entry
//            System.out.println(entry.getKey()+" -> "+entry.getValue());
//        }

    }
}
