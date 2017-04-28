package com.jhones.Bdtelefonia;

public class Producto implements telefonia
{
    private int Id_producto;
    private String Nombre;
    private String Marca;
    private float Precio;

    public int getId_producto() {
        return Id_producto;
    }

    public void setId_producto(int id_producto) {
        Id_producto = id_producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {Nombre = nombre;}

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }


    @Override
    public void Crear()
    {
        insert into Producto (Id_producto, Nombre, Marca, Precio) values(getId_producto(), getNombre(), getMarca(), getPrecio());
    }

    @Override
    public void Modificar()
    {
        update Producto  set Precio=setPrecio() where Id_Producto=getId_producto();
    }

    @Override
    public void Eliminar()
    {
        delete from Producto where Id_producto=getId_producto();
    }

    @Override
    public void ver()
    {
        select * from Producto;
    }
}