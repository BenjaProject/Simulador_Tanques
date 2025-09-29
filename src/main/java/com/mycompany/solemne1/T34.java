
package com.mycompany.solemne1;

/**
 *
 * @author benja
 */
public class T34 extends Tanque {
    private int anioFabricacion;
    private int numeroDeSerie;

    public T34() {
        this.tipo_tanque = Disparable.TIPO_TANQUE_T34;
        this.municion = Disparable.CANTIDAD_MUNICION_INICIAL_T34;
    }

    public T34(int anioFabricacion, int numeroDeSerie, int id) {
        super(id);
        this.anioFabricacion = anioFabricacion;
        this.numeroDeSerie = numeroDeSerie;
        this.tipo_tanque = Disparable.TIPO_TANQUE_T34;
        this.municion = Disparable.CANTIDAD_MUNICION_INICIAL_T34;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    @Override
    public String toString() {
        return "T34{" +super.toString()+ " anioFabricacion=" + anioFabricacion + ", numeroDeSerie=" + numeroDeSerie + '}';
    }

    @Override
    public void disparar(Tanque enemigo) {
        if (this.municion>0 && this.vivo){
          boolean acierta = Generador.generarNumeroIntAlAzarEntreMinYMax(1, 4) == 1;
           System.out.println(this+" disparando a... "+enemigo);
          if(acierta){
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
