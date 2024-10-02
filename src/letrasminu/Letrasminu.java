package letrasminu;

import java.util.Scanner;

public class Letrasminu {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Agregar agregar = new Agregar();
        Mostrar mostar = new Mostrar();

        //System.out.println("Ingresa el tamano de la pila:");
        int tamPila = ingresarValor();
        char[] pila = new char[tamPila];

        // creamos un ciclo 
        do {
            //Crear menu de opciones
            System.out.println("\nQue deseas hacer? \n1.-Agregar \n2.-Mostrar \n3.-eliminar \n4.-llenar automaticamente \n5.-salir");

            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1 ->
                    pila = agregar.agregarCaracter(pila);
                case 2 ->
                    mostar.mostarPila(pila);
                //System.out.println("pila: " + pila[0]);
                //case 3 ->
                //salir();
                default ->
                    System.out.println("opcion no valida");

            }
        } while (true);

    }

    public static int ingresarValor() {
        //try {
        Scanner teclado = new Scanner(System.in);
        int tampila;
        // pedir el tamaño de pila
        System.out.println("Ingresa el tamaño de la pila");
        if (!teclado.hasNextInt()) {
            ingresarValor();
        } else {
            tampila = teclado.nextInt();
            return tampila;
        }
        //} catch (Exception e) {
        //}
        return 0;
    }

}
