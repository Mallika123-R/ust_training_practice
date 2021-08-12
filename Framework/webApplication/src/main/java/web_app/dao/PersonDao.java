package web_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository   // a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects".
// Create the Bean  -  stored In the IoC container
public interface PersonDao extends JpaRepository<Person,Integer> {

    // Jparepository - predefinec methods to Database operation
}
