package br.com.innovation.future;

import br.com.innovation.function.Atividade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExemploFuture {

    private static final ExecutorService executor = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        ExecutorService executorService;
    }
}

interface AtividadeCasa{
    void realizar();
}

class Casa{
    private List<Comodo> comodos;

    Casa(Comodo... comodos){
        this.comodos = Arrays.asList(comodos);
    }
    List<AtividadeCasa> obterAFazeresCasa() {

        return this.comodos.stream()
                .map(Comodo::obterAtividadesCasa)
                .reduce(new ArrayList<AtividadeCasa>(), (pivo, atividades) -> {
                   pivo.addAll(atividades);
                   return pivo;
                });
    }
}

abstract class Comodo{
    abstract List<AtividadeCasa> obterAtividadesCasa();
}

class Quardo extends Comodo {

    @Override
    List<AtividadeCasa> obterAtividadesCasa() {
        return Arrays.asList(
          this::arrumarCama,
          this::arrumarGuardaRoupa,
          this::varrerQuarto
        );
    }

    private void arrumarGuardaRoupa(){
        System.out.println("Arrumar guarda roupa!");
    }
    private void varrerQuarto(){
        System.out.println("Varrer quarto!");
    }
    private void arrumarCama(){
        System.out.println("Arrumar cama");
    }

}

