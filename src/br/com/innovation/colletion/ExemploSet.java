package br.com.innovation.colletion;

import java.util.*;
import java.util.stream.Stream;

public class ExemploSet {


    //Set nao garante a ordem e sim a performance
    //Nao permite itens repetido. Faz a verificaçao antes
    //Tem add e remove / Nao tem busca e atualizacao
    //Nao permite mudanca de ordencao
    public static void main(String[] args) {
        HashSet<Double> notas = new HashSet<>();

        notas.add(5.8);
        notas.add(7.2);
        notas.add(8.0);
        notas.add(4.5);
        notas.add(10.0);
        notas.add(8.8);
        notas.add(null);

        //Collections.sort(notas);
        System.out.println(notas);
        notas.add(8.8);
        System.out.println(notas);
        notas.remove(8.8);
        System.out.println(notas);

//        for(Double nota : notas){
//            System.out.println(nota);
//        }

        /*
            LinkedHashSet
         */
        LinkedHashSet<Integer> sequencia = new LinkedHashSet<>();
        sequencia.add(4);
        sequencia.add(7);
        sequencia.add(6);
        sequencia.add(1);
        sequencia.add(10);

        System.out.println(sequencia);

        sequencia.remove(1);
        System.out.println(sequencia);

        /*
            LinkedHashSet
         */

        TreeSet<String> tree = new TreeSet<>();

        tree.add("Florianopolis");
        tree.add("Porto Alegre");
        tree.add("Curitiba");
        tree.add("Sao Paulo");
        tree.add("Rio de Janeiro");
        tree.add("Belo Horizonte");

        System.out.println(tree);

        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.lower("Porto Alegre"));
        System.out.println(tree.higher("Porto Alegre"));
        System.out.println(tree.pollFirst());
        System.out.println(tree.pollLast());
        System.out.println(tree);

        for(String tr : tree){
            System.out.println(tr.toUpperCase());
        }

    }

}
