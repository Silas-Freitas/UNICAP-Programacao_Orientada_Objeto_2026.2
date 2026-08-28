package Aula_3_Herança;

public class ClientePF extends Cliente{
    private String cpf;

    public ClientePF(String nome, String endereco, String cpf){
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getcpf(){
        return cpf;
    }

    public void setcpf (String cpf){
        this.cpf = cpf;
    }
}