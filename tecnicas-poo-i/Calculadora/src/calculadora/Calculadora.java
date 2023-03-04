/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //usando funcao scanner para ler do console
       
        Funcoes f = new Funcoes(); // chamando a class na main   
        
        float soma, subtracao, multiplicacao, divisao; // declarando os returns da funcoes como variaveis locais
        int funcao; 
        
        System.out.println("ESCOLHA A OPERAÇÃO");
        System.out.println("1-SOMAR");
        System.out.println("2-SUBTRAÇÃO");
        System.out.println("3-MULTIPLICAÇÃO");
        System.out.println("4-DIVISÃO");
        
        funcao = sc.nextInt();
        
        switch (funcao){
          
            case 1:   //chamar funcao soma
                
                soma = f.soma;
                //a variavel local soma recebe o return da funcao soma dentro da class Funcoes, que na main está com f; 
                           
            break;
            
            case 2:
                //chamar funcao subtração
                
                subtracao = f.subtracao();
            break;
            
            case 3:
                //chamar multiplicação
                
                multiplicacao = f.multiplicacao();
            break; 
            
            case 4:
                //chamar divisao
                
                divisao = f.divisao();
            break;
  
        }
        
    }
    
}