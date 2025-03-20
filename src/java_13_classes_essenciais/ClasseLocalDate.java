package java_13_classes_essenciais;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClasseLocalDate {
    public static void main(String[] args) {
        // LocalDate
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        LocalDate data = LocalDate.of(1976, 1, 6);
        System.out.println(data);
        System.out.println(data.plusYears(75));
        System.out.println("============");

        String nascimento = "1976-01-06";

        LocalDate dataNasc = LocalDate.parse(nascimento);
        System.out.println(dataNasc);
        System.out.println("============");
        System.out.println(nascimento.getClass());
        System.out.println(dataNasc.getClass());
        System.out.println("============");

        String nascimento2 = "06/01/1976";
        DateTimeFormatter nascFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataNasc2 = LocalDate.parse(nascimento2, nascFormater);
        System.out.println(dataNasc2);
    }

}
