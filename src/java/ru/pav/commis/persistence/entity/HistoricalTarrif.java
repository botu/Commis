package ru.pav.commis.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "CLIENT_TARRIF")
public class HistoricalTarrif {
    @Id
    @GeneratedValue
    Integer id;


    @ManyToOne
    @JoinColumn
    ClientEntity clientId;
}
