public class Empleados implements Relaciones {
    private String nombre;
    private int edad;

    public Empleados(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean esMayor(Object b) {
        if(this.edad>b.getEdad()){
            return false;
        }
        return true;
    }

    @Override
    public boolean esMenor(Object b) {
        if(this.edad>b.getEdad()){
            return true;
        }
        return false;
    }

    @Override
    public boolean esIgual(Object b) {
        if(this.edad==b.getEdad()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Empleados empleado1=new Empleados("Paco",60);
        Empleados empleado2=new Empleados("Paca",55);

        if(empleado1.esIgual(empleado2)){
            System.out.println("Los empleados tiene la misma edad.");
        }else {
            System.out.println("Los empleados tiene la misma edad.");
        }
        if(empleado1.esMayor(empleado2)){
            System.out.println("El empleado 1 es mayor que el emplado 2.");
        }else {
            System.out.println("El empleado 1 no es mayor que el emplado 2.");
        }
        if(empleado1.esMenor(empleado2)){
            System.out.println("El empleado 1 es menor que el emplado 2.");
        }else {
            System.out.println("El empleado 1 no es menor que el emplado 2.");
        }

    }
}


