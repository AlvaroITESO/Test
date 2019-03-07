package beans;

import android.graphics.drawable.Drawable;

public class Item_Product {

    //Atributos que contendrá el objeto Item_Product
    String nombreP;
    String nombreV;
    String telefono;
    String ubicacion;
    Drawable imagenP;
    Drawable imagenV;


    //Generamos get&set, toString y Constructor
    @Override
    public String toString() {
        return "Item_Product{" +
                "nombreP='" + nombreP + '\'' +
                ", nombreV='" + nombreV + '\'' +
                ", telefono='" + telefono + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", imagenP=" + imagenP +
                ", imagenV=" + imagenV +
                '}';
    }

    public Item_Product(String nombreP, String nombreV, String telefono, String ubicacion, Drawable imagenP, Drawable imagenV) {
        this.nombreP = nombreP;
        this.nombreV = nombreV;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.imagenP = imagenP;
        this.imagenV = imagenV;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Drawable getImagenP() {
        return imagenP;
    }

    public void setImagenP(Drawable imagenP) {
        this.imagenP = imagenP;
    }

    public Drawable getImagenV() {
        return imagenV;
    }

    public void setImagenV(Drawable imagenV) {
        this.imagenV = imagenV;
    }
}
