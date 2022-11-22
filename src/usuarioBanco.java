import java.text.DecimalFormat;

public class usuarioBanco {
    DecimalFormat de = new DecimalFormat("##.00");

    String nombre, cedula;
    float cantidad;


    public usuarioBanco(){
        nombre = "";
        cedula = "";
        cantidad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "\n\tSu Usuario de Banco" +
                "\nNombre:" + nombre + '\n' +
                "Cedula:" + cedula + '\n' +
                "Cantidad de dinero:" + de.format(cantidad);
    }
}
