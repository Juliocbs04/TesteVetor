package aplicacao;
public class Aplicacao {
    public static void main(String[] args) {
        Ordenar v = new Ordenar(10);
        Ordenar v2= new Ordenar(10);
        //vetor 1
        v.randomFill();
        //v.imprimeVetor();
        v.bubbleSort();
        //v.setAt(10, 566);
        //v.valueAt(12);
        //v.imprimeVetor();
        if(v.equals(v2)){
            System.out.println("\n Os vetores são iguais");
        }else{
              System.out.println("\n Os vetores são diferentes");
        }
        //System.out.println("o tamanho eh"+ v.length());
        v.Concat(v2);
        
    }
    
}
