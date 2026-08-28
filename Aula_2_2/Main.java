package Aula_2_2;

public class Main {
    public static void main(String[] args) {
      Endereco endereco = new Endereco("rua cinco", 17, "Macaxeira", "recife", "Pernambuco");
      Telefone telefone = new Telefone("(81)", "9999-9999");
      Data data = new Data(14, 8, 2026);
      Cliente_1 cliente = new Cliente_1("silas", "123.456.78", "123.456.789-09", telefone , data, endereco); 

      System.out.println(cliente.endereco.cidade);

    }
}