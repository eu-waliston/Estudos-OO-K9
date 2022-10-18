package Banco;

import java.util.Arrays;

public class Precos {
    public static void main(String[] args) {
        /*
        //array `Normal`
        double[] precos = new double[100];
        precos[0] = 130.0;
        precos[99] = 17.9;

        //´arrays de arrays´
        double[][] arrays = {
                new double[]{1.5, 3.7},
                new double[]{6.6, 9.7, 6.7},
                new double[]{8.5, 2.8, 7.5, 8.6}
        };

        //Percorrendo arrays
        for(int i  = 0; i < arrays.length; i ++ ) {
            System.out.println(Arrays.stream(arrays[i]));
        }
        for(double[] i : arrays) {
            System.out.println(i);
        }


         */
        //Operações - ordenando arrays
        String[] nomes = new String[]{"rafael cosentino", "jonas hirata", "marcelo martins" };
        Arrays.sort(nomes);

        for(String nome : nomes ) {
            System.out.println(nome);
        }

        String[] nomes2 = Arrays.copyOf(nomes, 10);

        System.out.println("Copia do primero array");
        for(String nome2 : nomes2 ) {
            System.out.println(nome2);
        }
    }
}
