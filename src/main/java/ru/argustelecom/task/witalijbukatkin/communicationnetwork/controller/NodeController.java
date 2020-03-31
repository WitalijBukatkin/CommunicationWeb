/*
 * Copyright (c) 2020. Witalij Bukatkin
 * Github profile: https://github.com/witalijbukatkin
 */

package ru.argustelecom.task.witalijbukatkin.communicationnetwork.controller;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.service.ConnectorService;
import ru.argustelecom.task.witalijbukatkin.communicationnetwork.service.LinkService;
import ru.argustelecom.task.witalijbukatkin.communicationnetwork.to.ConnectorTo;
import ru.argustelecom.task.witalijbukatkin.communicationnetwork.to.LinkTo;
import ru.argustelecom.task.witalijbukatkin.communicationnetwork.to.NodeTo;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Collection;

@ManagedBean
@RequestScoped
public class NodeController {
    public NodeTo node;

    @EJB
    private ConnectorService connectorService;

    @EJB
    private LinkService linkService;

    public String createNodePage(NodeTo node) {
        this.node = node;
        return "node";
    }

    public NodeTo getNode() {
        return node;
    }

    public Collection<ConnectorTo> getConnectors() {
        return node == null ? null :
                connectorService.getAll(node.getId());
    }

    public Collection<LinkTo> getLinks(long connectorId) {
        return node == null ? null :
                linkService.getAll(connectorId);
    }
}