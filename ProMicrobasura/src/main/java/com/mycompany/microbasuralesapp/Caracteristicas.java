/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.microbasuralesapp;

/**
 *
 * @author Luz Pinto Castillo
 * @author Sebastian Henriquez Cartagena
 */
public abstract class Caracteristicas {
    public float Latitud;
    public float Longitud;
    public int NCalle;
    public String Calle;
    public long ID;

    public Caracteristicas(float Latitud, float Longitud, int NCalle, String Calle, long ID) {
        this.Latitud = Latitud;
        this.Longitud = Longitud;
        this.NCalle = NCalle;
        this.Calle = Calle;
        this.ID = ID;
    }

    
    public Caracteristicas() {
    }

    
    
    public abstract void Eliminar(long ID);
            
}