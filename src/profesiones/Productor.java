package profesiones;

import personas.Persona;

// productor-dealer
public class Productor extends Persona {
    private int cantidadProducciones;
    private static final int PRECIO_PRODUCCION = 2000;
    private static final double IMP_VENTAS = 0.15;
    private int dinero;
    private String nombresCantantes[] = {"Hilary Aguilar", "Eimy Vega", "Joselyn Hidalgo"};

    public Productor(String pName, int pCantidadProducciones) {
        super(pName);
        this.cantidadProducciones = pCantidadProducciones;
        this.dinero = 0;
    }

    public int vender(int pCantidad) {
        int vendido = 0;

        if (pCantidad <= this.cantidadProducciones) {
            vendido = pCantidad;
        } else {
            vendido = this.cantidadProducciones;
        }

        this.dinero += vendido * PRECIO_PRODUCCION;
        this.cantidadProducciones -= vendido;

        System.out.println("Otro cliente feliz con " + vendido + " de producciones.");
        return vendido;
    }

    public int getDinero() {
        return this.dinero;
    }

    public void setDinero(int pDinero) {
        this.dinero = pDinero;
    }

    public int getCantidadProducciones() {
        return this.cantidadProducciones;
    }

    public void setCantidadProducciones(int pCantidadProducciones) {
        this.cantidadProducciones = pCantidadProducciones;
    }

    public void setNombreFalse() {
        this.setNombre(nombresCantantes[(int)(Math.random() * 3)]);
    }

    @Override
    public void reducirDeudaConIngreso(double pIngreso) {
        pIngreso -= pIngreso * IMP_VENTAS;
        super.reducirDeudaConIngreso(pIngreso);
    }

    public void escapar() {
        System.out.println("Voy jalando....porque tengo " + this.getEdad() + " años");
    }
}