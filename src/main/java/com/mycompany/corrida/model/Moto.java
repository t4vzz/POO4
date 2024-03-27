/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corrida.model;

/**
 *
 * @author Admin
 */
public class Moto extends Automovel{
    public Moto(String m){
       super(m);
   }

    @Override
    public String acelerar() {
        return "Randandandandandan     PAAAAA";
    }

    @Override
    public String frear() {
        return "Hir";
    }
    
}
