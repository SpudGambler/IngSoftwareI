/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopatronprototipo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaime
 */
public class Cliente {
    private int id;
    private Maquina m;

    public Cliente() {
        
    }

    public Cliente(int id, Maquina m) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the m
     */
    public Maquina getM() {
        return m;
    }

    
    public void crearMaquinaPP(PrototipoMaquina pm) {
        Maquina prototipoEspecifico = (Maquina)pm;
        try {
            prototipoEspecifico = (Maquina) prototipoEspecifico.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(EjemploPatronPrototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.m = prototipoEspecifico;
    }
    
    public void crearMaquinaWPP(PrototipoMaquina pm) {
        this.m = (Maquina)pm;
    }
    
    
}
