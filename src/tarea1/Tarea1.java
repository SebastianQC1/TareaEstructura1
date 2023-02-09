/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1;

/**
 *
 * @author Sebastian Quiros Camacho
 */
public class Tarea1 {

 public static void main(String[] args) {
        int matriz[][]=new int [3][3];
        int dato=1;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=dato;
                dato++;
            }
        }
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
        }
        
            
        int diagonalDerecha[]=new int[matriz.length];
        int diagonalIzquierda[]=new int[matriz.length];
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==j){
                    diagonalDerecha[i]=matriz[i][j];
                }
                if( (i+j) == matriz.length-1){
                    diagonalIzquierda[i]=matriz[i][j];
                }
            }
        }
        
        System.out.println("");
        System.out.println(" --> Bienvenido al sistema de sumas por diagonales <-- ");
        
        int suma=0;
        System.out.println("\nEl resultado de la suma por la diagonal derecha es: ");
        for(int elemento:diagonalDerecha){
            System.out.print("\t"+elemento);
            suma=suma+elemento;
        }
        System.out.print(" = "+suma);
        System.out.println("");
        
        suma=0;
        System.out.println("\nEl resultado de la suma por la diagonal izquierda es: ");
        for(int elemento:diagonalIzquierda){
            System.out.print("\t"+elemento);
            suma=suma+elemento;
        }
        System.out.print(" = "+suma);
        System.out.println("");
        
        
    
}
}
