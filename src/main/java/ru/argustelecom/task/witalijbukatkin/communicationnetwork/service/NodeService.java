package ru.argustelecom.task.witalijbukatkin.communicationnetwork.service;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.to.NodeTo;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateful
public class NodeService {
    @PersistenceContext
    private EntityManager em;

    public List<NodeTo> getAll() {
        return em.createNativeQuery("SELECT N.*, count(C.ID) `connectorscount`, sum(C.CAPACITY) `pointscount`, " +
                "    sum(( " +
                "        SELECT count(L.ID) FROM LINK L" +
                "        WHERE L.SOURCECONNECTOR_ID = C.ID " +
                "           OR L.TARGETCONNECTOR_ID = C.ID " +
                "    )) `pointsbusy` " +
                "FROM Node N, Connector C " +
                "WHERE N.ID = C.NODE_ID " +
                "GROUP BY N.ID", NodeTo.class)
                .getResultList();
    }
}
