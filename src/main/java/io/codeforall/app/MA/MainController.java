package io.codeforall.app.MA;

import io.codeforall.app.MA.Model.User;
import io.codeforall.app.MA.Services.AnnoucesService;
import io.codeforall.app.MA.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @Autowired
    public void setUser(UserService user) {
        this.user = user;
    }

    private UserService user;

    @Autowired
    public void setAnnouncesService(AnnoucesService annoucesService) {
        this.announcesService = annoucesService;
    }

    private AnnoucesService announcesService;

    @RequestMapping(method = RequestMethod.GET ,path = "/")
    public String list(){

        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String logIn(){
        return "login";
    }

    /**
     * Render a view with user details
     *
     * @param id    the user id
     * @return the view to render
     */
    @RequestMapping(method = RequestMethod.GET, path = "user/{id}")
    public String userPage(@PathVariable("id") Integer id){
        return "user"+id;
    }

    @RequestMapping(method = RequestMethod.GET, path = "announce/{id}")
    public String announcePage(@PathVariable("id") Integer id){
        return "announces/announce"+id+"/announcements";

    }

    @RequestMapping(method = RequestMethod.GET, path = "/about")
    public String aboutUs(){
        return "about";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/rdmannounce")
    public String randomAnnouce(){
        int randomNum = (int) Math.floor(Math.random()*8);
        return "redirect:../educaid/announce/"+randomNum;
    }
}
