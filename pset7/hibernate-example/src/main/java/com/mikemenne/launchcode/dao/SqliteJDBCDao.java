package com.mikemenne.launchcode.dao;

import com.mikemenne.launchcode.AppOutput;
import com.mikemenne.launchcode.MetrolinkDao;
import com.mikemenne.launchcode.models.Stop;
import com.mikemenne.launchcode.WrittenWatchingTV;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class SqliteJDBCDao implements MetrolinkDao {

    @Autowired
    private AppOutput appOutput;
    @Autowired
    private SessionFactory sessionFactoryBean;

    @WrittenWatchingTV
    public List<Stop> getStopsAllStops() {
        // @TODO
        sessionFactoryBean.getCurrentSession().beginTransaction();
        Criteria criteria = sessionFactoryBean.getCurrentSession().createCriteria(Stop.class);
        List list = criteria.list();
        sessionFactoryBean.getCurrentSession().getTransaction().commit();
        return list;
    }
}
