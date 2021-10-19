package patterns.orm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper {

    private final Connection connection;

    private final static String PS_FIND_BY_ID =
            "SELECT id, first_name, last_name, email, phone, address, gender, age FROM persons WHERE id = ?";


    public PersonMapper(Connection connection) {
        this.connection = connection;
    }

    public Person findById(int id) throws SQLException, RecordNotFoundException {
        PreparedStatement statement = connection.prepareStatement(PS_FIND_BY_ID);
        statement.setInt(1, id);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                return Person.builder()
                        .id(resultSet.getInt(1))
                        .firstName(resultSet.getString(2))
                        .lastName(resultSet.getString(3))
                        .email(resultSet.getString(4))
                        .phone(resultSet.getString(5))
                        .address(resultSet.getString(6))
                        .gender(resultSet.getString(7).charAt(0))
                        .age(resultSet.getInt(8))
                        .build();
            }
        }
        throw new RecordNotFoundException(id);
    }
}

