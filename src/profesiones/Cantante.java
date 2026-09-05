package profesiones;

// cantante-narco
import java.util.Vector;
import personas.Persona;

public class Cantante extends Persona {
    private Vector<Productor> productores;
    private Vector<Pintor> pintores;

    public Cantante(String pName, int pEdad) {
        super(pName, (byte)pEdad);
        productores = new Vector<Productor>();
        pintores = new Vector<Pintor>();
    }

    public void contratarProductor(Productor pProductor) {
        productores.add(pProductor);
        System.out.println(pProductor.getNombre() + " ahora trabaja con " + this.getNombre());
    }

    public void contratarPintor(Pintor pPintor) {
        pintores.add(pPintor);
        System.out.println(pPintor.getNombre() + " ahora pinta con " + this.getNombre());
    }

    public int getCantidadProductores() {
        return productores.size();
    }

    public int getCantidadPintores() {
        return pintores.size();
    }

    public void despedir(Persona pPersona) {
        if (pPersona != null) {
            if (pPersona instanceof Productor productor) {
                productores.remove(productor);
            } else if (pPersona instanceof Pintor pintor) {
                pintores.remove(pintor);
            }
        }
    }
}