import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(40);
        String s;

        System.out.println("Digite uma combinação de letras.");
        s = scanner.nextLine();
        s.toLowerCase();

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
        int ciclo = defineCiclo(pilha, s);
        char c;

        if (ciclo == 0) {
            System.out.println("Falhou... Formatação incorreta.");
            return false;
        }

        for (int i = 0; i < tam; i++) {
            if (i % ciclo == 0) {
                Pilha pilhaAux = new Pilha(ciclo);
                c = pilha.pop();
                if (c == s.charAt(i)) {
                    pilhaAux.push(c);
                }
                for (int j = i; j < ciclo; j++) {
                    char x = pilhaAux.pop();
                    if (x != s.charAt(tam - ciclo + 1)) {
                        System.out.println("Falhou... Formatação incorreta.");
                        return false;
                    }
                }
            }
        }

        System.out.println("SUCESSO!! A cadeia de caracteres obedece aos critérios necessários.");
        return true;
    }

    public static int defineCiclo(Pilha pilha, String s) {
        int tam = s.length();
        int ciclo;

        for (int i = 0; i < tam; i++) {
            if (s.charAt(i) == 'c' && s.charAt(i * 2 + 1) == 'd') {
                ciclo = i * 2 + 1;
                return ciclo;
            }
        }
        return ciclo = 0;
    }
}

// Não consegui terminar a lógica! Programa não funcionando
