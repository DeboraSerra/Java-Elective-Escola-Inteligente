package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class PessoaEstudante {

  /**
   * Método calcularIdadeEmDias.
   */
  public static int calcularIdadeEmDias(int anos, int meses, int dias) {
    int yearsInDays = anos * 365;
    int monthsInDays = meses * 30;
    return yearsInDays + monthsInDays + dias;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    int years = Integer.parseInt(scanner.next());
    int months = Integer.parseInt(scanner.next());
    int days = Integer.parseInt(scanner.next());
    int ageInDays = PessoaEstudante.calcularIdadeEmDias(years, months, days);
    System.out.println("A idade de " + name + " em dias é " + ageInDays + ".");
  }
}