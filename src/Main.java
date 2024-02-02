public class Main {
    public static void main(String[] args) {

        /*
        ¿Qué pasa con las ruedas y los frisbees? También son discos giratorios, pero no se utilizan para
        el almacenamiento de datos. ¿Cómo entrarían en este modelo de clases?
        - En mi caso implementarian solo la interfaz de discos.

        Analiza ahora el ejercicio completo desde el punto de vista que plantean los principios SOLID, si
        los conoces. ¿Se cumplen todos? Elabora un breve informe con tus razones.
        - He buscado que son los principios SOLID ya que no sabia que eran. Pero considero que no los cumple todos
        los principios ya que es una prueba y se busca demostras lo que sabemos, pero se podria hacer tod de una
        forma más compacta y sencilla.
        */

        DiscoDuro miDiscoDuro = new DiscoDuro("Samsung");
        miDiscoDuro.girarDiscos();
        miDiscoDuro.almacenarDatos("Hola me llamo Pau");
        miDiscoDuro.leerDiscos();
        miDiscoDuro.reportarInformacion();

        System.out.println("-------------------------------------------------------------------------------");

        Cd miCD = new Cd("Sonny");
        miCD.girarDiscos();
        miCD.escribirLaser("Mis apellidos son Pinto Sanchez");
        miCD.leerDiscosLaser();
        miCD.reportarInformacion();

        System.out.println("-------------------------------------------------------------------------------");

        Vinilo miVinilo = new Vinilo("Ritrama");
        miVinilo.girarDiscos();
        miVinilo.almacenarDatos("Estoy haciendo una prueba");
        miVinilo.leerDiscos();
        miVinilo.reportarInformacion();

        System.out.println("-------------------------------------------------------------------------------");

        BlueRay miBlueRay = new BlueRay("BlueRay");
        miBlueRay.girarDiscos();
        miBlueRay.escribirLaser("Para 480");
        miBlueRay.leerDiscosLaser();
        miBlueRay.reportarInformacion();
    }
}