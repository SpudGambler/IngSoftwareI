/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopatronprototipo;

import javax.swing.JOptionPane;

/**
 *
 * @author jaime
 */
public class EjemploPatronPrototipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        PrototipoMaquina m = new Maquina(5, "Prototipo", "Tipo A",10);
        Cliente c = new Cliente(1, null);
        
        c.crearMaquinaPP(m);
        
        //c.crearMaquinaWPP(m);
        
        c.getM().setConector("Tipo C");
        c.getM().setNombre("Maquina 1");
        c.getM().setDatos(8);
        JOptionPane.showMessageDialog(null, "Prototipo Original: "+m.toString() + "\nPrototipo Cliente: "+c.getM().toString());
    }
    
}
