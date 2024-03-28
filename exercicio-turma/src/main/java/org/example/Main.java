package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador1 = 0;
        int contador2 = 0;
        System.out.println("Quantos alunos serão cadastrados na turma 1?");
        contador1 = leitor.nextInt();

        System.out.println("Quantos alunos serão cadastrados na turma 2?");
        contador2 = leitor.nextInt();

        String[] turma1 = new String[contador1];
        String[] turma2 = new String[contador2];
        leitor.nextLine();

        for (int i = 0; i < turma1.length; i++) {
            System.out.println("Digite o nome do aluno para turma 1:");
            turma1[i] = leitor.nextLine();
        }

        for (int i = 0; i < turma2.length; i++) {
            System.out.println("Digite o nome do aluno para turma 2:");
            turma2[i] = leitor.nextLine();
        }

        System.out.println("Alunos da Turma 1:");
        for (String aluno : turma1) {
            if (aluno != null && !aluno.isEmpty()) {
                System.out.println(aluno);
            }
        }

        System.out.println("Alunos da Turma 2:");
        for (String aluno : turma2) {
            if (aluno != null && !aluno.isEmpty()) {
                System.out.println(aluno);
            }
        }

        leitor.close();
    }
}