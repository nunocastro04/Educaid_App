package io.codeforall.app.MA.persistence;

import io.codeforall.app.MA.Model.User;
import io.codeforall.app.MA.persistence.jpa.jpaSessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.List;

@Repository
public class daoUser<T extends Model> {

    @Autowired
    public void setSm(jpaSessionManager sm) {
        this.sm = sm;
    }

    private jpaSessionManager sm;

    public User getbyID(Integer ID) {
        return sm.getCurrentSession().find(User.class, ID);
    }

    public String getLocation(int ID){
        List<String> list = (List<String>) sm.getCurrentSession().createQuery("SELECT distrito, concelho, freguesia FROM User WHERE id=" + ID).getResultList();
        String location = "";
        for (String s: list) {
            location = s + " ";
        }
        return location;
    }
}
