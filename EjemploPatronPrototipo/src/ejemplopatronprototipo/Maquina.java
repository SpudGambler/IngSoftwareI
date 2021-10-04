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
public class Maquina extends PrototipoMaquina{
    private int tiempoUso;
    
    public Maquina() {
    }

    public Maquina(int datos, String nombre, String conector, int tiempoUso) {
        super(datos, nombre, conector);
        this.tiempoUso = tiempoUso;
    }

    /**
     * @return the datos
     */
    public int getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(int datos) {
        this.datos = datos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the conector
     */
    public String getConector() {
        return conector;
    }

    /**
     * @param conector the conector to set
     */
    public void setConector(String conector) {
        this.conector = conector;
    }
}
