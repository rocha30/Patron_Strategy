//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("Universidad", "Casa");

        // Cambiar a otra estrategia
        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("Universidad", "Cayala");

        // TODO: Añadir más ejemplos con diferentes estrategias

        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Universidad", "GYM");

    }
}
