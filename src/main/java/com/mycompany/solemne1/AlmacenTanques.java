package com.mycompany.solemne1;
import java.util.ArrayList;
/**
 *
 * @author benja
 */
public class AlmacenTanques {
    private ArrayList<Tiger> tigers = new ArrayList<>();
    private ArrayList<T34> t34s = new ArrayList<>();
    
    
    public boolean almacenarTanque(Tanque unTanque){
        if("Tiger".equals(unTanque.getClass().getSimpleName())){
            return tigers.add((Tiger) unTanque);
            
        }
        else{
            return t34s.add((T34) unTanque);
        }
    }
    public Tiger obtenerTanqueTiger(int index){
        return tigers.get(index);
    }
    public T34 obtenerTanqueT34(int index){
        return t34s.get(index);
    }
    public int cantidadTigers(){
        return tigers.size();
    }
    public int cantidadT34(){
        return t34s.size();
    }
}
