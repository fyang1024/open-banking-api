package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
public enum EnumProductCategory {
  PERS_AT_CALL_DEPOSITS,
  BUS_AT_CALL_DEPOSITS,
  TERM_DEPOSITS,
  RESIDENTIAL_MORTGAGES,
  PERS_CRED_AND_CHRG_CARDS,
  BUS_CRED_AND_CHRG_CARDS,
  PERS_LOANS,
  PERS_LEASING,
  BUS_LEASING,
  TRADE_FINANCE,
  PERS_OVERDRAFT,
  BUS_OVERDRAFT,
  BUS_LOANS,
  FOREIGN_CURR_AT_CALL_DEPOSITS,
  FOREIGN_CURR_TERM_DEPOSITS,
  FOREIGN_CURR_LOAN,
  FOREIGN_CURRRENCT_OVERDRAFT,
  TRAVEL_CARD;
}