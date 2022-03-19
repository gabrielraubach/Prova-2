
package br.ulbra.classe;

import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        imc IMC = new imc ();
        
        System.out.println("Digite seu nome:");
        IMC.setNome(ler.nextLine());
        System.out.println("Digite sua altura:");
        IMC.setAltura(ler.nextDouble());
        System.out.println("Digite seu peso:");
        IMC.setPesoAtual(ler.nextDouble());
        
        IMC.calcularImc();
        
    }
    
}
