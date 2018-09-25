package Methods;

public class CheckNumeric {
    public static boolean isNumeric(String strNum){
        try {
            int i = Integer.parseInt(strNum);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
