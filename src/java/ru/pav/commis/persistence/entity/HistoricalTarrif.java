package ru.pav.commis.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import ru.pav.commis.model.Tariff;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "CLIENT_TARIFF")
@Getter
@Setter
public class HistoricalTarrif {
    @Id
    @GeneratedValue
    Integer id;

    Date dateSince;
    Date dateAfter;
    
    
    @Column(name = "TARIFF_ID")
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")        
    TariffEntity tariffEntity;
    

    @ManyToOne
    @JoinColumn(referencedColumnName = "clientId")
    ClientEntity clientId;
}
