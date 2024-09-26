package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade); 
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);  
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());  
        return pessoaPorAltura;
    }
    
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacao = new OrdenacaoPessoa();
        
        ordenacao.adicionarPessoa("Ana", 25, 1.68);
        ordenacao.adicionarPessoa("Bruno", 30, 1.75);
        ordenacao.adicionarPessoa("Carla", 22, 1.60);
        ordenacao.adicionarPessoa("Maria", 2, 90);
        System.out.println("Ordenado por Idade:");
        List<Pessoa> porIdade = ordenacao.ordenarPorIdade(); 
        for (Pessoa pessoa : porIdade) {
            System.out.println(pessoa);
        }
        
        System.out.println("\nOrdenado por Altura:");
        List<Pessoa> porAltura = ordenacao.ordenarPorAltura();
        for (Pessoa pessoa : porAltura) {
            System.out.println(pessoa);
        }
    }
    }
