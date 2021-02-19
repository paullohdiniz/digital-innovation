package br.com.innovation.colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        //List<String> nomes = Arrays.asList("Juliana", "Pedro", "Carlos", "Larrisa", "Joao");
        List<String> nomes = new ArrayList<>();

        //Carlos", "Pedro", "Maria", "Natália", "Diego", "Matheus",

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larrisa");
        nomes.add("Joao");

        //List<String> nomes02 = Arrays.asList("Ismael", "Rodrigo");
        List<String> nomes02 = new ArrayList<>();

        nomes02.add("Ismael");
        nomes02.add("Rodrigo");
        System.out.println(nomes);

        nomes.set(2, "Roberto");
        System.out.println(nomes);

        System.out.println(nomes.get(0));

        nomes.remove(3);
        System.out.println(nomes);

        nomes.remove(3);
        System.out.println(nomes);

        System.out.println(nomes.size());
        System.out.println(nomes.contains("Juliana"));
        System.out.println(nomes.addAll(nomes02));

        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println(nomes.isEmpty());
    }
}
