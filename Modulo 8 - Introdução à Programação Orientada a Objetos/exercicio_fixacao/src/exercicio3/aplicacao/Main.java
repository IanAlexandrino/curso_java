package exercicio3.aplicacao;

import exercicio3.entidades.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String auxNome = sc.nextLine();
        double auxNota1 = sc.nextDouble();
        double auxNota2 = sc.nextDouble();
        double auxNota3 = sc.nextDouble();

        Student student = new Student(auxNome, auxNota1, auxNota2, auxNota3);
        student.passOrFailed();

        sc.close();

    }

}
