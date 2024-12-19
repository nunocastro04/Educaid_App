package io.codeforall.app.MA.Services;


import io.codeforall.app.MA.Model.User;
import io.codeforall.app.MA.persistence.daoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public void setDaoUser(daoUser dao) {
        this.dao = dao;
    }

    private daoUser dao;


    public User getByID(int ID){
        return dao.getbyID(ID);
    }

    public String getLocation(int ID){
        return dao.getLocation(ID);
    }


}
