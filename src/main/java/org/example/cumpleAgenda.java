package org.example;

/**@Sophia Forero/
 *cumple
 */
public class cumpleAgenda {

    private String Nombre;
    private int Dia;
    private int Mes;

    /**@Sophia Forero*
     * orden agenda
     * @param nombre
     * @param dia
     * @param mes
     */
    public cumpleAgenda(String nombre, int dia, int mes) {
        this.Nombre = nombre;
        this.Dia = dia;
        this.Mes = mes;
    }

    /**@Sophia Forero*
     * entero nombre
     * @return
     */
    public String getNombre() {
        return Nombre;
    }

    /**@Sophia Forero*
     *representar texto nombre
     * @return
     */
    public int getDia() {
        return Dia;
    }

    /**@Sophia Forero
     *representar texto dia
     * @return
     */
    public int getMes() {
        return Mes;
    }
}
/**@Sophia Forero*
 * representartextomes
 */