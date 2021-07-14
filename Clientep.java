/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import java.time.LocalDate;


/**
 *
 * @author DELL
 */
public class Clientep extends Usuario{
    private String nombCliente;
    private String MetodoPrestamo;
    private LocalDate FechaNacimiento;

    public Clientep(String nomUsuario, String password, String ID, String correo,String nombCliente,String MetodoPrestamo,LocalDate FechaNacimiento) {
        super(nomUsuario, password, ID, correo);
        this.nombCliente = nombCliente;
        this.MetodoPrestamo = MetodoPrestamo;
        this.FechaNacimiento= FechaNacimiento;
    }


    public String getNombCliente() {
        return nombCliente;
    }

    public void setNombCliente(String nombCliente) {
        this.nombCliente = nombCliente;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getMetodoPrestamo() {
        return MetodoPrestamo;
    }

    public void setMetodoPrestamo(String MetodoPrestamo) {
        this.MetodoPrestamo = MetodoPrestamo;
    }

    @Override
    public String toString() {
        return "{ idComprador:" + ID + ", nombComprador:" + nombCliente + ", correo:" + correo + ", MetodoPrestamo:" + MetodoPrestamo + '}'+"\n";
    }

}
