package aplication;

import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.print("Name: ");
        estudante.nome = sc.nextLine();
        System.out.print("Nota1: ");
        estudante.nota1 = sc.nextDouble();
        System.out.print("Nota2: ");
        estudante.nota2 = sc.nextDouble();
        System.out.print("Nota3: ");
        estudante.nota3 = sc.nextDouble();

        System.out.printf("Nota Final: %.2f%n", estudante.notaFinal());

        if (estudante.notaFinal() < 60.0) {
            System.out.println("Reprovado");
            System.out.printf("Falta %.2f Pontos%n", estudante.faltaPontos());
        } else {
            System.out.println("Aprovado");
        }
        sc.close();

    }

}

