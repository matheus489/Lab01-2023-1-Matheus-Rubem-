package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        int esquerda = 0;
        int direita = arrayOrdenado.length -1;
        while(esquerda<= direita){
            int meio = esquerda + (direita-esquerda)/2;
            if (arrayOrdenado[meio] == num){
                return 1;
            }
            if(arrayOrdenado[meio]< num){
                esquerda = meio+1;
            }else if(arrayOrdenado == null){
                return -1;
            }
            else{
                direita = meio-1;
            }
            

        }return 0;
            

    }

    public static int maior(int[] arrayDesordenado){
       int maior = arrayDesordenado[0];
       for(int i= 1; i< arrayDesordenado.length; i++){
        if(arrayDesordenado[i]>maior){
            maior = arrayDesordenado[i];
        }
        else if(arrayDesordenado == null){
            return 0;
        }
        
       }return maior;}


    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
