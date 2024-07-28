package Stra;

public class RutaMasEconomica implements RutaStrategy{
    public String calcularRuta(String puntoA, String puntoB) {

       return "Calculando la ruta más económica entre " + puntoA + " y " + puntoB + ". Costo : Q2.00.";
    }
}
