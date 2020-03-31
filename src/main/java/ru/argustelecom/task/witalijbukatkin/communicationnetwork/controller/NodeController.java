package ru.argustelecom.task.witalijbukatkin.communicationnetwork.controller;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.service.NodeService;
import ru.argustelecom.task.witalijbukatkin.communicationnetwork.to.NodeTo;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Collection;

@ManagedBean
@RequestScoped
public class NodeController {
    @EJB
    private NodeService dao;

    public Collection<NodeTo> getAll() {
        return dao.getAll();
    }
}