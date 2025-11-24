package org.example;

import java.util.Scanner;

/**@Sophia Forero/
 *menu
 */
public class RepoFile {

    public static void main(String[] args) {

        Main repo = new Main();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            menu();

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    agenda(repo);
                    break;

                case "2":
                    dias(sc, repo);
                    break;

                case "3":
                    dias(repo, sc);
                    break;

                case "4":
                    cumpleaños(sc, repo);
                    break;

                case "5":
                    eliminarnombre(repo, sc);
                    break;

                case "6":
                    salir = isSalir();
                    break;
            }
        }
    }
    /**@Sophia Forero/
     *menu casos
     */
    private static boolean isSalir() {
        boolean salir;
        salir = true;
        return salir;
    }
    /**@Sophia Forero/
     *salir del menu
     */
    private static void eliminarnombre(Main repo, Scanner sc) {
        System.out.print(Constantes.ELIMINAR_NOMBRE);
        repo.eliminarPorNombre(sc.nextLine());
    }
    /**@Sophia Forero/
     *scanner
     */
    private static void cumpleaños(Scanner sc, Main repo) {
        System.out.print(Constantes.NOMBRE + " ");
        String nombre = sc.nextLine();
        System.out.print(Constantes.DÍA + " ");
        int d = Integer.parseInt(sc.nextLine());
        System.out.print("Mes: ");
        int m = Integer.parseInt(sc.nextLine());
        repo.addCumple(new cumpleAgenda(nombre, d, m));
    }
    /**@Sophia Forero/
     *scanner
     */
    private static void dias(Main repo, Scanner sc) {
        System.out.print(Constantes.NOMBRE + " ");
        cumpleAgenda c = repo.buscarPorNombre(sc.nextLine());
        if (c != null) System.out.println(c.getNombre());
    }
    /**@Sophia Forero/
     *scanner
     */
    private static void dias(Scanner sc, Main repo) {
        System.out.print(Constantes.DÍA + " ");
        int dia = Integer.parseInt(sc.nextLine());
        for (cumpleAgenda c : repo.buscarPorDia(dia)) {
            System.out.println(c.getNombre());
        }
    }
    /**@Sophia Forero/
     *scanner
     */
    private static void agenda(Main repo) {
        for (cumpleAgenda c : repo.getLista()) {
            System.out.println(c.getNombre());
        }
    }
    /**@Sophia Forero/
     *scanner
     */
    private static void menu() {
        System.out.println(Constantes.AGENDA);
        System.out.println(Constantes.LISTAR);
        System.out.println(Constantes.BUSCAR_POR_DÍA);
        System.out.println(Constantes.BUSCAR_POR_NOMBRE);
        System.out.println(Constantes.AÑADIR);
        System.out.println(Constantes.ELIMINAR);
        System.out.println(Constantes.SALIR);
    }
}
/**@Sophia Forero/
 *imprimir menu
 */