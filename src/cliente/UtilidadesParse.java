package cliente;

/**
 *
 * @author yerso
 */
public class UtilidadesParse {
    public static int StringToInt(String str) {
        int number = -1;
        try {
            number = Integer.parseInt(str);
        }catch(NumberFormatException ex) {
        }
        return number;
    }
}
