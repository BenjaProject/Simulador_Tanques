package com.mycompany.solemne1;

/**
 *
 * @author benja
 */
public class Simulacion {
   AlmacenTanques at = new AlmacenTanques();
   int cantidad = Generador.generarNumeroIntAlAzarEntreMinYMax(10, 20);
   int cantTigers = cantidad/2;
   int cantT34  = cantidad-cantTigers;
   public void casoDeUsoCrearTanques(){
       for (int i = 0;i<cantTigers;i++){
           Tiger t = new Tiger(Generador.generarBooleanAlAzar(),Generador.generarNumeroIntAlAzarEntreMinYMax(1, 100),i);
           at.almacenarTanque(t);
           
       }
       for (int i =0;i<cantT34;i++){
           T34 t = new T34(Generador.generarNumeroIntAlAzarEntreMinYMax(1910, 1930),Generador.generarNumeroIntAlAzarEntreMinYMax(100,1000),i+cantTigers);
           at.almacenarTanque(t);
       }
       
   }
   
   public void imprimirEstadoFinalTanque(){
       int vivosTigers = 0;
       int vivosT34 = 0;
       for(int i=0;i<cantTigers;i++){
           Tiger t = at.obtenerTanqueTiger(i);
           System.out.println(t);
           if(t.vivo){
               vivosTigers++;
           }
       }
       for(int i=0;i<cantT34;i++){
           T34 t = at.obtenerTanqueT34(i);
           System.out.println(t);
           if(t.vivo){
               vivosT34++;
           }
       }
       System.out.println("------VIVOS-----");
       System.out.println("Tigers = "+vivosTigers+"\n"+"T34 = "+vivosT34);
               
   }
   
   public void simulacionTanques(){
       for (int i=0;i<cantT34;i++){
           T34 t = at.obtenerTanqueT34(i);
           Tiger enemigo = at.obtenerTanqueTiger(Generador.generarNumeroIntAlAzarEntreMinYMax(0, cantTigers));
           t.disparar(enemigo);
       }
       for (int i=0;i<cantTigers;i++){
           Tiger t = at.obtenerTanqueTiger(i);
           T34 enemigo = at.obtenerTanqueT34(Generador.generarNumeroIntAlAzarEntreMinYMax(0, cantT34));
           t.disparar(enemigo);
           
       }
   }
}
