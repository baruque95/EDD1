public class Pilha{
    public final int n;
    public char[] vetor;
    public int topo;

    public Pilha(int tamanho){
        n = tamanho;
        vetor = new char[tamanho];
        topo = -1;
    }

    public boolean cheia(){
        return topo == n-1;
    }

    public boolean vazia(){
        return topo != -1;
    }

    public void push(char elemento){
        if(!this.cheia()){
            vetor[topo++] = elemento;
        } else {
            System.out.println("Pilha cheia: push não funcionou.");
        }
    }

    public char pop(){
        char c = '\0';
        if(!this.vazia()){
            c = vetor[topo--];
        } else {
            System.out.println("Pilha vazia: pop não funcionou.");
        }
        return c;
    }
}

/*
public class Pilha {
    public final int n;
    public char[] vetor;
    public int topo;

    public Pilha(int tamanho){
        n = tamanho;
        vetor = new char[tamanho];
        topo = -1;
    }

    public boolean vazia(){
        return topo != -1;
    }

    public boolean cheia(){
        return topo == n - 1;
    }

    public char pop(){
        char c = '\0';

        if(!this.vazia()){
            c = vetor[topo--];
        } else {
            System.out.println("Pilha vazia: pop não funcionou. \n");
        }

        return c;
    }

    public void push(char elemento){
        if(!this.cheia()){
            vetor[++topo] = elemento;
        } else {
            System.out.println("Pilha cheia: Push não funcionou \n");
        }
    }

}
*/