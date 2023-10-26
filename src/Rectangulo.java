/**
 * Clase Rectangulo.
 * Hereda de FiguraGeometrica.
 */
class Rectangulo extends FiguraGeometrica {
    /**
     * Atributos.
     */
    private double lado1;
    private double lado2;

    /**
     * Constructor de la clase.
     *
     * @param lado1 lado 1 del Rectángulo
     * @param lado2 lado 2 del Rectángulo
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Método para obtener el área del rectángulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }

    /**
     * Método para obtener el perimetro del rectángulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}
