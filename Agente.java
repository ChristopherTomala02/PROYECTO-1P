package Personajes;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Agente{
  private int nroRespuestas;
  private ArrayList<Cliente> listaVentas;
  private Chat buzon;
  private String codigo;
  
  public Agente(String nomUsuario, String password, String ID, String correo) {
        super(nomUsuario, password, ID, correo);
        this.nroRespuestas = nroRespuestas;
        this.listaVentas = listaVentas;
        this.buzon= buzon;
        this.codigo = codigo;
      
    }

    public int getNroRespuestas() {
        return nroRespuestas;
    }

    public ArrayList<Cliente> getListaVentas() {
        return listaVentas;
    }

    public Chat getBuzon() {
        return buzon;
    }

    public String getCodigo() {
        return codigo;
    }
    @Override
    public String toString() {
        return "Agente{" + "nroRespuestas=" + nroRespuestas + ", listaVentas=" + listaVentas + ", buzon=" + buzon + ", codigo=" + codigo + '}';
    }
}
