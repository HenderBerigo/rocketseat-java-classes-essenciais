package java_13_classes_essenciais;

import java.util.Scanner;

public class ClassesEssenciais {
    public static void main(String[] args) {
        // System.out
        System.out.print("Hender");
        System.out.println("Berigo");

        // system.err
        System.err.println("Erro");

        try {
            System.out.println("Dividindo 1 por zero...");
            System.out.println(1 / 0);
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Exception: Houve um erro na tentativa de divisão...");
        }

        // System.in

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Digite seu nome: ");
        // var nome = scan.nextLine();
        // System.out.print("Digite seu sobrenome: ");
        // var sobrenome = scan.nextLine();
        // System.out.printf("Olá %s %s!", nome, sobrenome);
        System.out.println();

        Scanner scanner = new Scanner("Hender Berigo;49;henderson.berigo@gmail.com");
        scanner.useDelimiter(";");
        String name = null;
        int age = 0;
        String email = null;

        int index = 0;

        while (scanner.hasNext()) {
            if (index == 0) {
                name = scanner.next();
                System.out.println(scanner.hasNext());

            } else if (index == 1) {
                age = Integer.valueOf(scanner.next());
                System.out.println(scanner.hasNext());
            } else {
                email = scanner.next();
                System.out.println(scanner.hasNext());
            }
            index++;
        }
        // PrintStream
        System.out.printf("Olá %s, você tem %d anos e seu e-mail é %s.", name, age, email);

        System.out.println();

        double salario = 6270.50;
        double nota = 8.50;

        System.out.printf("O salário é R$ %,.2f.\n", salario);
        System.out.printf("A nota é %.2f.", nota);
    }
}
