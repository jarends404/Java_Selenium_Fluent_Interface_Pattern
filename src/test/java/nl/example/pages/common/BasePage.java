package nl.example.pages.common;

import lombok.Getter;
import nl.example.data.User;
import nl.example.data.common.DataBuilder;
import nl.example.util.Browser;

@Getter
public class BasePage {

    private final Browser browser = Browser.getInstance();

    private final User user = DataBuilder.getUserData();

}
