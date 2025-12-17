package teach.moumita;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,4,5};

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer arrayElement : arr){
            if (map.containsKey(arrayElement)==false){
                map.put(arrayElement,1);
            }
            else{
                map.put(arrayElement,map.get(arrayElement)+1);
            }
        }

        System.out.println("The elements and their frequency are: ");
        System.out.println(map);

    }
}
