/*Java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gusta
 */
public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int anio;
    
    public Libro(int id, String titulo, String autor, int anio){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        
    }
    
    public int getID(){
        return id;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAnio(){
        return anio;
    }
}
    
