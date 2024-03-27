/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corrida.model;

/**
 *
 * @author Admin
 */
public class Carro extends Automovel{
   public Carro(String m){
       super(m);
   }
    @Override
    public String acelerar(){
        return "Vrummm"; 
       
    }

    @Override
    public String frear() {
        return "Hiiirr";
    }
}
