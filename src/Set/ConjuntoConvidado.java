package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado>  convidadosSet;

    public ConjuntoConvidado() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }
    

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoRemover = null;
        for(Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoRemover = c;
                break;
            }
        }
        convidadosSet.remove((convidadoRemover));
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidado conjunto = new ConjuntoConvidado();

        conjunto.adicionarConvidado("pablo",39823);
        conjunto.adicionarConvidado("Maria", 12345);
        conjunto.adicionarConvidado("Ana", 44212);

        System.out.println("total convidados");
        System.out.println(conjunto.contarConvidados());
        
        System.out.println("removendo por codigo de convide");
        conjunto.removerConvidadoPorCodigoConvite(44212);

        
        System.out.println(conjunto.contarConvidados());

        
        System.out.println("exibir convidados");
        conjunto.exibirConvidados();
    }
}
