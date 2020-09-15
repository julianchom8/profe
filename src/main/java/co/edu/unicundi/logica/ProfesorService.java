/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.logica;

import co.edu.unicundi.controller.GestorDB;
import co.edu.unicundi.controller.pojo.Profesor;
import java.util.ArrayList;

/**
 *
 * @author Juan Jose Rangel
 */
public class ProfesorService {
    
    public ArrayList retornarProfesorPorCedula(int cedula) throws Exception {
        if(cedula <= 1000) {
            throw new Exception("Cédula no valida");            
        } else {
            ArrayList resultado = GestorDB.cargarProfesor(cedula);
            return resultado;
        }
    }
    
    public void insertarProfesor(Profesor profesor)  {
       GestorDB.agregarProfesor(profesor);
    }

    public void editarProfesor(Profesor profesor) {
       GestorDB.editarProfesor(profesor);
    }

    public void eliminarProfesor(int cedula) {
       GestorDB.borrarProfesor(cedula);
    }

    public ArrayList retornarProfesorPorMateria(int materia) {
        ArrayList resultado = GestorDB.cargarProfesorMateria(materia);
        return resultado;
    }
}
