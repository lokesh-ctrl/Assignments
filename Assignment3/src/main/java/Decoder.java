class Decoder {
    public String decodeMessage(String message) {
        final int MESSAGE_LENGTH = message.length();
        StringBuilder DecodedMessage = new StringBuilder();

        if (MESSAGE_LENGTH == 0){return "";}
        for (int iterator = 1 ; iterator<MESSAGE_LENGTH ; iterator++){
            if (iterator % 2 == 1){
                for (int i = 0 ; i < Character.getNumericValue(message.charAt(iterator)) ; i++){
                    DecodedMessage.append(message.charAt(iterator-1));
                }
            }
        }
        return String.valueOf(DecodedMessage);
    }
}
