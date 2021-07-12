/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaSoft;

/**
 *
 * @author DELL
 */
public class SistemaHogar {
    public DataCharger sistema;
    public Scanner sc;

    public SistemaHogar() {
        this.sistema = new DataCharger();
        this.sc = new Scanner(System.in);
    }

    public void MenuNumerico() {
        String opcion = "";
        while (!opcion.equals("3")) {
            System.out.println("\n          Bienvenido al menu principal          ");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Registro");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.next();
            if (opcion.equals("1")) {
                this.iniciarSesion(); #Adjuntar esta clase
            }
            if (opcion.equals("2")) {
                this.registrarUsuario(); #Adjuntar esta clase
            }
            if (opcion.equals("3")) {
                System.out.print("Saliendo... ");
                System.out.print("Listo, vuelve pronto :) ");
            } else {
                System.out.print("Ingrese una opcion valida");
            }
        }
    }
public void registrarUsuario() {
        String dt = "";
        System.out.println("\n----- Bienvenido al menu de registro -----");
        System.out.println("1. Cliente");
        System.out.println("2. Agente");
        System.out.println("3. Administrador");
        System.out.println("4. Regresar");
        System.out.print("Ingrese una opcion de Registro : ");
        dt = sc.next();
        if (op.equals("4")) {
            this.MenuNumerico();
        } 
        else if (dt.equalsIgnoreCase("1") || dt.equalsIgnoreCase("2")) {
            System.out.println("\nIngrese sus datos");
            sc.nextLine();
            System.out.print("Username: ");
            String user = sc.nextLine();
            System.out.print("Password: ");
            String word = sc.nextLine();
            System.out.println("Nombre: ");
            String name = sc.nextLine();
            System.out.println("CEDULA/ID: ");
            String id = sc.nextLine();
            System.out.println("Correo: ");
            String id = sc.nextLine();
            System.out.println("Fecha de Nacimiento: ");
            String resp = "";
            
            String direccion = null;
            Coordenada ubicacion = null;
            while (!(resp.equalsIgnoreCase("coordenada") || resp.equalsIgnoreCase("direccion"))) {
                System.out.println("¿Desea Ingresar Coordenada o una direccion?:");
                resp = sc.nextLine();
                if ("coordenada".equals(resp.toLowerCase())) {
                    System.out.print("Latitud: ");
                    double lat = sc.nextDouble();
                    System.out.print("Longitud: ");
                    double lon = sc.nextDouble();
                    ubicacion = new Coordenada(lat, lon);
                    direccion = SistemaGPS.consultarUbicacion(ubicacion);
                } else if ("direccion".equals(resp.toLowerCase())) {
                    System.out.print("Ingresa direccion separada por coma  (Lugar,ciudad) :");
                    direccion = sc.nextLine();
                    ubicacion = SistemaGPS.consultarUbicacion(direccion);
                } else {
                    System.out.println("Ingresa una direccion valida :) ");
                }
            }
            System.out.print("Correo: ");
            String correo = sc.next();
            if (op.equals("1")) {
                System.out.print("Ingrese su forma de pago preferida: ");
                String pago = sc.next();
                sistema.clientes.add(new Comprador(id, name, ubicacion, correo, pago, user, word));
                sistema.cambiaDireccion(new Comprador(id, name, ubicacion, correo, pago, user, word), direccion);
                
                for (Comprador clientes : sistema.clientes) {
                    System.out.print("cliente " + clientes);
                }
            } else if (op.equals("2")) {
                System.out.print("Numero de contacto: ");
                String telf = sc.next();
                sistema.proveedores.add(new Proveedor(user, word, id, name, ubicacion, telf, correo));
                for (Proveedor prov : sistema.proveedores) {
                    System.out.print("Proveedores" + prov);
                }
            } else {
                System.out.println("Intente nuevamente por favor");
            }
        }
    }

}