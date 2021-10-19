package patterns.orm;

import lombok.extern.java.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Log
class PersonRepoImpl implements PersonRepo {

    private final Map<Integer, Person> personMap = new HashMap<>();
    private final String url = "jdbc:postgresql://localhost:5432/orm.patterns";
    private final Properties props = new Properties();

    {
        props.setProperty("user", "postgres");
        props.setProperty("password", "123456");
    }

    @Override
    public Person getPersonById(int id) {
        Person person = personMap.get(id);

        if (person == null) {
            log.info("Getting person from database");
            person = getPersonByIdFromDataBase(id);
            personMap.put(person.getId(), person);
        } else {
            log.info("Getting person from hashmap");
        }
        return person;
    }

    private Person getPersonByIdFromDataBase(int id)  {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            log.warning("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            log.warning(e.getMessage());
            return null;
        }
        try (Connection connection = DriverManager.getConnection(url, props);) {
            PersonMapper personMapper = new PersonMapper(connection);
            return personMapper.findById(id);
        } catch (SQLException e) {
            log.warning(e.getMessage());
        } catch (RecordNotFoundException e) {
            log.warning("No person with id=" + id + " in database");
        }
        return null;
    }
}
