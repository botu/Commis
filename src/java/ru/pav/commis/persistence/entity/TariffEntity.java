package ru.pav.commis.persistence.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "TARIFF")
@Getter
@Setter
public class TariffEntity {
    @Id
    @GeneratedValue
    Integer id;

    String name;
    String code;

}
