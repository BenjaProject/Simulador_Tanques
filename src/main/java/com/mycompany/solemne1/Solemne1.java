
package com.mycompany.solemne1;

public class Solemne1 {

    public static void main(String[] args) {
        Simulacion s = new Simulacion();
        System.out.println("\n----------Creacion Tanques----------\n");
        s.casoDeUsoCrearTanques();
        System.out.println("\n----------Estado Inicial Tanques----------\n");
        s.imprimirEstadoFinalTanque();
        System.out.println("\n----------Simulacion Tanque----------\n");
        s.simulacionTanques();
        System.out.println("\n----------Estado Final Tanques----------\n");
        s.imprimirEstadoFinalTanque();
    }
}
