package com.algaworks.banco.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas = new ArrayList<>();

    public Banco() {
        Pessoa pessoa1 = new Pessoa("João da Silva", "12312312311");
        Pessoa pessoa2 = new Pessoa("Maria das Couves", "12312312311");

        Conta conta1 = new ContaInvestimento(pessoa1, 222, 999);
        Conta conta2 = new ContaInvestimento(pessoa1, 123, 888);
        Conta conta3 = new ContaInvestimento(pessoa2, 123, 567);
        Conta conta4 = new ContaEspecial(pessoa1, 123, 188, new BigDecimal("10000"));
        Conta conta5 = new ContaEspecial(pessoa2, 123, 222, new BigDecimal("2000"));

        conta1.depositar(new BigDecimal("120"));
        conta2.depositar(new BigDecimal("150"));
        conta3.depositar(new BigDecimal("500"));
        conta5.depositar(new BigDecimal("12000"));

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);
    }

    public List<Conta> getContas() {
        return contas;
    }
    
}