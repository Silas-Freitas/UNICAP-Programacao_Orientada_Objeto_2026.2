public class Coordenador extends Pessoa {
    private String Setor;

    public Coordenador (String nome, int idade, String setor){
        super(nome, idade);
        this.Setor = setor;
    }
    public void setSetor(String setor) {
        Setor = setor;
    }
    public String getSetor() {
        return Setor;
    }

    
}
