package com.jhones.Bdtelefonia;

public class Empleado  implements telefonia
{
    private int Id_empleado;
    private String NombreEmpleado;
    private String ApellidoEmpleado;
    private int Telefono;

    public int getId_empleado() {
        return Id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        Id_empleado = id_empleado;
    }

    public String getNombreEmpleado() {return NombreEmpleado;}

    public void setNombreEmpleado(String nombreEmpleado) {NombreEmpleado = nombreEmpleado;}

    public String getApellidoEmpleado() {
        return ApellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        ApellidoEmpleado = apellidoEmpleado;
    }

    public int getTelefono() {return Telefono;}

    public void setTelefono(int telefono) {Telefono = telefono;}

    @Override
    public void Crear()
    {
        insert into Empleado (Id_empleado, NombreEmpleado, ApellidoEmpleado) values(getId_empleado(), getNombreEmpleado(), getApellidoEmpleado());
    }

    @Override
    public void Modificar()
    {
        <
    }

    @Override
    public void Eliminar()
    {
        delete from Empleado where Id_empleado=getId_empleado();
    }

    @Override
    public void ver()
    {
        select * from Empleado;
    }
}
