package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta = "";
        System.out.println("introduce un conjuto de palabras separadas por ; ");
        String palabras = sc.nextLine();
        StringTokenizer st = new StringTokenizer(palabras, ";");
        int total = st.countTokens();
        Vector<String> lista = new Vector<String>(total);
        while (st.hasMoreTokens()) {
            lista.add(st.nextToken());
        }
        for (int i = 0; i < lista.size(); i++) {
            if (lista.elementAt(i).equals("boniato")) {
                System.out.println("se ha encontrado la palabra boniato, desea eliminarla s/n: ");
                respuesta = sc.nextLine();
                while (!respuesta.equals("s") && !respuesta.equals("n")) {
                    System.out.println("la respuesta es incorrecta, introduzca s o n");
                    respuesta = sc.nextLine();
                }
                if (respuesta.equals("s")) {
                    lista.remove(lista.elementAt(i));
                }
            }
        }
        palabras = "";
        for (int i = 0; i < lista.size(); i++) {
            if (i == lista.size() - 1) {
                palabras += lista.elementAt(i);
            } else {
                palabras += lista.elementAt(i) + ";";
            }
        }
        System.out.println(palabras);
    }
}