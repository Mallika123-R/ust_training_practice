package org;

import org.hibernate.SessionFactory;

public class app {
    public static void main(String[] args) {

    SessionFactory sessionFactory = HibrnateUtil.getSessionFactory();
    System.out.println(sessionFactory);

}

}
