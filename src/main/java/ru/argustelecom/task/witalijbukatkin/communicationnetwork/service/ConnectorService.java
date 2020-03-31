/*
 * Copyright (c) 2020. Witalij Bukatkin
 * Github profile: https://github.com/witalijbukatkin
 */

package ru.argustelecom.task.witalijbukatkin.communicationnetwork.service;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.to.ConnectorTo;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateful
public class ConnectorService {
    @PersistenceContext
    private EntityManager em;

    public Collection<ConnectorTo> getAll(long nodeId) {
        return em.createQuery("SELECT NEW ru.argustelecom.task.witalijbukatkin.communicationnetwork.to." +
                "ConnectorTo(C.id, C.name, C.capacity)" +
                " FROM Connector C WHERE C.node.id = :nodeId", ConnectorTo.class)
                .setParameter("nodeId", nodeId)
                .getResultList();
    }
}
