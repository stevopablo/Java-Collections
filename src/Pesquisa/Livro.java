package Pesquisa;

public class Livro {
    private String autor;
    private String titulo;
    private int anoPublicacao;



    
    public String getAutor() {
        return autor;
    }
        
    public String getTitulo() {
        return titulo;
    }


    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    
    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", titulo=" + titulo + ", anoPublicacao=" + anoPublicacao + "]";
    }

    public Livro(String autor, String titulo, int anoPublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    
}
