/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio4;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author Nicolás
 */
public class JavaEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RectanguloServicio mostrar = new RectanguloServicio();
        Rectangulo rec1 = mostrar.crearRectangulo();
        
        mostrar.superficie(rec1);
        mostrar.perimetro(rec1);
        mostrar.mostrarRectangulo(rec1);
        
        
    }
    
}
