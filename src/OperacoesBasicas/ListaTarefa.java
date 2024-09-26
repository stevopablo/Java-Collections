package OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    private List<Tarefa> ListaTarefa;
    
    public ListaTarefa(){
    this.ListaTarefa = new ArrayList<>();}

    public void AdicionarTarefa(String descricao){
        ListaTarefa.add(new Tarefa(descricao));
    }

    public void RemoverTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : ListaTarefa){
            if(t.toString().equalsIgnoreCase(descricao));
            tarefasParaRemover.add(t);
        }
        ListaTarefa.removeAll(tarefasParaRemover);
    }

    public int ObterNumeroTotal(){
        return ListaTarefa.size();
    }

    public void ObterDescricao(){
        System.out.println(ListaTarefa);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("número total de elementos na lista: "+listaTarefa.ObterNumeroTotal());
        listaTarefa.AdicionarTarefa("tarefa 1");
        listaTarefa.AdicionarTarefa("tarefa 1");
        listaTarefa.AdicionarTarefa("tarefa 1");
        listaTarefa.AdicionarTarefa("tarefa 2");
        
        System.out.println("número total de elementos na lista: "+listaTarefa.ObterNumeroTotal());

        listaTarefa.RemoverTarefa("tarefa 1");
        System.out.println("número total de elementos na lista: "+listaTarefa.ObterNumeroTotal());

        System.out.println("Descricoes da tarefas: " + listaTarefa.toString());
    }
}

