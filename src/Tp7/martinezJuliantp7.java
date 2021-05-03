/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp7;

import Clases.*;
import Vistas.MenuPrincipal;

/**
 *
 * @author Julian Martinez <juli450@gmail.com>
 */
public class martinezJuliantp7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Materia ingles1=new Materia(1,"Ingles 1",2021);
       Materia mate=new Materia(1,"Matematicas 1",2021);
       Materia lab1=new Materia(1,"Lab 1",2021);
       Alumno lMartin=new Alumno(1001,"Lopez","Martin");
       Alumno mBrenda=new Alumno(1002,"Martinez","Brenda");
       lMartin.agregarMateria(ingles1);
       lMartin.agregarMateria(mate);
       lMartin.agregarMateria(lab1);
       mBrenda.agregarMateria(mate);
       mBrenda.agregarMateria(lab1);
       mBrenda.agregarMateria(ingles1);
       mBrenda.agregarMateria(lab1);
       System.out.println("La cantidad de materias inscriptas de "+lMartin.getApellido()+" "+
               lMartin.getNombre()+" son: "+lMartin.cantidadMaterias());
       
       System.out.println("La cantidad de materias inscriptas de "+mBrenda.getApellido()+" "+
               mBrenda.getNombre()+" son: "+mBrenda.cantidadMaterias());

       MenuPrincipal mppal=new MenuPrincipal();
       mppal.setVisible(true);
       mppal.setLocationRelativeTo(null);
       
    }
    
}
