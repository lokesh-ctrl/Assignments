package Methods;

import Methods.CharToNumberConverter;

public class NameToNumberConverter {
    public static String nameToNumberConverter(String name) {
        StringBuilder convertedNumber = new StringBuilder("");
        String temp;
        for (int i=0;i<name.length();i++){
        temp=CharToNumberConverter.stringToNumberConverter(String.valueOf(name.charAt(i)));
        convertedNumber.append(temp);
        }
        return convertedNumber.toString();
    }
}
