package org.example;

import java.util.ArrayList;
/**@Sophia Forero/
 *lista
 */
import java.util.List;

public class Main {

    private List<cumpleAgenda> Lista = new ArrayList<>();

    public List<cumpleAgenda> getLista() {
        return Lista;
    }
    /**@Sophia Forero/
     *lista
     */
    public void addCumple(cumpleAgenda cumple) {
        Lista.add(cumple);
    }
    /**@Sophia Forero/
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
    /**@Sophia Forero/
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
    /**@Sophia Forero/
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
/**@Sophia Forero/
 *lista
 */