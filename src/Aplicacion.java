import anotaciones.Option;
import anotaciones.Phone;
import anotaciones.Price;
import modelos.ModeloPhone;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Aplicacion {


    public static void main(String[] arg) {

            //@SuppressWarnings("unused") quita adevertencias
            ModeloPhone phone = new ModeloPhone("Blue", 2023);

//            phone.getClass().getAnnotation(Phone.class);
//            if (phone.getClass().getAnnotation(Phone.class) != null) {
//
//                System.out.println("Es celular");
//
//            } else {
//
//                System.out.println("No es celular");
//            }


            if(phone.getClass().isAnnotationPresent(Phone.class)){

                System.out.println("Es Celular");
            }else {
                System.out.println("No es Celular");
            }

        for(Method metodo : phone.getClass().getMethods()) {


            if(metodo.getAnnotation(Price.class) != null) {

                System.out.println("This method -" + metodo.getName() + "- is expansive");

            }
        }

        for(Field field : phone.getClass().getFields() ) {

            if(field.getAnnotation(Option.class) != null) {

                System.out.println("El atributo cargador -" + field.getName() + "- is optional");

            }
        }
    }
}

