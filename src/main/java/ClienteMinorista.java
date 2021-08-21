package main.java;

public class ClienteMinorista {  //primero creamos la clase cliente y sus atributos
    private String nombre;
    private String domicilio;
    private String email;
    private Double saldo;

    public ClienteMinorista() {}

    public ClienteMinorista(String nombre, String domicilio, String email, Double saldo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.saldo = saldo;
    }

    public void comprar(Producto producto) {
        if (this.saldo >= producto.getPrecioTotal()) {
            this.saldo = this.saldo - producto.getPrecioTotal();
            System.out.println(this.nombre + " felicidades, tu compra fue finalizada correctamente.");
        } else {
            System.out.println(this.nombre + " lástima, saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", email='" + email + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
