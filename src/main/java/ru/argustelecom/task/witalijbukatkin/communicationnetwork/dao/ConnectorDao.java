package ru.argustelecom.task.witalijbukatkin.communicationnetwork.dao;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.entity.Connector;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateful
public class ConnectorDao {
    @PersistenceContext
    private EntityManager em;

    public Collection<Connector> getAllForNode(long node){
        return em.createQuery("SELECT c FROM Connector c WHERE c.node = :node", Connector.class)
                .setParameter("node", node)
                .getResultList();
    }
}
