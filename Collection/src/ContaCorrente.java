public class ContaCorrente {
    private String nome;
    private int agencia;
    private double saldo;
    public String getNome() {
        return nome;
    }
    public int getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    @Override
    public String toString() {
        return "ContaCorrente [nome=" + nome + ", agencia=" + agencia + ", saldo=" + saldo + "]";
    }
    public ContaCorrente(String nome, int agencia, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    
}

