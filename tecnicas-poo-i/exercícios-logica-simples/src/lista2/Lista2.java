
package lista2;

import java.util.Scanner;

public class Lista2 {

   
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        double num1, num2, num3, num4, num5;
        int n1, n2, soma1;
        
        // 1- Verificando se é maior que 20
        
        System.out.println("///LISTA 2///");
        System.out.println("Digite um número");
        num1=sc.nextDouble();
        
        if (num1 > 20){
            System.out.println("O número digitado foi " + num1);
        }else{
            System.out.println("Númrero inválido, menor que 20");
        }
        
        // 2- Adição de dois inteiros e mostrar se for maior que 10
        
        System.out.println("_______________________________________");
        
        System.out.println("Fazendo a soma");
        System.out.println("Digite o primeiro número inteiro");
        n1=sc.nextInt();
        System.out.println("Digite o segundo número inteiro");
        n2=sc.nextInt();
        
        soma1 = n1+n2;
        
        if (soma1 > 10){
            System.out.println("A soma dos dois números é de " + soma1);
        }else{
            System.out.println("Soma não atingiu o valor mínimo");
        }
        
        System.out.println("_______________________________________");
        
        // 3- Entrar com um número e imprimir a raiz quadrada do número caso ele seja positivo e o 
        //quadrado do número caso ele seja negativo
       
        System.out.println("Digite um número");
        num2=sc.nextDouble();
        
        if (num2 > 0){
                      
            System.out.println("A raiz quadrada do número é " + Math.sqrt(num2)); //raiz quadrada
            
        }else if (num2 < 0) {
            System.out.println("O quadrado do número é " + Math.pow(num2, 2));
        }
        
        System.out.println("_______________________________________");
        //4- Entrar com um número e imprimir uma das mensagens: é múltiplo de 3 ou não é 
        //múltiplo de 3
        
        System.out.println("Digite um número");
        num3=sc.nextDouble();
        
        if (num3%3 == 0){
                      
            System.out.println("É múltiplo de 3"); 
            
        }else if (num3%3 != 0) {
            System.out.println("Não é múltiplo de 3");
        }
        
        System.out.println("_______________________________________");
        
        //5- Entrar com um número e informar se ele é divisível por 3 e por 7
        
        System.out.println("Digite um número");
        num4=sc.nextDouble();
        
        if (num4%3 == 0 && num4%7 == 0){
                      
            System.out.println("É divisível por 3 e 7"); 
            
        }else if (num4%3 == 0 && num4%7 != 0) {
            
            System.out.println("Divisível apenas por 3");
            
        } else if (num4%3 != 0 && num4%7 == 0){
            
            System.out.println("Divisível apenas por 7");
            
        }
        
        System.out.println("_______________________________________");
        
        //6- Entrar comum número e informar se ele é divisível por 10, por 5, por 2 ou se não é
        //divisível por nenhum destes
        
        System.out.println("Digite um número");
        num5=sc.nextDouble();
        
        if (num5%10 == 0 && num5%5 == 0 && num5%2 == 0){ 
                      
            System.out.println("É divisível por 10, 5 e 2"); 
            
        }else if (num5%10 == 0 && num5%5 == 0 && num5%2 != 0) {
            
            System.out.println("É divisível por 10 e por 5, mas não por 2");
            
        } else if (num5%10 == 0 && num5%5 != 0 && num5%2 != 0){
            
            System.out.println("É divisível apenas por 10, mas não por 5 e 2");
            
        } else if (num5%10 != 0 && num5%5 == 0 && num5%2 == 0){
            
            System.out.println("É divisível por 5 e 2, mas não por 10");
            
        } else if (num5%10 != 0 && num5%5 != 0 && num5%2 == 0){
            
            System.out.println("É divisível apenas por 2, mas não por 10 e 5");
            
        } else if (num5%10 == 0 && num5%5 != 0 && num5%2 == 0){
            System.out.println("É divisível por 10 e por 2, mas não por 5");
        }
    }
    
}
