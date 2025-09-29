/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solemne1;

/**
 *
 * @author benja
 */
public abstract class Tanque implements Disparable {
    protected int tipo_tanque;
    protected  int id;
    protected boolean vivo = true;
    protected int municion;
    protected Tanque destruidoPor = null;

    public Tanque() {
    }

    public Tanque(int id) {
        this.id = id;
        
    }

    public int getTipo_tanque() {
        return tipo_tanque;
    }

    public void setTipo_tanque(int tipo_tanque) {
        this.tipo_tanque = tipo_tanque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public Tanque getDestruidoPor() {
        return destruidoPor;
    }

    public void setDestruidoPor(Tanque destruidoPor) {
        this.destruidoPor = destruidoPor;
    }

    @Override
    public String toString() {
        return "Tanque{" + "tipo_tanque=" + tipo_tanque + ", id=" + id + ", vivo=" + vivo + ", municion=" + municion + ", destruidoPor=" + destruidoPor + '}';
    }
    public void finalize(){
        System.out.println("Tanque rip");
    }
    
}

