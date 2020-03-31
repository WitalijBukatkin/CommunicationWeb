package ru.argustelecom.task.witalijbukatkin.communicationnetwork.service;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.to.LinkTo;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateful
public class LinkService {
    @PersistenceContext
    private EntityManager em;

    public List<LinkTo> getAll(long connectorId) {
        return em.createQuery("SELECT NEW ru.argustelecom.task.witalijbukatkin.communicationnetwork.to." +
                "LinkTo(L.id, L.sourceConnector.id, L.sourcePoint, L.targetConnector.id, L.targetPoint)" +
                " FROM Link L " +
                " WHERE L.sourceConnector.id = :connectorId" +
                " OR L.targetConnector.id = :connectorId", LinkTo.class)
                .setParameter("connectorId", connectorId)
                .getResultList();
    }
}
