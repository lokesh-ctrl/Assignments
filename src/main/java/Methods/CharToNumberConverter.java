package Methods;

public class CharToNumberConverter {

    public static String stringToNumberConverter(String a) {
        if("AaBbCc".contains(a)) return "2";
        if("DdEeFf".contains(a)) return "3";
        if("GgHhIi".contains(a)) return "4";
        if("JjKkLl".contains(a)) return "5";
        if("MmNnOo".contains(a)) return "6";
        if("PpQqRrSs".contains(a)) return "7";
        if("TtUuVv".contains(a)) return "8";
        if("WwXxYyZz".contains(a)) return "9";
        if(a.equals(" ")) return "0";
        else{
            return "";
        }
    }
}
