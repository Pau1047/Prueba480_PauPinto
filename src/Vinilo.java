public class Vinilo extends Discos implements DiscoMagnetico {
    private String brand;
    private String capacidadMax = "15 minutos de musica por cadad cara";


    public Vinilo(String brand) {
        this.brand = brand;
    }


    @Override
    public String leerDiscos() {
        return "Leyendo datos del vinilo...";
    }

    @Override
    public void almacenarDatos(String datos) {
        System.out.println("Escribiendo: " + datos + ". En el vinilo");
    }

    @Override
    public void reportarInformacion() {
        System.out.println("Información del Vinilo:  Esta es su marca: " + this.brand + ". Y esta su capacidad maxima: " + capacidadMax);
    }
}
