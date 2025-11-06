package proyecto;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int edad;
    private List<Integer> calificaciones;

    public Usuario(int edad) {
        this.edad = edad;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarCalificacion(int calificacion) {
        if (calificacion < 0 || calificacion > 10) {
            throw new IllegalArgumentException("La calificación debe estar entre 0 y 10.");
        }
        calificaciones.add(calificacion);
    }



    private double getPromedio() {
        if (calificaciones.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Integer calificacion : calificaciones) {
            suma += calificacion;
        }
        double promedio = (suma / calificaciones.size());
        return promedio;
    }

    @Override
    public String toString() {
        String paso=  getPromedio()>6 ? "Aprobado" : "Reprobado";
        String promedioFormateado = String.format("%.2f", getPromedio());
        return "Edad: " + edad + ", Promedio: " + promedioFormateado + ", Estado: " + paso;

    }
}