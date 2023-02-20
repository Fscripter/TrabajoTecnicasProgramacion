package com.mycompany.inventory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emanuel.munera
 * @author fscripter
 * @author darkned
 */

import java.lang.String;

/**
 * Clase contenedora de informacion acerca del producto
 * */
public class Product {
    private int number; 
    private String name;
    private int qty;
    private double price;

    public int getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    //Los getters permiten obtener el atributo de la clase
    public double getPrice() {
        return price;
    }
    //Los setters permiten modificar el atributo de la clase 
    public void setPrice(double price) {
        this.price = price;
    }
    
    //Crear un producto generico con valores preestablecidos
    public Product(){
        number = 1;
        name = "Leche alpina ( 1 lt )";
        qty = 20000;
        price = 3600.50;
    }

    public Product(int number, String name, int qty, double price) {
        this.number = number;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    public String toString(){
        String tableText = " Item number: " + this.getNumber()  + "\n Name: " + this.getName() + "\n Quantity Stock: " + this.getQty()+ "\n Price: " + this.getPrice();
        tableText += "\n------------------- \n";
        return tableText;
    }
    
}
