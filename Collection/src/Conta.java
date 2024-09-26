import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
    private static Scanner input = new Scanner(System.in);
    private ArrayList<ContaCorrente> contaList;

    public Conta() {
        this.contaList = new ArrayList<>();
    }

    public void adicionarConta(String nome, int agencia, double saldo ){
        ContaCorrente novaConta = new ContaCorrente(nome, agencia, saldo);
        contaList.add(novaConta);
    }

    public void exibirContas(){
        System.out.println(contaList);
    }

    public ContaCorrente pesquisarPorNome(String nome) {
        ContaCorrente pesquisarNome = null;  
        for (ContaCorrente c : contaList) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                pesquisarNome = c; 
                break; 
            }
        }
        return pesquisarNome;
    }


    public void removerConta(String nome) {
        ContaCorrente conta = pesquisarPorNome(nome);
        if (conta != null) {
            contaList.remove(conta);
            System.out.println("Conta removida com sucesso.");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }


    public static void main(String[] args) {
        Conta conta = new Conta();
        boolean continuar = true;
        while(continuar){
            System.out.println("1 para criar conta\n2 para remover conta\n3 exibir contas\n4 para sair");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = input.next();

                    System.out.println("Agencia: ");
                    int agencia = input.nextInt();

                    System.out.println("Saldo: ");
                    double saldo = input.nextDouble();

                    conta.adicionarConta(nome, agencia, saldo);
                    break;
                case 2:
                    System.out.println("Nome da conta para remover: ");
                    String contaRemover = input.next();
                    conta.removerConta(contaRemover);
                case 3:
                    conta.exibirContas();
                case 4:
                    continuar = false;
                    System.out.println("fim...");
                default:
                System.out.println("opção invalida");
                    break;
            }
        }
    }
}
