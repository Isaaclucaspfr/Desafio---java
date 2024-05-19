/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

public class Retangulo {
    private double altura;
    private double largura;
    private double area;
    private double perimetro;
    private String dados;
    public void area(){
        setArea(altura*largura);
    }
    
    public void perimetro(){
        setPerimetro(altura + altura+ largura+ largura);
    }
    
    public String retornarDados(){
        setDados("A altura do retangulo é igual a: " + getAltura() + "\n A largura do retangulo é igual a:" + getLargura() + "\n A área do retangulo é igual a: " + getArea() + "O perimetro do retangulo é igual a: " + getPerimetro());
        return getDados();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
}
