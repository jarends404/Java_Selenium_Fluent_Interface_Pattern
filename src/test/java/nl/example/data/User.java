package nl.example.data;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {

    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String telephone;

}
