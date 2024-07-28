package Stra;

public class RutaMasRapida implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {

        return "Calculando la ruta más rápida entre " + puntoA + " y " + puntoB + ". Tiempo estimado: 15 minutos.";
    }
}
