import java.util.Scanner;

public class Trilha1 {

    public static void main(String[] args) {

        //int idade = 20;
        //double altura = 1.84;
        //float alturaf = 1.84F;
        //String nome = "Arthur";
        //char genero = 'M';
        //boolean falso = false;
//
        //System.out.println("Idade: " + idade);
        //System.out.println("Altura: " + altura);
        //System.out.println("Altura: " + alturaf);
        //System.out.println("Nome: " + nome);
        //System.out.println("Genero: " + genero);
        //System.out.println("Bool: " + falso);

        //String nome = "Arthur";
        //int idade = 20;
        //float altura = 1.84F;
//
        //System.out.println("Nome: " + nome + "Idade: " + idade + "Altura: " + altura);

        //Scanner sc = new Scanner(System.in);
//
        //System.out.println("Digite a nota1: ");
        //double nota1 = sc.nextDouble();
//
        //System.out.println("Digite a nota2: ");
        //double nota2 = sc.nextDouble();
//
        //System.out.println("Digite a nota3: ");
        //double nota3 = sc.nextDouble();
//
        //double media = (nota1 + nota2 + nota3) / 3;
        //System.out.println("A média é: " + media);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite o peso da nota1; ");
        double peso1 = sc.nextDouble();

        System.out.println("Digite a nota2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite o peso da nota2; ");
        double peso2 = sc.nextDouble();

        System.out.println("Digite a nota3: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite o peso da nota3; ");
        double peso3 = sc.nextDouble();

        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.println("A média é: " + media);
    }
}
