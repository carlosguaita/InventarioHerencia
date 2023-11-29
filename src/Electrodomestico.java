public class Electrodomestico extends Producto{

    private String fabricante;
    private double voltaje;

    private int aniosGarantia;

    public Electrodomestico(String tipo, String nombre, double precio, String codigo, int cantidad, String marca, String fabricante, double voltaje, int aniosGarantia) {
        super(tipo, nombre, precio, codigo, cantidad, marca);
        this.fabricante = fabricante;
        this.voltaje = voltaje;
        this.aniosGarantia = aniosGarantia;
    }

    public Electrodomestico() {
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

    public int getAniosGarantia() {
        return aniosGarantia;
    }

    public void setAniosGarantia(int aniosGarantia) {
        this.aniosGarantia = aniosGarantia;
    }
}
