public class Aluno extends Pessoa{
private double media;

public Aluno (String nome, int idade, double media){
    super(nome,idade);
    this.media = media;
}

public double setmedia(){
    return media;
}
public void setmedia(double media){
    this.media = media;
}

public boolean foiAprovado(){
    return media >= 7;
}

}