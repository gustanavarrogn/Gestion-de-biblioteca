/*Java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor;

import java.util.ArrayList;
import modelo.Libro;
/**
 *
 * @author gusta
 */
public class BibliotecaManager {
    private ArrayList<Libro> libros = new ArrayList<>();
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
        
    }
    
    public ArrayList<Libro> getLibros(){
        return libros;
    }
    
    public void eliminarLibro(int indice){
        if(indice>=0&& indice<libros.size()){
            libros.remove(indice);
    }
  }
}
