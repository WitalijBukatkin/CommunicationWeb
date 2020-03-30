package ru.argustelecom.task.witalijbukatkin.communicationnetwork.dao;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.entity.Node;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateful
public class NodeDao {
    @PersistenceContext
    private EntityManager em;

    public Collection<Node> getAll(){
        return em.createQuery("SELECT n FROM Node n", Node.class)
                .getResultList();
    }
}
