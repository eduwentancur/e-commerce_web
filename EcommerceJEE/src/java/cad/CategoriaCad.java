/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;

import Beans.Categoria;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edu
 */
public class CategoriaCad {
    public static ArrayList<Categoria> listar(){
        try {
            String sql="{call sp_listarCategoriaSuperior()}";
            Connection con =Conexion.conectar();
            CallableStatement  sentencia=con.prepareCall(sql);
            ResultSet resultado=sentencia.executeQuery();
            ArrayList<Categoria> lista=new ArrayList<>();
            while(resultado.next()){
                Categoria categoria = new Categoria();
                categoria.setCodigo(resultado.getInt("codigo"));
                categoria.setNombre(resultado.getString("nombre"));
                lista.add(categoria);
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
    }
    
}
