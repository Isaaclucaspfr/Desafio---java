/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

public class Circulo{
    private double raio,area,perimetro;
    private String dados;
    public void area(){
        area=(Math.PI * Math.pow(getRaio(), 2));
    }
    
    public void perimetro(){
        perimetro=(2*Math.PI * getRaio());
    }
    
    public String retornarDados(){
        dados=("O raios do circulo é igual a:" + getRaio() + "\n A area é igual a:" + getArea() + "\n O perimetro do circulo é igual a: " + getPerimetro());
        return dados;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
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


}
