package org.example;

import java.util.ArrayList;
/**@autor Sophia Forero/
 *lista
 */
import java.util.List;

public class Main {

    private List<cumpleAgenda> Lista = new ArrayList<>();

    public List<cumpleAgenda> getLista() {
        return Lista;
    }
    /**@autor Sophia Forero/
     *lista
     */
    public void addCumple(cumpleAgenda cumple) {
        Lista.add(cumple);
    }
    /**@autor Sophia Forero/
     *lista
     */
    public cumpleAgenda buscarPorNombre(String nombre) {
        for (cumpleAgenda c : Lista) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }
    /**@autor Sophia Forero/
     *lista
     */
    public List<cumpleAgenda> buscarPorDia(int dia) {
        List<cumpleAgenda> resultado = new ArrayList<>();
        for (cumpleAgenda c : Lista) {
            if (c.getDia() == dia) {
                resultado.add(c);
            }
        }
        return resultado;
    }
    /**@autor Sophia Forero/
     *lista
     */
    public boolean eliminarPorNombre(String nombre) {
        cumpleAgenda encontrado = buscarPorNombre(nombre);
        if (encontrado != null) {
            Lista.remove(encontrado);
            return true;
        }
        return false;
    }
}
/**@autor Sophia Forero/
 *lista
 */