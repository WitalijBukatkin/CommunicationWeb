package ru.argustelecom.task.witalijbukatkin.communicationnetwork;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name = "index";

    public String getName() {
        return name;
    }

    public Collection<String> getAll(){
        return List.of("Hey1", "Hey2");
    }

    public void setName(String name) {
        this.name = name;
    }
}