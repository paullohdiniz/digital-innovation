package br.com.innovation.colletion;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        //FIFO
        LinkedList<String> fila = new LinkedList();
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("Joao");

        System.out.println(filaBanco);

        String clienteAt = filaBanco.poll(); // Obtem elemento e remove da fila
        System.out.println(clienteAt);
        System.out.println(filaBanco);

        String getCliente = filaBanco.peek(); // Obtem elemento e nao remove da fila
        System.out.println(getCliente);
        System.out.println(filaBanco);

        String getClienteThrow = filaBanco.element(); // Obtem elemento e nao remove da fila. Lança exceçao


    }
}
