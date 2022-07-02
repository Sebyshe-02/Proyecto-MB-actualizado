/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.microbasuralesapp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luz Pinto Castillo
 * @author Sebastian Henriquez Cartagena
 */
public class Basurero extends Caracteristicas implements Interfaz{
    public ArrayList<Consejo> LConsejo=new ArrayList<Consejo>();
    public ArrayList<Basurero>LBasurero=new ArrayList<Basurero>();

    private int Tipo;

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public float getLatitud() {
        return Latitud;
    }

    public float getLongitud() {
        return Longitud;
    }

    public int getNCalle() {
        return NCalle;
    }

    public String getCalle() {
        return Calle;
    }

    public long getID() {
        return ID;
    }

    public Basurero(float Latitud, float Longitud, int NCalle, String Calle, long ID) {
        super(Latitud, Longitud, NCalle, Calle, ID);
    }

    public Basurero() {
    }   
    
    public void InsertarDato(){
        float Latitud,Longitud;
        int NCalle, opcion;
        String Calle;
        Random Azar =new Random();
        //La ID se agrego con random aun a prueba
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Digite su Latitud");
        Latitud=Entrada.nextFloat();
        System.out.println("Ingrese su Longitud");
        Longitud=Entrada.nextInt();
        System.out.println("Ingrese el tipo de basura //1:Pilas 2:Plastico 3:Papel 4:Vidrio 5:Organico 6:Metales");
        opcion = Entrada.nextInt();
        switch(opcion){
            case 1:
                Tipo= Interfaz.Pilas;
            break;
            
            case 2:
                Tipo= Interfaz.Plastico;
            break;
            
            case 3:
                Tipo= Interfaz.Papel;
            break;
            
            case 4:
                Tipo= Interfaz.Vidrio;
            break;
            
            case 5:
                Tipo= Interfaz.Organico;
            break;
            
            case 6:
                Tipo= Interfaz.Metales;
            break;
            
        }
        System.out.println("Ingrese combre de la calle");
        Calle=Entrada.next();
        System.out.println("Ingrese el numero de calle");
        NCalle=Entrada.nextInt();
        //NOTA: Agregar metodo para implementar un ID automatico a cada Basurero al ser agregado a la BD.
        ID=Azar.nextLong(100 + 1)+1;
        Basurero basurero=new Basurero(Latitud,Longitud,NCalle,Calle,ID);
        LBasurero.add(basurero);
        /*if((Entrada>6)||(Entrada<1)){
            System.out.println("Ingresar tipo valido\n");
        }else{
            Tipo=Entrada.next;
        }
        */
    }

    @Override
    public void Eliminar(long ID) {
        for(int i=0;i<LBasurero.size();i++){
            
            if(LBasurero.get(i).ID==ID){
                LBasurero.remove(i);
            }
        }
    }
    
    public Basurero BuscarCalle(String calle){
        
        for(int i=0;i<LBasurero.size();i++){
            
            if(LBasurero.get(i).Calle.equals(calle)){
                System.out.println(LBasurero.get(i).Tipo+" "+LBasurero.get(i).ID+" " +LBasurero.get(i).Calle+" " +LBasurero.get(i).NCalle+" "+LBasurero.get(i).Latitud+" "+LBasurero.get(i).Longitud);
                return LBasurero.get(i);    
            }
        }
        
        return null;
    }
    
        
    public Basurero BuscarTipo(int Tipo){  
        for(int i=0;i<LBasurero.size();i++){
            
            if(LBasurero.get(i).Tipo==Tipo){
                System.out.println(LBasurero.get(i).Tipo+" "+LBasurero.get(i).ID+" " +LBasurero.get(i).Calle+" " +LBasurero.get(i).NCalle+" " +LBasurero.get(i).Tipo+" "+LBasurero.get(i).Latitud+" "+LBasurero.get(i).Longitud);
                return LBasurero.get(i);    
            }
        }
        return null;
    }
    
    public void MostrarLista(){
        
        for(int i =0;i<LBasurero.size();i++){
                System.out.println("ID: "+LBasurero.get(i).ID);
                System.out.println("Tipo: "+LBasurero.get(i).Tipo);
                System.out.println("Calle: "+LBasurero.get(i).Calle);
                System.out.println("Numero Calle: "+LBasurero.get(i).NCalle);
                System.out.println("Latitud: "+LBasurero.get(i).Latitud);
                System.out.println("Longitud: "+LBasurero.get(i).Longitud);
        }
    }
}