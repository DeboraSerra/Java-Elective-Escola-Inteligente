package com.trybe.java.escolainteligente;

import java.util.Locale;
import java.util.Scanner;

public class Portaria {

  /**
   * Método emitirRelatorio.
   */
  public static void emitirRelatorio(int qtdFundamental1, int qtdFundamental2, int qtdMedio) {
    int total = qtdFundamental1 + qtdFundamental2 + qtdMedio;
    double percent1 = (double) qtdFundamental1 / total * 100;
    double percent2 = (double) qtdFundamental2 / total * 100;
    double percent3 = (double) qtdMedio / total * 100;
    System.out.println("----- Quantidade -----");
    System.out.println("Ensino Fundamental I: " + qtdFundamental1);
    System.out.println("Ensino Fundamental II: " + qtdFundamental2);
    System.out.println("Ensino Médio: " + qtdMedio);
    System.out.println();
    System.out.println("----- Percentual -----");
    System.out.println("Ensino Fundamental I: " + String.format((Locale)null, "%.1f",percent1) + "%");
    System.out.println("Ensino Fundamental II: " + String.format((Locale)null, "%.1f",percent2) + "%");
    System.out.println("Ensino Médio: " + String.format((Locale)null, "%.1f",percent3) + "%");
    System.out.println();
    System.out.println("TOTAL: " + total);
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);

    int preSchool = 0;
    int middleSchool = 0;
    int highSchool = 0;
    boolean isInLoop = true;

    while (isInLoop) {

      int control = scanner.nextInt();
      if (control == 1) {
        int age = scanner.nextInt();

        if (age >= 15) {
          highSchool += 1;
        } else if (age >= 11) {
          middleSchool += 1;
        } else {
          preSchool += 1;
        }
      } else if (control == 2) {
        isInLoop = false;
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    }

    emitirRelatorio(preSchool, middleSchool, highSchool);
    scanner.close();
  }
}
