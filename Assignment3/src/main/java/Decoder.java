import com.sun.deploy.util.StringUtils;

public class Decoder {
    public String decode(String message) {
        final int MESSAGE_LENGTH=message.length();
        StringBuilder DecodedMessage = new StringBuilder();

        if (MESSAGE_LENGTH==0){return "";}

        for (int iteator = 1 ; iteator<MESSAGE_LENGTH ; iteator++){
            if (iteator % 2 == 1){
                for (int i = 0 ; i<Character.getNumericValue(message.charAt(iteator)) ; i++){
                    DecodedMessage.append(message.charAt(iteator-1));
                }
            }
        }
        return String.valueOf(DecodedMessage);
    }
}
