import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private final static String ACCOUNT_REGEX = "^[A-Za-z0-9]+@[A-Za-z0-9]*\\.[A-Za-z0-9]+$";

    private static Pattern pattern;

    private Matcher matcher;

    public ValidateEmail() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
