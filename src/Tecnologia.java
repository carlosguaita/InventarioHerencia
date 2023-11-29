public class Tecnologia extends Producto{

    private String fabricante;
    private double voltaje;

    public Tecnologia(String tipo,String nombre, double precio, String codigo, int cantidad, String marca, String fabricante, double voltaje) {
        super(tipo,nombre, precio, codigo, cantidad, marca);
        this.fabricante = fabricante;
        this.voltaje = voltaje;
    }

    public Tecnologia() {
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }
}
