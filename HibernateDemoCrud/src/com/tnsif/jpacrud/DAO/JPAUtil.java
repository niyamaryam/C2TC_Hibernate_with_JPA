package com.tnsif.jpacrud.DAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import java.lang.module.configuration;
public class JPAUtil 
//create the entity manager for managing persistence life  cycle
{
private static EntityManagerFactory factory;

private static EntityManager entityManager;

static 
{
factory = Persistence.createEntityManagerFactory("JPA-PU");
}
public static EntityManager getEntityManager()
{
if(entityManager==null || !entityManager.isOpen()) {
entityManager = factory.createEntityManager();
}
return entityManager;
}
}