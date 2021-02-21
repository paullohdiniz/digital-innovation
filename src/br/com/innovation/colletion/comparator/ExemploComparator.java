package br.com.innovation.colletion.comparator;

import br.com.innovation.colletion.Estudante;

import java.util.*;

public class ExemploComparator {

    public static void main(String[] args) {
        List<Estudante> est = new ArrayList<>();

        est.add(new Estudante("Paulo",40));
        est.add(new Estudante("Karine",31));
        est.add(new Estudante("Kelly",40));
        est.add(new Estudante("Karen",25));
        est.add(new Estudante("Maria",51));
        est.add(new Estudante("Miguel",38));

        System.out.println(est);

        est.sort((first,second)     ->   first.getIdade() - second.getIdade());
        System.out.println("Ordenacao por idade");
        System.out.println(est);

        est.sort((first,second)     ->    second.getIdade() - first.getIdade());
        System.out.println("Ordenacao reversa por idade");
        System.out.println(est);

        est.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("Ordenacao method reference");
        System.out.println(est);

        est.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("Ordenacao reversa method reference");
        System.out.println(est);

        //Ordenacao interface Comparable
        Collections.sort(est);
        System.out.println("Ordenacao interface Comparable");
        System.out.println(est);

        //um inteiro negativo, zero ou um inteiro positivo como o primeiro argumento é menor, igual ou maior que o segundo.
        //Comparator.compare();

        Collections.sort(est, new EstudanteOrdemIdadeReservaComparator());
        System.out.println("Ordenacao interface Comparable");
        System.out.println(est);
    }
}
