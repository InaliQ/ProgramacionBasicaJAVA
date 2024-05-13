package peliculas;

import java.util.ArrayList;
import java.util.List;

public class gestorPelicula {
    private final List<Peli> peliculas;

    public gestorPelicula() {
        this.peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Peli pelicula) {
        peliculas.add(pelicula);
    }

    public void eliminarPelicula(int id) {
        peliculas.removeIf(p -> p.getId() == id);
    }

    public List<Peli> obtenerPeliculas() {
        return peliculas;
    }

    public List<Peli> obtenerPeliculasDisponibles() {
        List<Peli> disponibles = new ArrayList<>();
        for (Peli pelicula : peliculas) {
            if (pelicula.isDisponible()) {
                disponibles.add(pelicula);
            }
        }
        return disponibles;
    }

    public List<Peli> obtenerPeliculasNoDisponibles() {
        List<Peli> noDisponibles = new ArrayList<>();
        for (Peli pelicula : peliculas) {
            if (!pelicula.isDisponible()) {
                noDisponibles.add(pelicula);
            }
        }
        return noDisponibles;
    }

    public void marcarPeliculaComoDisponible(int id) {
        for (Peli pelicula : peliculas) {
            if (pelicula.getId() == id) {
                pelicula.setDisponible(true);
                break;
            }
        }
    }
    
    public Peli obtenerPeliculaPorId(int id) {
        for (Peli pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null;
    }
}
