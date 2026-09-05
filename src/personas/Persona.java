package personas;
import poderes.IPower;

public class Persona {
    private byte edad;
    protected String nombre;
    private double deudasAPagar;
    private IPower power;
    private static final double DEUDA_INICIAL = 10000;

    // constructor no tiene valor de retorno, y debe llamarse igual que la clase

    public Persona () {
        // inicializar persona con sus datos, edad y nombre.
        edad = 19;
        nombre = "arina tarasova";
        deudasAPagar = DEUDA_INICIAL;    
    } 
    
    // Un segundo constructor que si recibe parámetros
    public Persona (byte pEdad, String pNombre) {
        this(); //llama a constructor sin parametros
        this.edad = pEdad;
        this.nombre = pNombre;
    }
// java y en general los lenguajes de programción orientados a objetos
// distinguen las firmas de los métodos por el nombre del método
// y el orden de los tipos de datos, NO DE LOS NOMBRES DE LOS PARÁMETROS;si no del DataType
    public Persona (String pNombre, byte pEdad) {
        this.edad = pEdad;
        this. nombre = pNombre;
    }
    public Persona (String pNombre) {
    this.edad = 0; // asigna un valor por default
    this. nombre = pNombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String pNombre) {
    this.nombre = pNombre;
}
    public byte getEdad() {
    return this.edad;
    }

    public void setEdad(byte pEdad) {
        this.edad=pEdad;
    }
    
    public void reducirDeudaConIngreso(double pIngreso) {
        System.out.println("Debo " + this.deudasAPagar + " y le abono " + pIngreso);
        this.deudasAPagar -= pIngreso;
}

    public void cantar () {
        // impriman un verso de no más de 4 líneas, de una canción que les guste y el autor.
    System.out.println("I'm Slim Shady, yes, I'm the real Shady" + "\n" +
        "All you other Slim Shadys are just imitating" + "\n" +
        "So won't the real Slim Shady please stand up" + "\n" +
        "Please stand up, please stand up?" + "\n" +
        "Eminem");
    }
    public void setPower(IPower pPower) {
        this.power = pPower;
    }
    public void atacar() {
    this.power.dispararPoder();
}
}