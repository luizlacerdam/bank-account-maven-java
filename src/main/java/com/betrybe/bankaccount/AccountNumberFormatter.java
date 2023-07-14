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
    String StringAccountNumber = Integer.toString(literalAccountNumber);
    if (StringAccountNumber.length() < 6) {
       StringAccountNumber=  StringUtils.leftPad(StringAccountNumber, 6, '0');
    }
    return StringAccountNumber;
  }
}
