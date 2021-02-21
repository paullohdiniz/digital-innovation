package br.com.innovation.colletion.comparator;

import br.com.innovation.colletion.Estudante;

import java.util.Comparator;

public class EstudanteOrdemIdadeReservaComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }
}
