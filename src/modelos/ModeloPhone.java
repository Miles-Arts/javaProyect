package modelos;


import anotaciones.Phone;
import anotaciones.Price;

@Phone(marca = "sony")
public class ModeloPhone {

    private String color;
    private int yearPhone;
    public String modelo;


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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Price(price = "expansive")
    public void moreGigasRam(){
        this.modelo = "iPhone 13";
    }


}
