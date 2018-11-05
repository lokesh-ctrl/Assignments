public class Main {
    public static void main(String[] args){
        SharedConnectionsBuffer sharedConnectionsBuffer = new SharedConnectionsBuffer ();
        Thread producer = new Producer ( 25,sharedConnectionsBuffer );
        Thread consumer1 = new Consumer ( sharedConnectionsBuffer );
        producer.start ();
        consumer1.start ();
    }
}
