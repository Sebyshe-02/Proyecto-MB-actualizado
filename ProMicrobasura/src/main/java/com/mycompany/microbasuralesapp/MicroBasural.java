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
public class MicroBasural extends Caracteristicas {

    MicroBasural MB=new MicroBasural();
    ArrayList<MicroBasural> Lmb=new ArrayList<MicroBasural>();
    //Zona de prueba ID----------------------------------------------------------------
    Random Azar =new Random();

    public MicroBasural(float Latitud, float Longitud, int NCalle, String Calle, long ID) {
        super(Latitud, Longitud, NCalle, Calle, ID);
    }
    
    MicroBasural() {
    }

    public void setMB(MicroBasural MB) {
        this.MB = MB;
    }

    public void setLmb(ArrayList<MicroBasural> Lmb) {
        this.Lmb = Lmb;
    }

    public void setAzar(Random Azar) {
        this.Azar = Azar;
    }

    public void setLatitud(float Latitud) {
        this.Latitud = Latitud;
    }

    public void setLongitud(float Longitud) {
        this.Longitud = Longitud;
    }

    public void setNCalle(int NCalle) {
        this.NCalle = NCalle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    
    public MicroBasural getMB() {
        return MB;
    }

    public ArrayList<MicroBasural> getLmb() {
        return Lmb;
    }

    public Random getAzar() {
        return Azar;
    }
    /**
     * 
     * @return 
     */
    public float getLatitud(){
        return Latitud;
    }
    /**
     * 
     * @return 
     */
    public float getLongitud(){
        return Longitud;
    }
    /**
     * 
     * @return 
     */
    public long getID(){
        return ID;
    }
    /**
     * 
     * @return 
     */
    public String getCalle(){
        return Calle;
    }
    /**
     * 
     * @return 
     */
    public int getNCalle(){
        return NCalle;
    }


    //Comportamiento
    
    /**
     * 
     * @param Objeto 
     */
    public void Crear(MicroBasural objeto){
        //Agrega una ID aleatoria y se agrega al objeto creado en la interfaz grafica
        objeto.ID=Azar.nextLong(100 + 1)+1;
        Lmb.add(objeto);        
    }
   
    public void MostrarLista(){
        for(int i=0;i<Lmb.size();i++){
            System.out.println("Longitud: "+MB.Longitud);
            System.out.println("Latitud: "+MB.Latitud);
            System.out.println("Calle: "+MB.Calle);
            System.out.println("Numero de Calle: "+MB.NCalle);
        }    
    }
    
    public void BuscarCalle(String calle){
        for(int i=0;i<Lmb.size();i++){
            if(MB.Calle.equals(calle)){
            System.out.println("Longitud: "+MB.Longitud);
            System.out.println("Latitud: "+MB.Latitud);
            System.out.println("Calle: "+MB.Calle);
            System.out.println("Numero de Calle: "+MB.NCalle); 
            }
        }    
    }
   
    public void  Eliminar(long ID){ 
        if(MB.ID == ID){
            MB=null;
        }
    }

    public void Actualizar(int ID){
        
        MicroBasural nuevoMB=new MicroBasural();
        
                
        MB.setLongitud(nuevoMB.Longitud);
        MB.setLatitud(nuevoMB.Latitud);
        MB.setCalle(nuevoMB.Calle);
        MB.setNCalle(nuevoMB.NCalle);
        
    }

}