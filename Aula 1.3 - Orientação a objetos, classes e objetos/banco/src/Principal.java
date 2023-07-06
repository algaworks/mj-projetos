public class Principal {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.nome = "João da Silva";
        titular1.documento = "12312312311";

        Pessoa titular2 = new Pessoa();
        titular2.nome = "Maria Abadia";
        titular2.documento = "22233344455";

        Conta minhaConta = new Conta();
        minhaConta.titular = titular1;
        minhaConta.agencia = 123;
        minhaConta.numero = 987;
        minhaConta.saldo = 15_000;

        Conta suaConta = new Conta();
        suaConta.titular = titular2;
        suaConta.agencia = 222;
        suaConta.numero = 333;
        suaConta.saldo = 30_000;

        System.out.println("Titular: " + minhaConta.titular.nome);
        System.out.println("Saldo: " + minhaConta.saldo);

        System.out.println("Titular: " + suaConta.titular.nome);
        System.out.println("Saldo: " + suaConta.saldo);
    }

}
