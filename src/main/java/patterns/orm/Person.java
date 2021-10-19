package patterns.orm;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Person {

    @Builder.Default
    private int id = -1;

    @Builder.Default
    private String firstName = "Undefined";

    @Builder.Default
    private String lastName = "Undefined";

    @Builder.Default
    private char gender = 'u';

    @Builder.Default
    private String phone = "Undefined";

    @Builder.Default
    private String email = "Undefined";

    @Builder.Default
    private String address = "Undefined";

    @Builder.Default
    private int age = -1;
}
