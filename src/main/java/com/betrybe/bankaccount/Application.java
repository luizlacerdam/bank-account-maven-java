package com.betrybe.bankaccount;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    AccountNumberFormatter accountNumberFormatter = new AccountNumberFormatter();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o número da conta:");
    String accountNumber = scanner.nextLine();

    if (!StringUtils.isNumeric(accountNumber)) {
      System.out.println("Número da conta inválido!");
      return;
    }

    String returnAccountNumber = accountNumberFormatter.formatAccountNumber(Integer.parseInt(accountNumber));
    System.out.println("Número da conta: " + returnAccountNumber);
  }

}
