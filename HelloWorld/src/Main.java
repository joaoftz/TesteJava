//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numeroInteiro = 22;
        float numeroReal = 3.14159f;
        char letra = 'F';
        boolean terminou = false;

        System.out.println("Inteiro: " + numeroInteiro);
        System.out.println("Float: " + numeroReal);
        System.out.println("Char: " + letra);
        System.out.println("Lógico: " +terminou);
        System.out.println("=================");

        System.out.printf("\nO Valor do Float: %.3f", numeroReal );

        System.out.println("=================");
        String nome = "Java";
        float media = 8.9f;
        System.out.printf("\nA Nota de %s é %.3f", nome, media);
        System.out.format("\nA Nota de %s é %.3f", nome, media);

    }
}