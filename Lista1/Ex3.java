import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex3Arrays Array[0][] = new Ex3Arrays(2);
        String s;

        Pilha pilha1 = new Pilha(30);
        Pilha pilha2 = new Pilha(30);

        System.out.println("Digite a primeira sequência de caracteres.\n");
        s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            pilha1.push(c);
        }

        System.out.println("Digite a segunda sequência de caracteres.\n");
        s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            pilha2.push(c);
        }

        scanner.close();
    }
}
