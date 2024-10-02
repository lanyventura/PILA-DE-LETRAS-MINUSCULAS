package letrasminu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Agregar {

    public char[] agregarCaracter(char pila[]) {
        //char agregarValor;
        Scanner teclado = new Scanner(System.in);
        String valor;
        boolean esMinuscula = false;
        // el try catch sirve para que si se ingresa un dato distinto al esperado el programa no deje de funcionar
        try {
            //en la ultima posicion de la pila el ultimo valor tiene que ser diferente de vacio para poder decir que la pila esta llena
            if (pila[pila.length - 1] != '\u0000') {
                System.out.println("La pila ya esta llena");
            } else {                
                do {
                    System.out.print("Ingrese una cadena con solo letras minúsculas: ");
                    valor = teclado.nextLine();

                    // Patrón para validar solo letras minúsculas
                    Pattern patron = Pattern.compile("[a-z]+");
                    //verifica que coincida el valor que se le dio con el patron esperado
                    Matcher matcher = patron.matcher(valor);
                    //si el patron es diferente de el dato esperado, va a decir entrada invalida
                    if (!matcher.matches()) {
                        System.out.println("Entrada inválida. Solo se permiten letras minúsculas.");
                    } else {
                        //si es una letra minuscula validara el dato
                        esMinuscula = true;
                    }
                    // //si es diferente a boolean esMinuscula = false; = while (!esMinuscula); a validara el dato
                } while (!esMinuscula);

                System.out.println("Entrada válida: " + valor);

                //este for solo nos recorre el arreglo
                for (int i = 0; i < pila.length; i++) {
                    //si en la pilaencontramos un espacio con vacio
                    if (pila[i] == '\u0000') {
                        //se va a guardar el valor que agregamos en e primer espacio vacio que encuentre
                        pila[i] = valor.charAt(0);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("No es un valor valido");
        }
        //regresa el arreglo ya modificado
        return pila;
    }

}
