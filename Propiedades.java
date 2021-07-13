package Proyecto;


public class PROPIEDADES {
    private double ancho;
    private double largo;
    private double valor;
    private Ubicacion ubicacion;
    private String Tipo_propiedad;
    private String id;
    private Agente AgenteVenta;
    
    public PROPIEDADES(double ancho, double largo, double valor, String id ){
        ubicacion = new Ubicacion();
        AgenteVenta = null;
        this.ancho = ancho;
        this.largo = largo;
        this.valor = valor;
        this.id = id;

    }
    
    public PROPIEDADES(double ancho, double largo, double valor, String id , Agente AgenteVenta, Ubicacion ubicacion){
        this.ubicacion = ubicacion;
        this.AgenteVenta = AgenteVenta;
        this.ancho = ancho;
        this.largo = largo;
        this.valor = valor;
        this.id = id;
    }
    
    public PROPIEDADES(double ancho, double largo, double valor, String id , Ubicacion ubicacion){
        this.ubicacion = ubicacion;
        AgenteVenta = null;
        this.ancho = ancho;
        this.largo = largo;
        this.valor = valor;
        this.id = id;
    }
}
