package aplicacao;

import entidades.Estudantes;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estudantes[] vectorEstudantes = new Estudantes[10];

        System.out.print("How many rooms will be rented? ");
        int auxEstudantesAlugando = sc.nextInt();

        for (int i = 0 ; i < auxEstudantesAlugando ; i++){

            sc.nextLine();
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String auxNome = sc.nextLine();
            System.out.print("Email: ");
            String auxEmail = sc.nextLine();
            System.out.print("Room: ");
            int auxRoom = sc.nextInt();

            vectorEstudantes[auxRoom] = new Estudantes(auxNome, auxEmail, auxRoom);

        }

        System.out.println("Busy rooms: ");

        for (Estudantes estudantes : vectorEstudantes){

            if (estudantes != null){

                System.out.println(estudantes.getRoom() + ": " + estudantes.getNome() + ", " + estudantes.getEmail());

            }

        }

        sc.close();

    }

}
