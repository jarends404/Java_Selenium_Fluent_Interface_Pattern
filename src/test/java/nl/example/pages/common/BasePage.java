package nl.example.pages.common;

import lombok.Getter;
import nl.example.util.Browser;

@Getter
public class BasePage {

    private final Browser browser = Browser.getInstance();

}
