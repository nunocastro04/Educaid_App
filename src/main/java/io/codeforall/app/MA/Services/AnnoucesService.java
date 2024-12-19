package io.codeforall.app.MA.Services;

import io.codeforall.app.MA.Model.Announcement;
import io.codeforall.app.MA.persistence.daoAnnounces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnoucesService {

    @Autowired
    public void setDao(daoAnnounces daoAnnounces) {
        this.daoAnnounces = daoAnnounces;
    }

    private daoAnnounces daoAnnounces;

    public Announcement getAnnounce(int ID){
        return daoAnnounces.getAnnounce(ID);
    }



}
