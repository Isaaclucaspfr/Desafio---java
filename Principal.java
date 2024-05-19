/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;
import java.util.Scanner;

public class Principal {
    

    public static void main(String[] args) {
    int circustancia;
    Scanner input = new Scanner(System.in);
    System.out.println("Digite '1' para circulo e '2' para retangulo: ");
        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Realizar calculo do circulo");
            System.out.println("2- Realizar calculo do retangulo");
            System.out.println("Digite o numero correspondente: ");

            circustancia = input.nextInt();

            if (circustancia==1) {
                System.out.println("Iniciando calculo do circulo: ");
                Circulo();
                break;
            }
            else if (circustancia==2) {
                System.out.println("Iniciando o calculo do retangulo: ");
                Retangulo();
                break;
            }
            else{
                System.out.println("Insira um numero corresponde, o numero inserido é invalido");
            }
        }
    }
    public static void Circulo(){
    Scanner input = new Scanner(System.in);
    Circulo c1 = new Circulo();
    String dados;
    double raio;
        System.out.println("Digite o raio do circulo:");
        raio = input.nextDouble();
    c1.setRaio(raio);
    c1.area();
    c1.perimetro();
    dados=c1.retornarDados();
        System.out.println(dados);
    }
public static void Retangulo(){
    Scanner input = new Scanner(System.in);
    Retangulo r1 = new Retangulo();
    String dados;
    double altura,largura;
    System.out.println("Digite a altura: ");
    altura = input.nextDouble();
    System.out.println("Digite a largura: ");
    largura = input.nextDouble();
    r1.setAltura(altura);
    r1.setLargura(largura);
    r1.area();
    r1.perimetro();
    dados=r1.retornarDados();
    System.out.println(dados);
}
    
    
}

    



