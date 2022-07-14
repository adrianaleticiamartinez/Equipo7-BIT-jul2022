/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultaclientes;

/**
 *
 * @author Elizabeth
 */
public class Consulta {
    private String usuario;
    private String contraseña;
    private String consultaCliente;

    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void setConsultaCliente(String consultaCliente) {
        this.consultaCliente = consultaCliente;
    }
    
    public String getUsuario() {
        return usuario;
    }

  
    public String getContraseña() {
        return contraseña;
    }


    public String getConsultaCliente() {
        return consultaCliente;
    }
}
