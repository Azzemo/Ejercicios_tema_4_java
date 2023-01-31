package clase_hija;

import clase_padre.SmartDevice;

public class SmartPhone extends SmartDevice {

    double batería;
    String durabilidad;
    Double almacenamiento;
    double resolución;

    public SmartPhone(){
    }
    
    public SmartPhone(String nombre, String color, Boolean disponible, String fabricante, double batería, String durabilidad,
            Double almacenamiento, double resolución) {
        super(nombre, color, disponible, fabricante);
        this.batería = batería;
        this.durabilidad = durabilidad;
        this.almacenamiento = almacenamiento;
        this.resolución = resolución;

        
    }

    @Override
    public String toString() {
        return "SmartPhone [fabricante=" + fabricante + 
               ", Disponibilidad=" + disponible + 
               ", Color=" + color + 
               ", Nombre=" + nombre +
               ", Batería=" + batería + 
               ", Durabilidad=" + durabilidad + 
               ", Almacenamiento=" + almacenamiento
                + ", Resolución=" + resolución + "]";
    }
    
    
    
}
