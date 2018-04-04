package aplicacao;
public class Aplicacao {
    public static void main(String[] args) {
        Ordenar v = new Ordenar(3);
        Ordenar v2= new Ordenar(3);
        //vetor 1
        v.randomFill();
        v.bubbleSort();
        v.imprimeVetor();
        //v.setAt(10, 566);
        //v.valueAt(12);
        v2.randomFill();
        v2.bubbleSort();
        v2.imprimeVetor();
        if(v.equals(v2)){
            System.out.println("\n Os vetores são iguais");
        }else{
              System.out.println("\n Os vetores são diferentes");
        }
        //System.out.println("o tamanho eh"+ v.length());
        v.Concat(v2);
        
    }
    
}
