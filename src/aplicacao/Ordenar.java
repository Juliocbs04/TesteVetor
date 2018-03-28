package aplicacao;

import java.util.Random;

public class Ordenar {
    int [] vetor;
    // declare o tamanho do vetor;
    public Ordenar(int size){
        vetor = new int[size];
        
    }
    //Preenche o valor com valores aleatórios
    public void randomFill(){
        Random gerador = new Random();
        
        for(int i=0;i<vetor.length;i++){
            vetor[i]= gerador.nextInt(10000);
        }
    }
    //Ordenação do vetor
    public void bubbleSort(){
        
    }
    //converte o vetor para String
    public String toString(){
        
      
    }
    
    public boolean equals(int [] v){
        
    }
    
    public void setAt(int pos, int value){
        //Atribui um valor na posição pos do vetor
    }
    
    public int valueAt(int pos){
        
        //retorna o valor na posição pos do vetor
    }
    
    public int lenght(){
        // retorna o tamanho do vetor
    }
    
    public Vetor Concat(Vetor v){
        
    }
    
    
    
    
    
    
    
}
