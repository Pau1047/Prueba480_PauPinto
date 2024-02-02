public class DiscoDuro extends Discos implements DiscoMagnetico {
    private String brand;
    private String capacidadMax = "20TB";

    public DiscoDuro(String brand){
        this.brand = brand;
    }


    @Override
    public String leerDiscos() {
        return "Leyendo datos del disco duro...";
    }

    @Override
    public void almacenarDatos(String datos) {
        System.out.println("Escribiendo: " + datos + ". En el disco duro");
    }

    @Override
    public void reportarInformacion() {
        System.out.println("Información del Disco duro:  Esta es su marca: " + this.brand + ". Y esta su capacidad maxima: " + capacidadMax);
    }

}
