package org.example;

import java.util.Scanner;

public class RepoFile {

    public static void main(String[] args) {

        Main repo = new Main();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println(Constantes.AGENDA);
            System.out.println(Constantes.LISTAR);
            System.out.println(Constantes.BUSCAR_POR_DÍA);
            System.out.println(Constantes.BUSCAR_POR_NOMBRE);
            System.out.println(Constantes.AÑADIR);
            System.out.println(Constantes.ELIMINAR);
            System.out.println(Constantes.SALIR);

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    for (cumpleAgenda c : repo.getLista()) {
                        System.out.println(c.getNombre());
                    }
                    break;

                case "2":
                    System.out.print(Constantes.DÍA + " ");
                    int dia = Integer.parseInt(sc.nextLine());
                    for (cumpleAgenda c : repo.buscarPorDia(dia)) {
                        System.out.println(c.getNombre());
                    }
                    break;

                case "3":
                    System.out.print(Constantes.NOMBRE + " ");
                    cumpleAgenda c = repo.buscarPorNombre(sc.nextLine());
                    if (c != null) System.out.println(c.getNombre());
                    break;

                case "4":
                    System.out.print(Constantes.NOMBRE + " ");
                    String nombre = sc.nextLine();
                    System.out.print(Constantes.DÍA + " ");
                    int d = Integer.parseInt(sc.nextLine());
                    System.out.print("Mes: ");
                    int m = Integer.parseInt(sc.nextLine());
                    repo.addCumple(new cumpleAgenda(nombre, d, m));
                    break;

                case "5":
                    System.out.print(Constantes.ELIMINAR_NOMBRE);
                    repo.eliminarPorNombre(sc.nextLine());
                    break;

                case "6":
                    salir = true;
                    break;
            }
        }
    }
}
