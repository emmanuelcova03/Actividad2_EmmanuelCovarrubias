// Declaracion de la clase
public class Actividad2 {

    // Atiubutos de la clase, "nombre" es el atributo tipo string que almacena el nombre del estudiante
    private String nombre;

    // "calificaciones" es el atributo array de tipo double para ingresar las calificaciones con decimales
    private double[] calificaciones;

    // Constructor de clase, recibe como parametro el nombre y el array con sus calificaciones
    // Luego asigna estos valores a los atributos correspondientes de la clase
    public Actividad2(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
    // Metodo "calcularPromedo", este calcula el promedio de las calificaciones almacenadas en el array
    // "calificaciones" itera sobre el array sumando las calificaciones
    // y luego divide la suma por la cantidad de calificaciones para obtener el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
    // Metodo "obtenerCalificacion", este recibe como parametro el promedio y devuelve la calificacion corresponidente
    public char obtenerCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
    // Metodo "imprimirResultados" este imprime en pantalla los resultados del estudiante
    // se usa un bucle for para recorrer las calificaciones y mostrarlas en el formato adecuado
    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio();
        char calificacion = obtenerCalificacion(promedio);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
    // Metodo "main" se crea el objeto que incluye el nombre, y el array de las calificaciones de las 5 materias
    // luego de llama al metodo "imprimirResultados()" para mostrar los resultados en la consola
    public static void main(String[] args) {
        String nombre = "Emmanuel Covarrubias";
        double[] calificaciones = {85.5, 79.2, 92.5, 84.3, 88.1};
        Actividad2 actividad2 = new Actividad2(nombre, calificaciones);
        actividad2.imprimirResultados();
    }
}
