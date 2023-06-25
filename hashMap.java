package Hashing;

import java.util.*;
public class hashMap {
    public static void main(String[] args) {

        // country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US",30);
        map.put("China",150);
        map.put("China",180);

        // Search or lookup
//        if (map.containsKey("China")){
//            System.out.println("yes it has");
//        }
//        else {
//            System.out.println("nope it's not there");
//        }

//        System.out.println(map.get("China")); // key exists
//        System.out.println(map.get("Chinaa")); // key not exists

        int [] arr = {12,15,18};
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int val : arr){
//            System.out.print(val + " ");
//        }
//        System.out.println();


        for (Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println();
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        map.remove("China");
        System.out.println(keys);

        System.out.println();
        System.out.println(map);
    }
}
