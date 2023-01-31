import clase_hija.SmartPhone;
import clase_hija.SmartWatch;

public class Main {
    public static void main(String[] args) {
        

        SmartPhone Xiaomi_Redmi_Note_11S = new SmartPhone("Xiaomi_Redmi_Note_11S", "Negro", true,
        "Xiaomi", 5000, "5 años", 64.0, 6.43);

        System.out.println(Xiaomi_Redmi_Note_11S);

        SmartWatch Apple_Reloj_SE = new SmartWatch("Apple_Reloj_SE", "azul oscuro", true, "Apple", true, true, true, true, 9.0);

        System.out.println(Apple_Reloj_SE);
    }
    
}
