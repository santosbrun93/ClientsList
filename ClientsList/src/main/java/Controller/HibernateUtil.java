package controller;

import model.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    static {
        try{
            loadSessionFactory();
        }catch(Exception e){
            System.err.println("Exception while initializing hibernate util // Exce��o durante inicializa��o do hibernate util ");
        }
    }

    public static void loadSessionFactory(){

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Pessoa.class);
        configuration.addAnnotatedClass(Cliente.class);
        configuration.addAnnotatedClass(Telefone.class);
        configuration.addAnnotatedClass(Endereco.class);


        ServiceRegistry srvcReg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(srvcReg);
    }

    public static Session getSession() throws HibernateException {

        Session retSession=null;
        try {
            retSession = sessionFactory.openSession();
        }catch(HibernateException t){
            System.err.println("Exception while getting session  // Exce��o enquanto buscando sess�o ");
        }
        if(retSession == null) {
            System.err.println("session is discovered null  //  Sess�o descoberta est� nula ");
        }

        return retSession;
    }
}

