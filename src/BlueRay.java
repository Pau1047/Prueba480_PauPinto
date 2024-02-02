public class BlueRay extends Discos implements Laser {

    private String brand;
    private String capacidadMax = "50GB";

    public BlueRay(String brand){
        this.brand = brand;
    }

    @Override
    public void escribirLaser(String datos) {
        System.out.println("Escribiendo: " + datos + ". En BlueRay");
    }

    @Override
    public String leerDiscosLaser() {
        return "Leyendo datos del blueray...";
    }

    @Override
    public void reportarInformacion() {
        System.out.println("Información del Blue Ray:  Esta es su marca: " + this.brand + ". Y esta su capacidad maxima: " + capacidadMax);
    }
}
