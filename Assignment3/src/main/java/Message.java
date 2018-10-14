public class Message {
    public String encode(String message) {
        StringBuilder EncodedMessage = new StringBuilder();
        int characterRepetions = 1;
        if (message.length() == 1){
            EncodedMessage.append(message);
            EncodedMessage.append("1");
            return String.valueOf(EncodedMessage);
        }
        for (int iterator = 0;iterator<message.length();iterator++){
            if (message.charAt(iterator)==message.charAt(iterator+1)) {
                characterRepetions++;
                if (iterator == (message.length()-2)) {
                    EncodedMessage.append(message.charAt(iterator));
                    EncodedMessage.append(characterRepetions);
                    return String.valueOf(EncodedMessage);
                }
            }
            else{
                EncodedMessage.append(message.charAt(iterator));
                EncodedMessage.append(characterRepetions);
                characterRepetions = 1;
            }
        }
        return String.valueOf(EncodedMessage);
    }
}
