public class Professor extends Pessoa {
    private String disciplina;

public Professor (String nome, int idade, String disciplina){
    super (nome, idade);
    this.disciplina = disciplina;
}

public String setDisciplina(){
    return disciplina;
}
public void getDisciplina(String disciplina){
    this.disciplina = disciplina;
}
public void lecionar(){
    System.out.println(
            "O professor " + getNome() +
            " está lecionando " + disciplina 
        );
}
}
