import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

/**
 * @author Alex Stepurko
 * @version 0.0.2
 * <p>
 * DTO class for store information about student
 */
@Data
@Accessors(chain = true)
public class Student {
    private int id;
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student() {
    }

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
