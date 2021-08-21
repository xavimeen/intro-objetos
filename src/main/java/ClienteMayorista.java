package main.java;

public class ClienteMayorista {
    private String nombre;
    private String domicilio;
    private String email;

    public ClienteMayorista() {}

    public ClienteMayorista(String nombre, String domicilio, String email) {
        this.nombre = nombre + " FC";
        this.domicilio = domicilio;
        this.email = email;
    }

    public void comprar(Producto compraMayorista) {
        System.out.println(this.nombre + " felicidades, tu compra fue finalizada correctamente.");
    }

    @Override
    public String toString() {
        return "ClienteMayorista{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

