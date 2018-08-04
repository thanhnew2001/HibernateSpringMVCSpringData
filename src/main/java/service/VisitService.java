package service;

import model.Visit;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by CoT on 8/3/18.
 */
@Transactional
@Service
public class VisitService  {

    @Autowired
    private SessionFactory sessionFactory;

    public void addVisit(Visit visit){
        sessionFactory.getCurrentSession().save(visit);
    }
}
