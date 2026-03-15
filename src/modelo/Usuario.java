/*Java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gusta
 */
public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    
    public Usuario(int id, String nombre, String correo){
       this.id = id;
       this.nombre = nombre;
       this.correo = correo;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
        
    }
    
    public String getCorreo(){
        return correo;
    }
}
