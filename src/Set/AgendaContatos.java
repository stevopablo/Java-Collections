package Set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        contatoSet = new HashSet<>();        
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
        System.out.println("Contato adicionado: " + nome);
    }
    
    public void exibirContato() {
        System.out.println("Lista de contatos:");
        for (Contato contato : contatoSet) {
            System.out.println("Nome: " + contato.getNome() + ", Número: " + contato.getNumero());
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(numero);
                contatoAtualizado = c;
                System.out.println("Número atualizado para o contato: " + nome);
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("junlee", 123511213); 
        contatos.adicionarContato("rbiana", 192810951); 
        contatos.adicionarContato("maicon", 624534314); 

        System.out.println("Exibir contatos");
        contatos.exibirContato();

        System.out.println("Pesquisar por ");
        Set<Contato> resultadosPesquisa = contatos.pesquisarPorNome("junlee");
        for (Contato contato : resultadosPesquisa) {
            System.out.println("Encontrado: " + contato.getNome() + ", Número: " + contato.getNumero());
        }

        System.out.println("Atualizar número ");
        contatos.atualizarNumeroContato("rbiana", 343623424);

        System.out.println("Exibir contatos atualizados");
        contatos.exibirContato();
    }
}
