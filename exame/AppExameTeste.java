package exame;

import java.util.Scanner;

public class AppExameTeste {
    public static void main(String[] args) {

        Exame exame = new Exame();

        Scanner input = new Scanner(System.in);

        System.out.println("Identificador :");
        exame.idExame = input.nextInt();

        System.out.println("Nível de glicose :");
        exame.nivelGlicose = input.nextInt();

        System.out.println();

        input.close();
    }
}
