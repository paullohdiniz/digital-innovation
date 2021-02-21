package br.com.innovation.colletion.br.com.innovation.colletion.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {
        Map<String, Integer> map02 = new HashMap<>();

        map02.put("Bra",5);
        map02.put("Fra",3);
        map02.put("Ale",2);
        map02.put("Bel",1);
        map02.put("Arg",2);
        map02.put("GO",null);

        System.out.println(map02);
        System.out.println(map02.get("Bra"));
        System.out.println(map02.get("GG"));
        System.out.println(map02.containsKey("Fra"));
        System.out.println(map02.containsValue("Bel"));

        for (Map.Entry<String, Integer> entry : map02.entrySet()){
            //entry.getKey() + " - " + entry.getValue();
        }
        for (String key : map02.keySet()){
            //map02.get(key);
        }
    }
}
