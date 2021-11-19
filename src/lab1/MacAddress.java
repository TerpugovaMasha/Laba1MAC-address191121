package lab1;
//: POI/ExportConfig

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** MacAddress Check
 * @author MariaT
 * @version 1.2
 * @since 1.8
 */

public class MacAddress {
    /** Function for determining whether a given string is a MAC-address
     * @param str - the specified string with Mac address
     * @return the value is true or false for the string being checked
     */
    public static boolean Check (String str) {
        Pattern p1 = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}");
        Matcher m1 = p1.matcher(str);
        System.out.println(p1);
        return m1.matches();
    }
}
