package ru.pav.commis.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Clients")
public class ClientEntity {
    @Id
    String clientId;

    String name;

    Boolean margin;


    @OneToMany
    @JoinColumn(referencedColumnName = "clientId")
    Set<HistoricalTarrif> historicalEntity;
}
