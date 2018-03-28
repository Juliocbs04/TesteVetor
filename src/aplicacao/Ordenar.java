package aplicacao;

import java.util.Random;

public class Ordenar {
    private int [] vetor;
    // declare o tamanho do vetor;
    public Ordenar(int size){
        vetor = new int[size];
        
    }
    //Preenche o valor com valores aleatórios
    public void randomFill(){
        Random gerador = new Random();
        
        for(int i=0;i<vetor.length;i++){
            vetor[i]= gerador.nextInt(100);
        }
    }
    //Ordenação do vetor
    public void bubbleSort(){
        int aux;
        for(int i=0;i<vetor.length;i++){
            for(int j=i+1;j<vetor.length;j++){
                if(vetor[i]>vetor[j]){
                   aux=vetor[i];
                   vetor[i]=vetor[j];
                   vetor[j]=aux;
                }
            }
        }
    }
    //converte o vetor para String
    /*
    public String toString(){
        
        
    }
    */
    public void imprimeVetor(){
        for(int i=0;i<vetor.length;i++){
            System.out.printf("\n %d %d",vetor[i],i);
        }
    }
    
    public boolean equals(int [] v){
        
        return true;
    }
    
    
    public void setAt(int pos, int value){
        //Atribui um valor na posição pos do vetor
    }
    
    public int valueAt(int pos){
        
        //retorna o valor na posição pos do vetor
        return 0;
    }
    
    
    public int lenght(){
        int tamanho=0;
        tamanho= vetor.length;
        return tamanho;
    }
    
    public int[] Concat(int [] vetor){
        
        return vetor;
        //return 0;
    }
    
    
    
    
    
    
    
}
