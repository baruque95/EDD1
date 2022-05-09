import java.util.Scanner;

public class MainPilha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(40);
        String s;
        char c;

        System.out.println("Digite uma combinação de letras.");
        s = scanner.nextLine();

        int i = 0;

        while(i < s.length()){
            c = s.charAt(i);
            pilha.push(c);
            i++;
        }

        scanner.close();
    }

    public boolean isMirrored(String s, char c){

        int i = 0;
        int tam = s.length();
        Pilha pilhaAux2 = new Pilha(tam);
        Pilha pilhaAux3 = new Pilha(tam);

        while(i < s.length()/2){
            c = s.charAt(i);
            pilhaAux2.push(c);
            i++;
        }

        i = 0;

        while(i >= s.length()/2 && i < s.length()){
            c = s.charAt(i);
            pilhaAux3.push(c);
            i++;
        }

        if(isValid(pilhaAux2, s) && isValid(pilhaAux3, s)){

        }
        return true;
    }

    public boolean isValid(Pilha p, String s){
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) != 'a' && s.charAt(i) != 'b' && s.charAt(i) != 'c'){
                return false;
            }
            i++;
        }
        return true;
    }
}

