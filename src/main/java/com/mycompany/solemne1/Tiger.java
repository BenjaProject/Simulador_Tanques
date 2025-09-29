
package com.mycompany.solemne1;

/**
 *
 * @author benja
 */
public class Tiger extends Tanque {
    private boolean tieneSistemaDeAireAcondicionado;
    private int id_trabajador;

    public Tiger() {
        this.tipo_tanque = Disparable.TIPO_TANQUE_TIGER;
        this.municion = Disparable.CANTIDAD_MUNICION_INICIAL_TIGER;
    }

    public Tiger(boolean tieneSistemaDeAireAcondicionado, int id_trabajador, int id) {
        super(id);
        this.tieneSistemaDeAireAcondicionado = tieneSistemaDeAireAcondicionado;
        this.id_trabajador = id_trabajador;
        this.tipo_tanque = Disparable.TIPO_TANQUE_TIGER;
        this.municion = Disparable.CANTIDAD_MUNICION_INICIAL_TIGER;
    }

    public boolean isTieneSistemaDeAireAcondicionado() {
        return tieneSistemaDeAireAcondicionado;
    }

    public void setTieneSistemaDeAireAcondicionado(boolean tieneSistemaDeAireAcondicionado) {
        this.tieneSistemaDeAireAcondicionado = tieneSistemaDeAireAcondicionado;
    }

    public int getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
    }

    @Override
    public String toString() {
        return "Tiger{" +super.toString()+ " tieneSistemaDeAireAcondicionado=" + tieneSistemaDeAireAcondicionado + ", id_trabajador=" + id_trabajador + '}';
    }

    @Override
    public void disparar(Tanque enemigo) {
       if (this.municion>0 && this.vivo){
          boolean moneda = Generador.generarBooleanAlAzar();
           System.out.println(this+" disparando a... "+enemigo);
          if(moneda){
              enemigo.vivo=false;
              enemigo.destruidoPor=this;
              System.out.println("Tanque enemigo destruido");
          }
          else{
              System.out.println("Fallo el disparo");
              
          }
          this.municion--;
       }
       
    }
    
    
}
