package letrasminu;

public class Mostrar {
    public void mostarPila(char[] pila) {
        for (int i = pila.length - 1; i >= 0; i--) {
            if (pila[i] > 0) {
                System.out.print("[" + pila[i] + "]");
            }
        }
    }
    
}
