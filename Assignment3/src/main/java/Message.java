class Message {
    String encode(String message){
        Encoder encoder = new Encoder();
        return  encoder.encode(message);
    }
}
