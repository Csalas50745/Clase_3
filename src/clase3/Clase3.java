/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author charliesalas
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        
        int i = 10;
        while (i>11) {
            System.out.println("No me deja entrar");
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("No me deja ejecutar");
        }
        
        while (true){
            
        }
        */
        
        /*
        int first = 0;
        do {
            if (first==0){
            System.out.println("Ejecucion infinita");
            first = 1;
            }
        
        } while(true);
        */
        
        /* 
        
        Ejercicio 1 de la clase 3
        
        String result = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                result = result + "@";
              
            }
            result = result + "\n"; 
        }
        System.out.println(result);
        
        */ 
        
        /*
        
        // Ejercicio 2 de la semana 3
        
        /*
        
        int tabla = ;
        for (int i = 0; i <= 10; i++) {
            int result = 0;
            result = i * tabla;
            System.out.println(i + "X" + tabla + "=" + result);
           
        */
        
        
        // Ejercicio 3 Practica en clase.
        
        /*
        
        String lecture;
        int user;
        int i,j;
        
        lecture = JOptionPane.showInputDialog("Digite un numero");
        user = Integer.parseInt(lecture);
        
        for (i = 0; i <= user; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
           
        }
        
        */
        
        // Ejercicio 4, clase 3
        
        /*
        
        for (int i = 20; i < 31; i++) {
            System.out.println(i +" Su valor al cudrado es:"+ i*i );
        }
        
        */
        
        // Ejercicio 5 Practica en clase
      
      /*  
        
      String lecture;
      int noteM = 0;
      int notem = 0;
      int total = 0;
      
      lecture = JOptionPane.showInputDialog("Digita el numero de estudiantes: ");
      int stu = Integer.parseInt(lecture);
     
        for (int i = 0; i < stu; i++) {
            lecture = JOptionPane.showInputDialog("Digita la notas: ");
              int cal = Integer.parseInt(lecture);
              
              // Promedio
              
              int prom  =  (cal / stu );
              
              // Comparacion
            
              if (cal >= 70) {
                System.out.println("La nota seria de: " + cal + " Usted aprobo! ");
                total=total+cal;
             }else
                System.out.println("La nota seria de: " + cal + " Usted reprobo");   
                
            // Nota maxima    
              if (noteM < cal){
                   noteM = cal;
            }
            // Nota minima
            
              if (notem > cal){
                    noteM=cal; 
            }
              System.out.println("El promedio es de: " + prom + "\n" + "La nota mayor es de: " + noteM + "La nota menor es de: " + notem);
            
        } 

        */
      
    }
}
