package demo.i18n;

import javax.validation.constraints.Pattern;

public class LoginForm {
    @Pattern(regexp = "^[a-zA-Z0-9]\\w{3,19}$", message = "{username.pattern.message}")
    public String username;
}
