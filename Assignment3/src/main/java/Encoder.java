class Encoder {

    public String encode(String message) {
            final int MESSAGE_LENGTH=message.length();
            final int LAST_BEFORE_CHAR_INDEX=MESSAGE_LENGTH-2;
            StringBuilder EncodedMessage = new StringBuilder();
            int numberOfTimesCharRepeated = 1;

            if (MESSAGE_LENGTH == 1){
                EncodedMessage.append(message);
                EncodedMessage.append("1");
                return String.valueOf(EncodedMessage);
            }
            for (int iterator = 0;iterator<MESSAGE_LENGTH;iterator++){
                if (message.charAt(iterator) == message.charAt(iterator+1)) {
                    numberOfTimesCharRepeated++;
                    if (iterator == LAST_BEFORE_CHAR_INDEX) {
                        EncodedMessage.append(message.charAt(iterator));
                        EncodedMessage.append(numberOfTimesCharRepeated);
                        return String.valueOf(EncodedMessage);
                    }
                }
                else{
                    EncodedMessage.append(message.charAt(iterator));
                    EncodedMessage.append(numberOfTimesCharRepeated);
                    numberOfTimesCharRepeated = 1;
                    if (iterator == LAST_BEFORE_CHAR_INDEX){
                        iterator++;
                        EncodedMessage.append(message.charAt(iterator));
                        EncodedMessage.append(numberOfTimesCharRepeated);
                        break;
                    }
                }
            }
            return String.valueOf(EncodedMessage);
        }
}