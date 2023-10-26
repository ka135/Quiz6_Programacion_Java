/**
 * Clase Figura Geometrica.
 */
public class FiguraGeometrica {
    /**
     * Atributos.
     */
    private String nombre;
    private String color;

    /**
     * Constructor de la clase.
     *
     * @param nombre nombre de la Figura Geometrica
     * @param color color de la Figura Geometrica
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /**
     * Método para obtener el área de la figura.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        return 0.0;
    }
    /**
     * Método para obtener el perimetro de la figura.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerPerimetro() {
        return 0.0;
    }

    /**
     * Getter
     */

    /**
     * Método para obtener el nombre de la figura.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método para obtener el color de la figura.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter
     */

    /**
     * Método para establecer el nombre de la figura.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método para establecer el color de la figura.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setColor(String color) {
        this.color = color;
    }
}