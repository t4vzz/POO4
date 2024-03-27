package com.mycompany.corrida;

/**
 *
 * @author Admin
 */

import com.mycompany.corrida.model.Automovel;
import com.mycompany.corrida.model.Carro;
import com.mycompany.corrida.model.Corrida;
import com.mycompany.corrida.model.Pista;
import java.util.ArrayList;

public class App {

    public static void main ( String[] args ){
    
    Pista p = new Pista();
    Automovel carro1 = new Carro ("Siena"); 
    Automovel carro2 = new Carro ("Celta"); 
    Automovel carro3 = new Carro ("Veloster"); 
    
    Automovel moto1 = new Carro ("XT660"); 
    Automovel moto2 = new Carro ("TIGER 900"); 
    Automovel moto3 = new Carro ("XRE 300");
    
    ArrayList<Automovel> participantes = new ArrayList();
    
    participantes.add(carro1);
    participantes.add(carro2);
    participantes.add(carro3);
    
    participantes.add(moto1);
    participantes.add(moto2);
    participantes.add(moto3);
      
    new Corrida(participantes).iniciarCorrida();
}
    
}
 