package main.java;

public class Producto {
    private String descripcion;
    private Double precioUnitario;
    private Integer cantidad;

    public Producto() {}

    public Producto(String descripcion, Double precioUnitario, Integer cantidad) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public Double getPrecioTotal() {
        return this.cantidad * precioUnitario; //marca referencia de la clase
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", cantidad=" + cantidad +
                '}';
    }
}

