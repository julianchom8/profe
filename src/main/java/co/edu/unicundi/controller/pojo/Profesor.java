/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.controller.pojo;

import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Juan Jose Rangel
 */
public class Profesor implements Serializable{
    
    @NotNull(message = "Campo requerido: Cedula!")
    @Min(value = 10000, message = "Formato incorrecto!")
    private int cedula;
    
    @NotNull(message = "Campo requerido: Nombre!")
    @Size(max = 25)
    private String nombre;

    @NotNull(message = "Campo requerido: Apellido!")
    @Size(max = 25, message = "Maximo 25 caracteres!")    
    private String apellido;
    
    @Min(value = 18, message = "Edad incorrecta!")
    private int edad;
    
    private List<String> listaMateria;
    
    private double vector[];
    
    
    public Profesor() {
    
    }

    public Profesor(int cedula, String nombre, String apellido, int edad, List<String> listaMateria, double[] vector) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.listaMateria = listaMateria;
        this.vector = vector;
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
        

    public List<String> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(List<String> listaMateria) {
        this.listaMateria = listaMateria;
    }

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }      

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
