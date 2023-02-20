/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inventory;

/**
 *
 * @author emanuel.munera
 */

import com.mycompany.inventory.Product;

public class Inventory {

    public static void main(String[] args) {
        System.out.println("Bienvenidos a D1!");
        
        Product milk = new Product();
        Product sugar = new Product(2,"azucar",500,2000);
        Product meat = new Product(3, "carne molida (1 lb)",10,18000);
        Product rice = new Product(4,"arroz",100,2100);
        Product banana = new Product(5,"bananos",10,2000);
        
        
        show(milk);
        show(sugar);
        show(meat);
        show(rice);
        show(banana);
    }
    public static void show(Product generic){
        System.out.println(generic.toString());
    }
}
