
package pack1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String datos[][] = new String[2][2];//Matriz
    int opcion= 1;//variable para la condicion
       
        //Capturar datos
        for (int i = 0; i < 2; i++) {//3
            for (int j = 0; j < 2; j++) {//4
             ///Condicionales  // Alterna entre nombre y edad 
             if (opcion % 2 != 0) {
                System.out.println("Digite el nombre en la posicion ["+i+"] ["+j+"]");
                datos[i][j] = entrada.nextLine();//obtener nombre
             }else{
                System.out.println("Digite la edad en la posicion ["+i+"] ["+j+"]");
                datos[i][j] = entrada.nextLine();//obtener edad               
             }
             ///Fin condicional
             opcion++;//incrementa         
            }//4           
        }//3            
        System.out.println("");        
        //Mostrar datos
        for (int i = 0; i < 2; i++) {//5
            for (int j = 0; j < 2; j++) {//6
                System.out.print(datos[i][j]+ " | ");//Muestra los datos de la matriz              
            }//6
            System.out.println("");
        }//5
     
     }//2      
    }    

