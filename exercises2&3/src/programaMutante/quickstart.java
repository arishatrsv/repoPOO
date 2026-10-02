package programaMutante;

import personas.Persona;
import poderes.IPower;
import poderes.PoderTelequinesis;
import poderes.PoderTelepatia;
import poderes.PoderHielo;
import poderes.PoderRegeneracion;
import poderes.PoderRayos;
import profesiones.Cantante;
import profesiones.Pintor;
import profesiones.Productor;

public class quickstart {
    public static void main(String[] args) {
        System.out.println("Hello clase de Poo");

        Persona arisha = new Persona();
        Persona p1 = new Persona("Juliana Lopez", (byte)22);

        System.out.println(arisha.getNombre());
        arisha.cantar();

        System.out.println("---------------");

        String nombreResultado = p1.getNombre();
        System.out.println(nombreResultado);
        p1.cantar();

        System.out.println("Edad de " + arisha.getNombre() + " " + arisha.getEdad());
        arisha.setEdad((byte)18);
        System.out.println("Edad de " + arisha.getNombre() + " " + arisha.getEdad());

        System.out.println("---------------");

        Persona xyz = p1;

        xyz.setEdad((byte)27);
        System.out.println("Edad de " + p1.getNombre() + " " + p1.getEdad());

        // arisha = xyz;

        Productor hilary = new Productor("Hilary Aguilar", 200);

        hilary.vender(30);

        System.out.println("Ahora " + hilary.getNombre() + " tiene " + hilary.getDinero());

        hilary.cantar();
        hilary.cantar();

        hilary.setNombre("Hilary Aguilar");

        System.out.println("Ahora " + hilary.getNombre() + " tiene " + hilary.getDinero());

        hilary.setNombreFalse();

        System.out.println("Ahora " + hilary.getNombre() + " tiene " + hilary.getDinero());

        hilary.reducirDeudaConIngreso(1500);

        System.out.println("---------------");
        System.out.println("PERSONAS MUTANTES");

        Persona profesionales[] = new Persona[5];

        IPower poderesDisponibles[] = {
            new PoderTelequinesis(),
            new PoderTelepatia(),
            new PoderHielo(),
            new PoderRegeneracion(),
            new PoderRayos()
        };

        for (int i = 0; i < 5; i++) {
            int tipoProfesion = (int)(Math.random() * 3);
            switch (tipoProfesion) {
                case 0:
                    profesionales[i] = new Productor("Hilary Aguilar " + i, 40 * i);
                    break;
                case 1:
                    profesionales[i] = new Pintor("Eimy Vega " + i, 55);
                    break;
                case 2:
                    profesionales[i] = new Cantante("Joselyn Hidalgo " + i, i + 10);
                    break;
            }
            profesionales[i].setPower(poderesDisponibles[i]);
        }
        System.out.println("---------------");

        for (Persona p : profesionales) {
            System.out.println("Ataca " + p.getNombre());
            p.atacar();
        }
    }
}