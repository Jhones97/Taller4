package com.jhones.Bdtelefonia;

import java.security.PrivateKey;

public class Cliente implements telefonia
{
    private String Cedula;
    private String NombreCliente;
    private  String ApellidoCliente;
    private String Email;

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        ApellidoCliente = apellidoCliente;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


    @Override
    public void Crear()
    {
        insert into Cliente (Cedula, NombreCliente, ApellidoCliente, Email) values(getCedula(), getNombreCliente(), getApellidoCliente(), getEmail());
    }

    @Override
    public void Modificar()
    {
        update Cliente set Email=setEmail() where Cedula=getCedula();
    }

    @Override
    public void Eliminar()
    {
        delete from Cliente where Cedula=getCedula();
    }

    @Override
    public void ver()
    {
        select * from Cliente;
    }
}
