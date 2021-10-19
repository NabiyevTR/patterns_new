package patterns.orm;

import lombok.extern.java.Log;


@Log
public class Main {

    public static void main(String[] args) {

        PersonRepo repo = new PersonRepoImpl();
        Person person = repo.getPersonById(2);
        log.info(person.toString());
        person = repo.getPersonById(2);
        log.info(person.toString());
    }
}
