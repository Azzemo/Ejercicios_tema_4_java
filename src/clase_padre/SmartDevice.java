package clase_padre;

public abstract class SmartDevice {

    protected String nombre;
    protected String color;
    protected Boolean disponible;
    protected String fabricante;

    public SmartDevice(String nombre, String color, Boolean disponible, String fabricante) {
        this.nombre = nombre;
        this.color = color;
        this.disponible = disponible;
        this.fabricante = fabricante;


    }
}
