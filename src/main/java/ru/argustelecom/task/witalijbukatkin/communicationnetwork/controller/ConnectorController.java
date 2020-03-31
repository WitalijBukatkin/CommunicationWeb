package ru.argustelecom.task.witalijbukatkin.communicationnetwork.controller;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.entity.Connector;
import ru.argustelecom.task.witalijbukatkin.communicationnetwork.service.ConnectorService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Collection;

@ManagedBean
@RequestScoped
public class ConnectorController {
    public String nodeId;
    public String nodeName;
    @EJB
    private ConnectorService dao;

    public String getConnectorsForNode(String nodeId, String nodeName) {
        this.nodeId = nodeId;
        this.nodeName = nodeName;
        return "connectors";
    }

    public Collection<Connector> getAllForNode() {
        if (nodeId == null) {
            return null;
        }

        return dao.getAllForNode(nodeId);
    }

    public String getNodeName() {
        return nodeName;
    }
}
