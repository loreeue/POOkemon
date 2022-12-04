package Pookemon;
import java.util.ArrayList;

import Movimiento.*;

public class Bulbasur extends Pokemon {
    
    public Bulbasur(int nivel, String nombre){
       
        this.setNombre(nombre);
        this.setSaludo("¿Quieres un briconsejo de jardinería?");
        this.setTipo("Planta");
        this.setNivel(nivel);

        int valorBase = 1;     // para calcular los valores de poder, defensa, etc.   
        this.setPoder ((int) ((valorBase + nivel) * (Math.random()*10+1)));   // Le sumamos el nivel y multiplicamos por un valor aleatorio (entre 1 y 10)       
        this.setDefensa ((int) ((valorBase + nivel) * (Math.random()*10+1)));
        this.setVelocidad((int) ((valorBase + nivel) * (Math.random()*10+1)));        
        this.setSaludMax((int) ((valorBase + nivel) * (Math.random()*10+1)));       
        this.setSaludActual((int) ((valorBase + nivel) * (Math.random()*10+1)));   
        this.setPoderEspecial((int) ((valorBase + (nivel*1.5)) * (Math.random()*10+1)));
        this.setDefensaEspecial((int) ((valorBase + (nivel*1.5)) * (Math.random()*10+1)));

        Ofensivo ofensivo = new Ofensivo("lanzasemen");
        ModificadorDefensa modificador_defensa = new ModificadorDefensa("Latigoa");
        ModificadorPoder modificador_Poder = new ModificadorPoder("Poder - 4");

        ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
        movimientos.add(ofensivo);
        movimientos.add(modificador_defensa);
        movimientos.add(modificador_Poder);
        setMovimientos(movimientos);
    }
}
