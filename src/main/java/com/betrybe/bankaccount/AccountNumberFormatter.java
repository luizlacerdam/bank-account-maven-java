package com.betrybe.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String stringAccountNumber = Integer.toString(literalAccountNumber);
    if (stringAccountNumber.length() == 6) {
      return stringAccountNumber;
    } else if (stringAccountNumber.length() < 6) {
      stringAccountNumber =  StringUtils.leftPad(stringAccountNumber, 6, '0');
    } else if (stringAccountNumber.length() > 6) {
      stringAccountNumber =  StringUtils.right(stringAccountNumber, 6);
    }
    return stringAccountNumber;
  }
}
