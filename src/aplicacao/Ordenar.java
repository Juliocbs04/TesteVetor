package aplicacao;

import java.util.Random;

public class Ordenar {
    private int [] vetor;
    private int size;
    // declare o tamanho do vetor;
    public Ordenar(int novoSize){
        size= novoSize;
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

    public String toString(){
        String str="";
        
        for(int i=0;i<vetor.length;i++){
            str=str+" "+ String.valueOf(vetor[i]);
        }
        //Retorna os valores do vetor em forma de string
        return str;
    }
  
    public void imprimeVetor(){
        for(int i=0;i<vetor.length;i++){
            System.out.printf("\n %d",vetor[i]);
        }
    }
    
    public boolean equals(Ordenar v){
        int flag=1;
        for(int i=0;i<this.length();i++){
                if(vetor[i]==v.valueAt(i)){
        
                }else{
                    flag=0;
                   
                }
            }
        if(flag==0){
            return false;
        }else{
            return true;
        }
        
    }
    
    
    public void setAt(int pos, int value){
        if(pos>=size){
            System.out.println("Essa posição não existe no Vetor!");
        }else{
            vetor[pos]=value;    
        }
       
    }
    
    public int valueAt(int pos){
        if(pos>=size){
            System.out.println("\n Essa posição não existe no Vetor!");
        }else{
            System.out.printf("O valor da posição é: %d",vetor[pos]);    
        }
        //retorna o valor na posição pos do vetor
        return vetor[pos];
    }
    
    
    public int length(){
        int tamanho=0;
        tamanho= vetor.length;
        return tamanho;
    }
    
    public int[] Concat(int [] vetor2){
        int [] resultado= new int[vetor.length+vetor2.length];
        int i;
        for(i=0;i<vetor.length;i++){
            resultado[i]= vetor[i];
        }
        
        for(;i<vetor.length+vetor2.length;i++){
            resultado[i]= vetor2[i];
        }
        
        
        
        return resultado;
    }

    int[] Concat(Ordenar v2) {
        int [] resultado = new int[this.length()+v2.length()];
        
        for(int i=this.length();i<this.length()+v2.length();i++){
            resultado[i]= v2.valueAt(i);
        }
    }
    
    
    
    
    
    
    
}
