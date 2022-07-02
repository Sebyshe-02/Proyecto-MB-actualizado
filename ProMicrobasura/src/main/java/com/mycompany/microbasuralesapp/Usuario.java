/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.microbasuralesapp;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luz Pinto Castillo
 * @author Sebastian Henriquez Cartagena
 */
public class Usuario implements Interfaz{
    //Globales
    
    public Usuario usuarios=new Usuario();
    public ArrayList<Consejo> LConsejos=new ArrayList<Consejo>();
    public ArrayList<MicroBasural> LMicroBasurales=new ArrayList<MicroBasural>();
    public ArrayList<Usuario> LUsuarios=new ArrayList<Usuario>();
           
    //Atributos
    private String Nickname;
    private String Nombre;
    private String Correo;
    private String ID;
    private String password;
    
    public Usuario(){
        
    }
    /**
     * 
     * @param Nickname
     * @param Nombre
     * @param Correo
     * @param ID 
     */
    public Usuario(String Nickname, String Nombre, String Correo, String ID, String password){
        this.Nickname = Nickname;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.ID = ID;
        this.password = password;
    }

    //Accesores
    /**
     *
     * @return 
     */
    public String getNickname() {
        return Nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 
     * @return 
     */
    public String getNombre(){
        return Nombre;
    }
    /**
     * 
     * @return 
     */
    public String getCorreo(){
        return Correo;
    }
    /**
     * 
     * @return 
     */
    public String getID(){
        return ID;
    }
    
    //Mutadores
    
    /**
     * 
     * @param Nickname1 
     */
    public void setNickname(String Nickname1){
        Nickname = Nickname1;
    }
    /**
     * 
     * @param Nombre1 
     */
    public void setNombre(String Nombre1){
        Nombre = Nombre1;
    }
    /**
     * 
     * @param Correo1 
     */
    public void setCorreo(String Correo1){
        Correo = Correo1;
    }
    /**
     * 
     * @param ID1 
     */
    public void setID(String ID1){
        ID = ID1;
    }
    
    //Comportamientos
    
    /**
     * 
     * @param Objeto 
     */
    public void CrearUsuario(Usuario objeto){
        
        LUsuarios.add(objeto);
    }
    
    public Usuario BuscarUsuario(String nickname){
            
        if(usuarios.Nickname.equals(nickname)){
            System.out.println("Nickname: "+usuarios.Nickname);
            System.out.println("Nombre: "+usuarios.Nombre);
            System.out.println("Correo: "+usuarios.Correo);
            return usuarios;
        }
        return null;
    }
    
    public void MostrarLista(){
        
        System.out.println("Nombre de usuario: "+usuarios.Nickname);
        System.out.println("Nombre: "+usuarios.Nombre);
        System.out.println("Correo electronico: "+usuarios.Correo);
    } 
    
    public int Eliminar(String ID){
        
        if(ID.equals(usuarios.ID)){
            usuarios=null;
            return 0;
        }
        return 1;
    }

    public void Actualizar(String ID){
        
        Usuario nuevoUsuario=new Usuario();
        
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Ingresar un Nickname");
        nuevoUsuario.Nickname=Entrada.next();
        
        System.out.println("Ingresar Nombre");
        nuevoUsuario.Nombre=Entrada.next();
        
        System.out.println("Ingrese un Correo");
        nuevoUsuario.Correo=Entrada.next();
        
        usuarios.setNickname(nuevoUsuario.Nickname);
        usuarios.setNombre(nuevoUsuario.Nombre);
        usuarios.setCorreo(nuevoUsuario.Correo);
        
    }
}
