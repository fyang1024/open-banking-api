package org.openbank.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The list of available product categories for categorising products and accounts
 */
public enum EnumProductCategory {
  
  PERS_AT_CALL_DEPOSITS("PERS_AT_CALL_DEPOSITS"),
  
  BUS_AT_CALL_DEPOSITS("BUS_AT_CALL_DEPOSITS"),
  
  TERM_DEPOSITS("TERM_DEPOSITS"),
  
  RESIDENTIAL_MORTGAGES("RESIDENTIAL_MORTGAGES"),
  
  PERS_CRED_AND_CHRG_CARDS("PERS_CRED_AND_CHRG_CARDS"),
  
  BUS_CRED_AND_CHRG_CARDS("BUS_CRED_AND_CHRG_CARDS"),
  
  PERS_LOANS("PERS_LOANS"),
  
  PERS_LEASING("PERS_LEASING"),
  
  BUS_LEASING("BUS_LEASING"),
  
  TRADE_FINANCE("TRADE_FINANCE"),
  
  PERS_OVERDRAFT("PERS_OVERDRAFT"),
  
  BUS_OVERDRAFT("BUS_OVERDRAFT"),
  
  BUS_LOANS("BUS_LOANS"),
  
  FOREIGN_CURR_AT_CALL_DEPOSITS("FOREIGN_CURR_AT_CALL_DEPOSITS"),
  
  FOREIGN_CURR_TERM_DEPOSITS("FOREIGN_CURR_TERM_DEPOSITS"),
  
  FOREIGN_CURR_LOAN("FOREIGN_CURR_LOAN"),
  
  FOREIGN_CURRRENCT_OVERDRAFT("FOREIGN_CURRRENCT_OVERDRAFT"),
  
  TRAVEL_CARD("TRAVEL_CARD");

  private String value;

  EnumProductCategory(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EnumProductCategory fromValue(String text) {
    for (EnumProductCategory b : EnumProductCategory.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

