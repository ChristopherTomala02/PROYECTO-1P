/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;


/**
 *
 * @author DELL
 */
public class Usuario {
    String nomUsuario;
    String password;
    String ID;
    String correo;
    
    
    public Usuario(String nomUsuario, String password,String ID, String correo){
        this.nomUsuario= nomUsuario;
        this.password= password;
        this.ID = ID;
        this.correo= correo;
    }

    public String getNom(){
        return nomUsuario;
    }
    public String getPass(){
        return password;
    }
    public void setNom(String nomUsuario){
        this.nomUsuario= nomUsuario;
    }
    public void setPass(String password){
        this.password = password;
    }
    public boolean checkLogin(String n, String p){
        return nomUsuario.equals(n) && password.equals(p);
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
