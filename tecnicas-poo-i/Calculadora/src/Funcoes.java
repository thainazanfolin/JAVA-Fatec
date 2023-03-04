
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Funcoes {
    
    private float soma;
    private float subtracao;
    private float multiplicacao;
    private float divisao; 
    
    
    public float soma (float n, float m){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: \n");
        n = sc.nextFloat();
        System.out.println("Digite o segundo número: \n");
        m = sc.nextFloat();
        soma = n+m;
        
        return soma;
    }
    public float subtracao (float n, float m){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: \n");
        n = sc.nextFloat();
        System.out.println("Digite o segundo número: \n");
        m = sc.nextFloat();
        
        subtracao = n-m;
        return subtracao;   
    }
    
     public float multiplicacao (float n, float m){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: \n");
        n = sc.nextFloat();
        System.out.println("Digite o segundo número: \n");
        m = sc.nextFloat();
        
        multiplicacao = n*m;
        return multiplicacao;
        
    }
     
      public double divisao (double n, double m){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número, que deseja dividir: \n");
        n = sc.nextDouble();
        System.out.println("Digite o segundo número, divisor: \n");
        m = sc.nextDouble();
        
        if (m=0){
             System.out.println("Não é possível dividir por 0");
        } else{
            divisao=n/m;
        }
        
        return divisao;
        
    }
}
