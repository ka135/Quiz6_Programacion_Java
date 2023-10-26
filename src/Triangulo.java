/**
 * Clase Triangulo.
 * Hereda de FiguraGeometrica.
 */
class Triangulo extends FiguraGeometrica {
    /**
     * Atributos.
     */
    private double base;   // La base del triángulo
    private double altura; // La altura del triángulo

    /**
     * Constructor de la clase.
     *
     * @param base base del Triángulo
     * @param base base del Triángulo
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método para obtener el área del triángulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return (base * altura)/2;
    }

    /**
     * Método para obtener el perimetro del triángulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}
