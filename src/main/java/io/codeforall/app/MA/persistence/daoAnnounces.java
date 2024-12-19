package io.codeforall.app.MA.persistence;

import io.codeforall.app.MA.Model.Announcement;
import io.codeforall.app.MA.persistence.jpa.jpaSessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("announcesmentsDao")
public class daoAnnounces {

    @Autowired
    public void setSm(jpaSessionManager sm) {
        this.sm = sm;
    }

    private jpaSessionManager sm;


    public List getAnnouncesByID(int ID){
        return sm.getCurrentSession().createQuery("FROM Announcements WHERE user_id=" + ID).getResultList();
    }

    public Announcement getAnnounce(int ID){
        return sm.getCurrentSession().find(Announcement.class, ID);
    }


}
