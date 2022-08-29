/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class RectanguloServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        
        //instanciar objeto rectangulo
        Rectangulo rec1 = new Rectangulo();
        
        System.out.println("Ingrese base del rectangulo");
        rec1.setBase(leer.nextInt());
        System.out.println("Ingrese altura del rectangulo");
        rec1.setAltura(leer.nextInt());
        return rec1;
        
    } public void superficie(Rectangulo rec1){
        int sup = rec1.getBase()*rec1.getAltura();
            System.out.println("La superficie es: " +sup);
        
    } public void perimetro(Rectangulo rec1){
        int per = (rec1.getBase()+rec1.getAltura())*2;
            System.out.println("El perimetro es: " +per);
            
    }  public void mostrarRectangulo(Rectangulo rec1){
        int base = rec1.getBase();
        int altura = rec1.getAltura();
         for (int i=0; i<base; i++){
             System.out.print("*");
         }
            System.out.println();
            for (int i=0; i<altura-2; i++){
                System.out.print("*");
                for (int j=0; j<base-2; j++){
                    System.out.print(" ");
                    } 
                System.out.println("*");
    }
                for (int k=0; k<base; k++){
                        System.out.print("*");
                        
                    }
                System.out.println("");
            }
        
    }
    
