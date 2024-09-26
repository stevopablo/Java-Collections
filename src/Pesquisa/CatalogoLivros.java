package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String autor, String titulo, int anoPublicacao) {
        livroList.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicio, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervaloAnos.add(l);
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorLivro(String titulo) {
        for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;  
    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();
        livros.adicionarLivro("auto 1",  "materia escura", 2017);
        livros.adicionarLivro("auto 2",  "alem do espaço", 2007);
        livros.adicionarLivro("auto 2",  "alem do espaço", 2007);
        livros.adicionarLivro("auto 2",  "alem do espaço", 2007);
        livros.adicionarLivro("auto 3",  "materia branca", 2014);

        System.out.println(livros.pesquisarPorAutor("autor 2"));

        System.out.println(livros.pesquisarPorIntervaloAnos(2007, 2014));
        System.out.println(livros.pesquisarPorLivro("materia escura"));
    }
}
