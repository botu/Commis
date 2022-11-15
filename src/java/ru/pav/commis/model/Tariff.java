package ru.pav.commis.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class Tariff {
    Integer id;
    String code;
    BigDecimal minSumm;
    BigDecimal maxSumm;
}
