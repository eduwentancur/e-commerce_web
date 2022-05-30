/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;

/**
 *
 * @author Edu
 */
public class Categoria implements Serializable{
    private Integer codigo;
    private String nombre;
    private boolean visible;
    private Integer categoria_superior;

    public Categoria() {
    }

    public Categoria(Integer codigo, String nombre, boolean visible, Integer categoria_superior) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.visible = visible;
        this.categoria_superior = categoria_superior;
    }

    public Integer getCategoria_superior() {
        return categoria_superior;
    }

    public void setCategoria_superior(Integer categoria_superior) {
        this.categoria_superior = categoria_superior;
    }
    
    
   

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

}
