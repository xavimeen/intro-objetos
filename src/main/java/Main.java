package main.java;

public class Main {
    public static void main(String[] args) {
        ClienteMinorista gonzalo = new ClienteMinorista("Gonzalo", "Roosvelt 1655", "axeso5rt@gmail.com", 2000.0);
        Producto remera = new Producto("Remera de independiente", 1500.0, 1);
        System.out.println(gonzalo);
        gonzalo.comprar(remera);
        System.out.println(gonzalo);
        ClienteMayorista boro = new ClienteMayorista("Boro", "Villa de mayo", "boro@gmail.com");
        Producto botines = new Producto("Botines Nike", 2000.0, 10);
        boro.comprar(botines);
    }
}