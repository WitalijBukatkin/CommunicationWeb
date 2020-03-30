package ru.argustelecom.task.witalijbukatkin.communicationnetwork.dao;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.entity.Node;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PostLoad;
import javax.transaction.Transaction;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Stateful
public class NodeDao {
    @PersistenceContext
    private EntityManager em;

    public Collection<Node> getAll(){
        return em.createQuery("SELECT n FROM Node n", Node.class)
                .getResultList();
    }
}
