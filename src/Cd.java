public class Cd extends Discos implements Laser {
    private String brand;
    private String capacidadMax = "700MB";

    public Cd(String brand){
        this.brand = brand;
    }

    @Override
    public void escribirLaser(String datos) {
        System.out.println("Escribiendo: " + datos + ". En el CD");
    }

    @Override
    public String leerDiscosLaser() {
        return "Leyendo datos del CD...";
    }

    @Override
    public void reportarInformacion() {
        System.out.println("Información del CD:  Esta es su marca: " + this.brand + ". Y esta su capacidad maxima: " + capacidadMax);
    }
}
