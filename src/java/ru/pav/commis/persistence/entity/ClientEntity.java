package ru.pav.commis.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Clients")
@Getter
@Setter
public class ClientEntity {
    @Id
    String clientId;

    String name;

    Boolean margin;


    @OneToMany
    @JoinColumn(referencedColumnName = "clientId")
    Set<HistoricalTarrif> historicalEntity;
}
