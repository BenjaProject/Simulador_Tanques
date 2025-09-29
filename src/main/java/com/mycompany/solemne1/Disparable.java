
package com.mycompany.solemne1;

/**
 *
 * @author benja
 */
public interface Disparable {
    public int TIPO_TANQUE_TIGER = 1;
    public int TIPO_TANQUE_T34 = 2;
    public int CANTIDAD_MUNICION_INICIAL_TIGER = Generador.generarNumeroIntAlAzarEntreMinYMax(1, 5);
    public int CANTIDAD_MUNICION_INICIAL_T34 = Generador.generarNumeroIntAlAzarEntreMinYMax(1, 5);
    public void disparar(Tanque enemigo);
}
