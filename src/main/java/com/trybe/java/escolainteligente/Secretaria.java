package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class Secretaria {

  /**
   * Método calcularMedia.
   */
  public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    return (nota1 + nota2 + nota3 + nota4) / 4;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    double grade1 = Double.parseDouble(scanner.next());
    double grade2 = Double.parseDouble(scanner.next());
    double grade3 = Double.parseDouble(scanner.next());
    double grade4 = Double.parseDouble(scanner.next());
    double average = Secretaria.calcularMedia(grade1, grade2, grade3, grade4);
    System.out.println("A média das notas de " + name + " é " + average);
  }
}
