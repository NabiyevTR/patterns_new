package patterns.facade;

import lombok.Data;

@Data
public class Customer {

    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

}
