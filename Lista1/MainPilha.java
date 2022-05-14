import java.util.Scanner;

public class MainPilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(40);
        String s;
        char c;

        System.out.println("Digite uma combinação de letras minúsculas.");
        s = scanner.nextLine();
        s.toLowerCase();

        int i = 0;

        while (i < s.length()) {
            c = s.charAt(i);
            pilha.push(c);
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

/*
 * 
 * RACIOCÍNIOS ANTERIORES QUE NÃO FORAM UTILIZADOS
 * 
 * public static boolean isMirrored(String s) {
 * 
 * int stringLenght = s.length();
 * Pilha pilhaAux2 = new Pilha(stringLenght);
 * Pilha pilhaAux3 = new Pilha(stringLenght);
 * 
 * for (int i = 0; i < stringLenght / 2; i++) {
 * int j = stringLenght - i - 1;
 * if (s.charAt(i) != 'c' && s.charAt(j) != 'c') {
 * pilhaAux2.push(s.charAt(i));
 * pilhaAux3.push(s.charAt(j));
 * } else {
 * System.out.println("A pilha possui caracteres inválidos.");
 * return false;
 * }
 * }
 * 
 * for (int i = 0; i < stringLenght / 2; i++) {
 * char charPilha2 = pilhaAux2.pop();
 * char charPilha3 = pilhaAux3.pop();
 * 
 * if (charPilha2 != charPilha3)
 * return false;
 * }
 * 
 * System.out.println("A cadeia de caracteres obedece aos parâmetros exigidos."
 * );
 * return true;
 * }
 * 
 * public static boolean isValid(Pilha p, String s) {
 * int i = 0;
 * int stringLenght = s.length();
 * char middleChar = s.charAt((stringLenght / 2));
 * 
 * if (stringLenght % 2 == 0 || middleChar != 'c') {
 * System.out.println("A frase é inválida.");
 * return false;
 * }
 * 
 * while (i < stringLenght) {
 * 
 * if (s.charAt(i) != 'a' && s.charAt(i) != 'b' && s.charAt(i) != 'c') {
 * System.out.println("A frase possui caractere inválido.");
 * return false;
 * }
 * i++;
 * }
 * 
 * return true;
 * }
 */