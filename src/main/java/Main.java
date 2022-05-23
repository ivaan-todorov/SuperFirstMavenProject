import org.apache.commons.lang3.StringUtils;

public class Main {

    public static String abbr(String str, int size) {
        return str.substring(0, size - 3) + "...";
    }

    public static void main(String[] args) {

        System.out.println(StringUtils.abbreviate("Ivan",5));

    }
}
