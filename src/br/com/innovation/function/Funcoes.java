package br.com.innovation.function;

import java.util.function.Function;
import java.util.function.Supplier;

public class Funcoes {

    public static void main(String[] args) {
        Function<String, String> invertString = nome -> new StringBuffer(nome).reverse().toString();
        Function<String, Integer> convertInteger = valor -> Integer.valueOf(valor);

        System.out.println(invertString.apply("Paulo"));
        System.out.println(convertInteger.apply("1234567"));
    }
}
