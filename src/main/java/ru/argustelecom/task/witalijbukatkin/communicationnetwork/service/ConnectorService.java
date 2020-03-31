package ru.argustelecom.task.witalijbukatkin.communicationnetwork.service;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.entity.Connector;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateful
public class ConnectorService {
    @PersistenceContext
    private EntityManager em;

    public Collection<Connector> getAllForNode(String nodeId) {
        return em.createQuery("SELECT c FROM Connector c WHERE c.node = :node", Connector.class)
                .setParameter("node", nodeId)
                .getResultList();
    }
}
