/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.controller.pojo;

/**
 *
 * @author JuanJ
 */
public class Materia {
    private int codigo, profesor;
    private String nombreMat;

    public Materia(int codigo, int profesor, String nombreMat) {
        this.codigo = codigo;
        this.profesor = profesor;
        this.nombreMat = nombreMat;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }
}
