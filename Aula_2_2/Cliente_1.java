package Aula_2_2;

public class Cliente_1 {
   String nome;
   String rg;
   String cpf;
   Telefone telefone;
   Data data;
   Endereco endereco;
   
   Cliente_1(String nome, String rg, String cpf, Telefone telefone, Data data, Endereco endereco ){
    this.nome = nome;
    this.rg = rg;
    this.cpf = cpf;
    this.telefone = telefone;
    this.data = data;
    this.endereco = endereco;
   }
}