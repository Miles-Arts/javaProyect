import anotaciones.Phone;
import modelos.ModeloPhone;

public class Aplicacion {


    public static void main(String[] arg) {

            //@SuppressWarnings("unused") quita adevertencias
            ModeloPhone phone = new ModeloPhone("Blue", 2023);


            if (phone.getClass().getAnnotation(Phone.class) != null) {

                System.out.println("Es celular");

            } else {
                System.out.println("No es celular");
            }


            //System.out.println("Anotaciones @Java");
    }
}
