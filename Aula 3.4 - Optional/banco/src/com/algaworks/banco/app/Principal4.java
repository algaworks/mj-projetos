package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Banco;
import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.Pessoa;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal4 {

    public static void main(String[] args) {
        Banco banco = new Banco();

        List<Pessoa> titulares = banco.getContas().stream()
                .map(Conta::getTitular)
                .distinct()
                .toList();
//                .collect(Collectors.toList());
        System.out.println(titulares);

        BigDecimal saldoTotal = banco.getContas().stream()
                .map(Conta::getSaldo)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(saldoTotal);

        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .map(Conta::getTitular)
                .distinct()
                .forEach(System.out::println);

//        banco.getContas().stream()
//            .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
//            .filter(conta -> conta.getNumero() > 200)
//            .sorted(Comparator.comparingInt(Conta::getNumero))
//            .forEach(conta -> {
//                System.out.println(conta.getAgencia() + "/" + conta.getNumero()
//                    + " = " + conta.getSaldo());
//            });
    }

}