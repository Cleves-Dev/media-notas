/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author cleve
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /* CALCULADORA
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Escreva um operador: ");
     String op = teclado.nextLine();
        System.out.print("Escreva o primeiro número: ");
     int n1 = teclado.nextInt();
        System.out.print("Escreva o segundo número: ");
     int n2 = teclado.nextInt();
     
     int res = 0;
     
        switch (op) {
            case "+" -> res = n1 + n2;
            case "-" -> res = n1-n2;
            case "*" -> res = n1*n2;
            case "/" -> {
                if (n2 != 0){
                    res = n1/n2;
                } else {
                    System.out.println("ERRO! n2 não pode ser 0");
                }
            }
            default -> {
            }
        }
        System.out.println(res);*/
        
        /*// IMPAR OU PAR
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Escreva um número: ");
        int number = teclado.nextInt();
        
        if (number % 2 == 0){
            System.out.println("Com base nas medidas decretadas pela sociedade digo que o número " + number + " é par");
        } else {
            System.out.println("Oloko, o número " + number + " é impar");
        }*/
        
      //TABUADA SINISTRA
      /*Scanner teclado = new Scanner (System.in);
      
        System.out.print("Escreva um numero de 1 a 10: ");
        int n = teclado.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
        teclado.close();*/
      
      //MÉDIA DE NOTAS
      
      Scanner teclado = new Scanner (System.in);
      
      double notas[] = new double[4];
      double soma = 0;
      
      for (int i=0; i<notas.length;i++){
          System.out.println("Escreva a nota do " + (i+1) +"° aluno:");
          notas[i] = teclado.nextDouble();
          soma += notas[i];
          
      }
      
      double media = soma/notas.length;
        System.out.println("A média da nota dos alunos é: "+ media);
        
        
    }
    
    
    
}
