/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chania.controller;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
//import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import chania.model.*;
import chania.util.HibernateUtil;

/**
 *
 * @author Jorge
 */
public class Operaciones {
    
    public void altaSolicitud(Solicitud solicitud){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(solicitud);
        tx.commit();
        session.close();
        //JOptionPane.showMessageDialog(null, "Insertado correctamente.!!!");
    }
    
    public Solicitud buscarSolicitud(Solicitud solicitud){
        Solicitud solicitudTmp;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        solicitudTmp = (Solicitud)session.get(Solicitud.class, solicitud);
        tx.commit();
        session.close();
        
        return solicitudTmp;
    }
    
    public DefaultListModel mostrarSolicitudes(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from solicitudes");
        List<Solicitud> lista = query.list();
        Iterator<Solicitud> iter = lista.iterator();
        tx.commit();
        session.close();
        
        DefaultListModel dlm = new DefaultListModel();
        while (iter.hasNext()) {
            Solicitud solici = (Solicitud)iter.next();
            dlm.addElement(solici);
        }
        
        return dlm;
    }
    //DefaultListModel dlm;
    //dlm = oper.mostrarSolicitudes();
    //lista_solicitudes.setModel(dlm);
    
    public DefaultListModel getSolicitudesByNombre(String nombre){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from solicitudes where solicitud.nombre=" + nombre + "");
        List<Solicitud> lista = query.list();
        Iterator<Solicitud> iter = lista.iterator();
        tx.commit();
        session.close();
        
        DefaultListModel dlm = new DefaultListModel();
        while (iter.hasNext()) {
            Solicitud solici = (Solicitud)iter.next();
            dlm.addElement(solici);
        }
        
        return dlm;
    }
}
