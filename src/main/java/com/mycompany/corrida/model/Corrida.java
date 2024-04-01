/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corrida.model;

/**
 *
 * @author Admin
 */
import java.util.*; 

public class Corrida {
    public Date inicio; 
    private Pista pistaEscolhida; 
    public ArrayList<Automovel> automoveis = new ArrayList(); 
    
    public void adicionarAutomovel(Automovel a){
    this.automoveis.add(a);
    }
   
    public Corrida (ArrayList<Automovel> autos){
        this.automoveis = autos;
    }
    
    private void liguemSeusMotores(){
        for (Automovel a : this.automoveis){
            System.out.println(a.modelo + a.acelerar());
        }
    }
    
    public void iniciarCorrida(){
        this.liguemSeusMotores();
        
    }
    
}
