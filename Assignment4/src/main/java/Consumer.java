import java.sql.Connection;

class Consumer extends Thread {
    private final SharedConnectionsBuffer sharedConnectionsBuffer;

    public Consumer(String name, SharedConnectionsBuffer sharedConnectionsBuffer) {
        super ( name );
        this.sharedConnectionsBuffer = sharedConnectionsBuffer;
    }

    @Override
    public void run() {
        synchronized (this) {
            Connection connection = sharedConnectionsBuffer.consumeConnection ( );
            doSomeWorkWithTheConnection ( );
            sharedConnectionsBuffer.closeConnection ( connection );
            run ( );
        }
    }

    private void doSomeWorkWithTheConnection() {
        try {
            sleep ( 5000 );
        } catch ( InterruptedException e ) {
            e.printStackTrace ( );
        }
    }
}
