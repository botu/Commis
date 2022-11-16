package ru.pav.commis.service;

import org.springframework.stereotype.Service;
import ru.pav.commis.model.Clients;
import ru.pav.commis.model.Tariff;
import ru.pav.commis.persistence.entity.ClientEntity;
import ru.pav.commis.persistence.entity.HistoricalTarrif;

import java.util.HashSet;
import java.util.Set;

@Service
public class ClientService {
    public void postClient(Clients clients) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setClientId(clients.getClientId());
        clientEntity.setName(clients.getName());
        clientEntity.setMargin(clients.getMargin());
        Tariff tariff = clients.getTarif();
        if (tariff != null) {
            Set<HistoricalTarrif> historicalEntitySet = new HashSet<>();
            HistoricalTarrif historicalEntity = new HistoricalTarrif();
            historicalEntity.setClientId(clientEntity);
            //historicalEntity.set
            historicalEntitySet.add(historicalEntity);
            clientEntity.setHistoricalEntity(historicalEntitySet);

        }
    }
}
