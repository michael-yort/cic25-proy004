public class Sumatorio {

    int s1[];

    public void lanzar() {

        int a = 0;

        a = 5;
        s1 = new int[1000];

        for (int i = 0; i < s1.length; i++) {

            s1[i] = i + 1;

        }

        int suma = 0;

        for (int i = 0; i < s1.length; i++) {

            suma += s1[i];
        }

        // int b[]=new int [10];

        // Array de tamaño CERO
        // int c[]=new int [] {};

        // Array con contenido.
        // int d[]=new int [] {1,2,3,4,5,6,7,8,9,10};

        suma = 0;
        //REVISAR
        //Problema de Git resuelto
        for (int i = s1.length - 1; i >= 0; i--) {
            suma += s1[1];
        }

    }
}
