package ru.argustelecom.task.witalijbukatkin.communicationnetwork.managed;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.dao.NodeDao;
import ru.argustelecom.task.witalijbukatkin.communicationnetwork.entity.Node;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Collection;

@ManagedBean
@RequestScoped
public class NodeManagedBean {
    @EJB
    private NodeDao dao;

    public Collection<Node> getAll(){
        return dao.getAll();
    }
}