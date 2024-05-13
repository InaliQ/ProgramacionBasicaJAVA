package peliculas;

import java.util.List;

public class Peliculas {

    public static void main(String[] args) {
        Peli pelicula1 = new Peli(1, "Bob Sponja", true);
        Peli pelicula2 = new Peli(2, "Spider-Man 2", false);
        Peli pelicula3 = new Peli(3, "Musica, Amigos y Fiesta", true);
        
        gestorPelicula gesPelicula = new gestorPelicula();

        System.out.println("Agregando peliculas al gestor:");
        gesPelicula.agregarPelicula(pelicula1);
        gesPelicula.agregarPelicula(pelicula2);
        gesPelicula.agregarPelicula(pelicula3);
        System.out.println("Peliculas agregadas con exito.");

        int idAEliminar = 2;
        Peli peliculaAEliminar = gesPelicula.obtenerPeliculaPorId(idAEliminar);
        if (peliculaAEliminar != null) {
            System.out.println("\nEliminando la pelicula con ID " + idAEliminar + ": " + peliculaAEliminar.getNombre());
            gesPelicula.eliminarPelicula(idAEliminar);
            System.out.println("Pelicula eliminada con exito.");
        } else {
            System.out.println("\nNo se encontro ninguna pelicula con ID " + idAEliminar + " para eliminar.");
        }

        System.out.println("\nPeliculas disponibles despues :");
        List<Peli> peliculasDisponibles = gesPelicula.obtenerPeliculas();
        for (Peli pelicula : peliculasDisponibles) {
            System.out.println(pelicula.getNombre());
        }
    }   
}
