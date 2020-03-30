package ru.argustelecom.task.witalijbukatkin.communicationnetwork;

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
//        System.out.println("node managed bean");
        return dao.getAll();
    }
}