package modelos;

import anotaciones.Option;
import anotaciones.Phone;
import anotaciones.Price;

@Phone(marca = "sony")
public class ModeloPhone {

    private String color;
    private int yearPhone;

    @Option(cargador = "conClable")
    public String usb;

    public ModeloPhone(String color, int yearPhone) {

        this.color = color;
        this.yearPhone = yearPhone;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearPhone() {
        return yearPhone;
    }

    public void setYearPhone(int yearPhone) {
        this.yearPhone = yearPhone;
    }

    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    @Price(price = "expansive")

    public void moreGigasRam(){
        System.out.println("Se  ejecuto el método desde -Interno-");
        this.usb = "iPhone 13";
    }
}
