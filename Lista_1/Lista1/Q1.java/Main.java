package Lista_1.Lista1.Q1;

public class Main {

    public static void main(String[] args) {

        Filme filme1 = new Filme( "Interestelar","Ficção Científica",2014 );

        Filme filme2 = new Filme( "Toy Story",   "Animação",1995);

        System.out.println("Filme 1:");
        System.out.println("Título: " + filme1.titulo);
        System.out.println("Gênero: " + filme1.genero);
        System.out.println("Ano de lançamento: " + filme1.ano);

        System.out.println();

        System.out.println("Filme 2:");
        System.out.println("Título: " + filme2.titulo);
        System.out.println("Gênero: " + filme2.genero);
        System.out.println("Ano de lançamento: " + filme2.ano);
    }
}