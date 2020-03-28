/*
 * Copyright (c) 2020. Witalij Bukatkin
 * Github profile: https://github.com/witalijbukatkin
 */

package ru.argustelecom.task.witalijbukatkin;

import ru.argustelecom.task.witalijbukatkin.entity.Connector;
import ru.argustelecom.task.witalijbukatkin.entity.Link;
import ru.argustelecom.task.witalijbukatkin.entity.Node;

import java.util.stream.Stream;

import static ru.argustelecom.task.witalijbukatkin.util.EntityManagerUtil.getEntityManager;
import static ru.argustelecom.task.witalijbukatkin.util.EntityManagerUtil.shutdown;

public class Main {

    public static void main(String[] args) {
        if(getEntityManager().isOpen()) {
            run();
        }

        shutdown();
    }

    public static void run(){
        Stream.of(Node.class, Connector.class, Link.class)
                .forEach(type -> {
                    System.out.println("------- " + type.getSimpleName().toUpperCase() + " --------");

                    getEntityManager()
                            .createQuery("FROM " + type.getSimpleName(), type)
                            .getResultList()
                            .forEach(System.out::println);

                    System.out.println("\n");
                });
    }
}
