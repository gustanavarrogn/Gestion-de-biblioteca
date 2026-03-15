/*Java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gusta
 */
public class Prestamo {
    
    private Libro libro;
    private Usuario usuario;
    private String fechaPrestamo;
    
    public Prestamo( Libro libro, Usuario usuario, String fechaPrestamo){
        this.libro = libro; 
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
               
    }
    
    public Libro getLibro(){
        return libro;
        
    }
    
    public Usuario getUsuario(){
        return usuario;
        
    }
    
    public String getFechaPrestamo(){
        return fechaPrestamo;
    }
}
