package br.com.innovation.colletion.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();
        List<String> frutas = new ArrayList<>();

        estudantes.add("Paulo");
        estudantes.add("Thais");
        estudantes.add("Kelly");
        estudantes.add("Karine");
        estudantes.add("Karen");
        estudantes.add("Maria");
        estudantes.add("Joao");
        estudantes.add("Davi");
        estudantes.add("Jo");

        System.out.println("Contagem: " + estudantes.stream().count());

        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Menor numero de letras: : " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Lista com R: " + estudantes.stream().filter(estudante->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList())
        );

        System.out.println("Concatena com qte de letras: " + estudantes.stream().map(estudante->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList())
        );

        System.out.println("Lista via peek: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Imprime todos
        estudantes.stream().forEach(System.out::println);

        System.out.println("Concatena com qte de letras: " + estudantes.stream()
                .map(estudante->
                    estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .filter(estudante ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList())

        );

        frutas.add("Maça");
        frutas.add("Laranja");
        frutas.add("Banana");
        frutas.add("Limao");

        System.out.println(frutas.stream().collect(Collectors.groupingBy(fruta -> fruta.substring(0, 1))));

    }
}
