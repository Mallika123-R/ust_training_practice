package web_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import web_app.dao.Person;
import web_app.dao.PersonDaoImpL;

import java.util.List;

@RestController
public class FirstController {


    @GetMapping(path= "/Home")
    public ModelAndView getHomePage(ModelAndView model)
    {
        model.setViewName("home-page");
        return model;
    }
    @GetMapping(path= "/AboutUs")
    public ModelAndView getAboutPage(ModelAndView model)
    {
        model.setViewName("about-us");
        return model;
    }
    @Autowired
    private PersonDaoImpL servicePerson;
    @Autowired
    private Person person;
    @GetMapping(path= "/registration")
    public ModelAndView getRegistrationPage(ModelAndView model)
    {
        model.setViewName("registration-page");
        return model;
    }

    @PostMapping(path= "/userRegister")
    public ModelAndView getDetailsPage(@RequestParam("ename") String name, @RequestParam("phone") Long phone,
                                       @RequestParam("email") String email, ModelAndView model)

    {
        Person person=new Person();
        person.setName(name);
        person.setEmail(email);
        person.setPhone(phone);


        Person checkPerson=servicePerson.addPersonDetails(person);

        if(checkPerson!=null)
        {
            model.setViewName("Registration successfully added");
        }
        else
            model.setViewName("Error");

        System.out.println(name+"..."+phone+".."+email);
        return model;
    }
    @GetMapping("/List")
    public ModelAndView getPersonList(ModelAndView model)
    {
        List<Person> allPersonDetails= servicePerson.getAllPersonDetails();
        model.addObject("message","List of Person Details");
        model.addObject("x",allPersonDetails);
        model.setViewName("person-list-page");
        return model;

    }
    @GetMapping(path= "/contact")
    public String getContactPage()
    {
        //web_app.model.setViewName("registration-page");
        return "you can contact on this number";
    }
}
