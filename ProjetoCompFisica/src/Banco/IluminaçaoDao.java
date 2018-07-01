/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author wesle
 */
public class IluminaçaoDao {

    public void persist(Iluminaçao iluminaçao) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoCompFisicaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(iluminaçao);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
   
    public Iluminaçao find(Class<Iluminaçao> aClass, int l){
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoCompFisicaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Iluminaçao teste = em.find(aClass,l);
        
        return teste;
        
    }
    
<<<<<<< HEAD
    public long soma(int numlampada){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoCompFisicaPU");
        EntityManager em = emf.createEntityManager();
    Query query = em.createNativeQuery("select sum(tempoaceso) from iluminaÇao where numlampada = "+numlampada);
=======
    public long soma1(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoCompFisicaPU");
        EntityManager em = emf.createEntityManager();
    Query query = em.createNativeQuery("select sum(tempoaceso) from iluminaÇao where numLampada = 1");
    long soma;
    soma = (long) query.getSingleResult();
    return soma;
    }
    public long soma2(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoCompFisicaPU");
        EntityManager em = emf.createEntityManager();
    Query query = em.createNativeQuery("select sum(tempoaceso) from iluminaÇao where numLampada = 2");
    long soma;
    soma = (long) query.getSingleResult();
    return soma;
    }
    public long soma3(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoCompFisicaPU");
        EntityManager em = emf.createEntityManager();
    Query query = em.createNativeQuery("select sum(tempoaceso) from iluminaÇao where numLampada = 3 ");
    long soma;
    soma = (long) query.getSingleResult();
    return soma;
    }
    public long soma4(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoCompFisicaPU");
        EntityManager em = emf.createEntityManager();
    Query query = em.createNativeQuery("select sum(tempoaceso) from iluminaÇao where numLampada = 4");
>>>>>>> 7e6bc7adfa8080cb7d33af6263c90d9e545295e7
    long soma;
    soma = (long) query.getSingleResult();
    return soma;
    }
    
    public List<Iluminaçao> lista(){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoCompFisicaPU");
    EntityManager em = emf.createEntityManager();
    Query query = em.createNativeQuery("select  from iluminaÇao;");
    return query.getResultList();
  }
    
  
    
    
}
