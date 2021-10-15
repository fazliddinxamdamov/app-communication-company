package pdp.uz.helper;

import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    /**
     * Check for String value
     */
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * Check for Object value
     */
    public static boolean isEmpty(Object obj) {
        return obj == null;
    }

    /**
     * Check for List value
     */
    public static boolean isEmpty(List<?> items) {
        return items == null || items.isEmpty();
    }


    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        Pattern pattern = null;
        if (phoneNumber.charAt(0) == '+' && phoneNumber.length() == 13)
            pattern = Pattern.compile("^(\\+\\d{1,13})$");
        else if (phoneNumber.charAt(0) != '+' && phoneNumber.length() == 12)
            pattern = Pattern.compile("^\\d{12}$");
        else if (phoneNumber.charAt(0) != '+' && phoneNumber.length() == 9)
            pattern = Pattern.compile("^\\d{9}$");
        else return false;

        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();

    }



}
