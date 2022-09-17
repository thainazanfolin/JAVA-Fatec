
package calculadora1;

import java.util.Scanner;


public class Funcoes {
    private float soma;
    private float subtracao;
    private float multiplicacao;
    private float divisao; 
    
    
    public static void soma (){
        Scanner sc = new Scanner(System.in);
        
        double soma, n, m;
        
        System.out.println("Digite o primeiro número: \n");
        n = sc.nextDouble();
        System.out.println("Digite o segundo número: \n");
        m = sc.nextDouble();
       
        soma = n+m;
        
        System.out.println(soma);
      
    }
    
    public static void subtracao (){
        Scanner sc = new Scanner(System.in);
        
        double subtracao, n, m;
        
        System.out.println("Digite o primeiro número: \n");
        n = sc.nextFloat();
        System.out.println("Digite o segundo número: \n");
        m = sc.nextFloat();
        
        subtracao = n-m;
    }
    
     public static void multiplicacao (){
        Scanner sc = new Scanner(System.in);
        
        double multiplicacao, n, m;
        
        System.out.println("Digite o primeiro número: \n");
        n = sc.nextFloat();
        System.out.println("Digite o segundo número: \n");
        m = sc.nextFloat();
        
        multiplicacao = n*m;
    
    }
    
   public static void divisao (){
        Scanner sc = new Scanner(System.in);
        
        double divisao, n, m;
        System.out.println("Digite o primeiro número, que deseja dividir: \n");
        n = sc.nextFloat();
        System.out.println("Digite o segundo número, divisor: \n");
        m = sc.nextFloat();
        
        if (m==0){
             System.out.println("Não é possível dividir por 0");
        } else {
            divisao = n/m;
        }
         
    }
}
