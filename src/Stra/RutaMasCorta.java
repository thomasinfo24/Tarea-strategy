package Stra;

public class RutaMasCorta implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {

        return "Calculando la ruta más corta entre " + puntoA + " y " + puntoB + ". Distancia estimada: 5 km.";
    }
}
