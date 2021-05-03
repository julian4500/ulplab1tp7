/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.HashSet;

/**
 *
 * @author Julian Martinez <juli450@gmail.com>
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet <Materia> matIns;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        matIns = new HashSet <Materia>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarMateria(Materia mat){
        matIns.add(mat);
    }
    public int cantidadMaterias(){
      return matIns.size();  
    }

    @Override
    public String toString() {
        return  apellido+" "+nombre ;
    }
    
    
}
