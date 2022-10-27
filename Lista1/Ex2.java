import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(40);
        String s;

        System.out.println("Digite uma combinação de letras.");
        s = scanner.nextLine();
        s = s.toLowerCase();

        int i = 0;

        while (i < s.length()) {
            pilha.push(s.charAt(i));
            i++;
        }

        isValid(pilha, s);
        scanner.close();
    }

    public static boolean isValid(Pilha pilha, String s) {
        int tam = s.length();
        char c;

        for (int i = 0; i < tam; i++) {
            c = pilha.pop();
            if (s.charAt(i) == c) {
                if (i != tam / 2 && c != 'a' && c != 'b') {
                    System.out.println("Falhou... Algum caractere não-central é diferente de A e B.");
                    return false;
                } else if (i == tam / 2 && c != 'c') {
                    System.out.println("Falhou... O caractere central não é c.");
                    return false;
                }
            } else {
                System.out.println("Falhou... A cadeia de caracteres não é um palíndromo.");
                return false;
            }
        }
        System.out.println("SUCESSO!! A cadeia de caracteres obedece aos critérios necessários.");
        return true;
    }
}
