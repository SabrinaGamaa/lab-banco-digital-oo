# 💳 Banco Digital com Orientação a Objetos

Este projeto simula um sistema bancário simples utilizando os princípios da Programação Orientada a Objetos (POO) em Java. Ele foi desenvolvido como desafio prático do Bootcamp Java da DIO.

## 🧠 Objetivos do Projeto

- Praticar os pilares da POO: Abstração, Encapsulamento, Herança e Polimorfismo.
- Criar um sistema de contas bancárias com funcionalidades básicas como saque, depósito, extrato e transferência.
- Estruturar um projeto Java limpo, reutilizável e com responsabilidade separada.
- Criar testes unitários com JUnit para validar comportamentos importantes como transferência de saldo.

## 🏗️ Estrutura do Projeto

```
    lab-banco-digital-oo/
    │
    │ ├── Banco.java
    │ ├── Cliente.java
    │ ├── Conta.java
    │ ├── ContaCorrente.java
    │ ├── ContaPoupanca.java
    │ └── Main.java
      └── README.md    
      
```


## 📦 Funcionalidades

- 📄 Criação de cliente e contas.
- 🏦 Contas Corrente e Poupança.
- 💰 Depósito e saque.
- 🔁 Transferência entre contas.
- 🧾 Impressão de extrato.


## 📚 Conceitos Utilizados

- **Abstração:** Classe `Conta` define o modelo genérico.
- **Encapsulamento:** Atributos `saldo`, `agencia`, etc., protegidos e manipulados por métodos.
- **Herança:** `ContaCorrente` e `ContaPoupanca` herdam de `Conta`.
- **Polimorfismo:** Métodos sobrescritos e reutilização de código.

## ▶️ Como Executar
Clone o repositório:

```
git clone https://github.com/SabrinaGamaa/lab-banco-digital-oo.git
```
- Compile e execute via terminal ou IDE (IntelliJ, Eclipse, etc):

- Execute Main.java para rodar a simulação.

✅ Requisitos
Java 8 ou superior

