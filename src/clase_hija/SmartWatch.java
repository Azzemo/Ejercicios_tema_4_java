package clase_hija;

import clase_padre.SmartDevice;

public class SmartWatch extends SmartDevice{

    protected Boolean Medidor_de_tiempo;
    protected Boolean Podómetro;
    protected Boolean Manos_Libres;
    protected Boolean Monitorización_del_sueño;
    protected Double Bateria;

    public SmartWatch(){
    }
    
    public SmartWatch(String nombre, String color, Boolean disponible, String fabricante, Boolean medidor_de_tiempo, Boolean podómetro,
            Boolean manos_Libres, Boolean monitorización_del_sueño, Double bateria) {
        super(nombre, color, disponible, fabricante);
        this.Medidor_de_tiempo = medidor_de_tiempo;
        this.Podómetro = podómetro;
        this.Manos_Libres = manos_Libres;
        this.Monitorización_del_sueño = monitorización_del_sueño;
        this.Bateria = bateria;

        
    }

    @Override
    public String toString() {
        return "SmartWatch [fabricante=" + fabricante + 
               ", Disponibilidad=" + disponible + 
               ", Color=" + color + 
               ", Nombre=" + nombre + 
               ", Medidor_de_tiempo=" + Medidor_de_tiempo + 
               ", Podómetro=" + Podómetro + 
               ", Manos_Libres=" + Manos_Libres + 
               ", Monitorización_del_sueño=" + Monitorización_del_sueño + 
               ", Bateria=" + Bateria + "]";
    }

    
    
    
}
