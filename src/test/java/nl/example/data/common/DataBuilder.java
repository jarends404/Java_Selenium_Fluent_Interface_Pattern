package nl.example.data.common;

import com.github.javafaker.Faker;
import nl.example.data.User;

import java.util.Locale;

public class DataBuilder {

    private static final Faker FAKER = Faker.instance(Locale.ENGLISH);

    public static User getUserData() {
        return User.builder()
                .email(FAKER.internet().emailAddress())
                .firstName(FAKER.name().firstName())
                .lastName(FAKER.name().lastName())
                .password(FAKER.internet().password())
                .telephone(FAKER.phoneNumber().phoneNumber())
                .build();
    }
}
