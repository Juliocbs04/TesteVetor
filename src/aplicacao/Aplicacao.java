package aplicacao;
public class Aplicacao {
    public static void main(String[] args) {
        Ordenar v = new Ordenar(10);
        v.randomFill();
        v.imprimeVetor();
        v.bubbleSort();
        v.imprimeVetor();
        
    }
    
}
