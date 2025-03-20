package java_13_classes_essenciais;

public class ClasseStrings {
    public static void main(String[] args) {
        String name = "Henderson Carlos";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        var nome = name.split(" ");
        System.out.println(nome[0]);
        System.out.println(nome[1]);
        System.out.println(name.substring(name.length() - 6));
        System.out.println(name.indexOf("Car"));
        System.out.println(name.concat(" Berigo"));
        System.out.println(name.contains("Car"));
        System.out.println(name.concat(" Berigo").replace(" ", "-"));
        // System.out.println(name.(""));
    }
}
