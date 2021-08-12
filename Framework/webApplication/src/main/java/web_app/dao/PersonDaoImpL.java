package web_app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //  Service Class
public class PersonDaoImpL  {

    @Autowired  //autowired by Spring's dependency injection facilities
    private PersonDao personDao;

    public Person addPersonDetails(Person person){
        Person per=personDao.save(person);
        return per;
    }
    public List<Person> getAllPersonDetails()
    {
        return personDao.findAll();
    }

}