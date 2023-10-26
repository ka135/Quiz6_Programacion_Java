/**
 * Clase Circulo.
 * Hereda de FiguraGeometrica.
 */
class Circulo extends FiguraGeometrica{
    /**
     * Atributo.
     */
    private double radio;

    /**
     * Constructor de la clase.
     *
     * @param radio radio del Circulo
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Método para obtener el área del círculo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Método para obtener el perimetro del círculo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}
