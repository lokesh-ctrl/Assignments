public class Main {
    public static void main(String[] args) {
        SharedConnectionsBuffer sharedConnectionsBuffer = new SharedConnectionsBuffer ( );
        Thread producer = new Producer ( "producer ", sharedConnectionsBuffer );
        Thread consumer1 = new Consumer ( "consumer1", sharedConnectionsBuffer );
        Thread consumer2 = new Consumer ( "consumer2", sharedConnectionsBuffer );
        Thread consumer3 = new Consumer ( "consumer3", sharedConnectionsBuffer );
        Thread consumer4 = new Consumer ( "consumer4", sharedConnectionsBuffer );
        Thread consumer5 = new Consumer ( "consumer5", sharedConnectionsBuffer );
        producer.start ( );
        consumer1.start ( );
        consumer2.start ( );
        consumer3.start ( );
        consumer4.start ( );
        consumer5.start ( );
    }
}
