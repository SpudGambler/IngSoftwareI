/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopatronprototipo;

/**
 *
 * @author jaime
 */
public abstract class PrototipoMaquina implements Cloneable{
    protected int datos;
    protected String nombre;
    protected String conector;

    public PrototipoMaquina() {
    }

    public PrototipoMaquina(int datos, String nombre, String conector) {
        this.datos = datos;
        this.nombre = nombre;
        this.conector = conector;
    }
    
    @Override
    public PrototipoMaquina clone() throws CloneNotSupportedException{
        return (PrototipoMaquina) super.clone();
    }
    
    @Override
    public String toString(){
        return "Datos: " + this.datos + " - Nombre: " + this.nombre + " - Conector: " + this.conector;
    }
}
