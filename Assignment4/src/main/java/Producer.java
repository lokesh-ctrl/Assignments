import java.sql.SQLException;

class Producer extends Thread {
    final SharedConnectionsBuffer sharedConnectionsBuffer;

    public Producer(String name, SharedConnectionsBuffer sharedConnectionsBuffer) {
        super ( name );
        this.sharedConnectionsBuffer = sharedConnectionsBuffer;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                sharedConnectionsBuffer.produceConnection ( );
            } catch ( SQLException e ) {
                e.printStackTrace ( );
            } catch ( ClassNotFoundException e ) {
                e.printStackTrace ( );
            }
        }
        run ( );
    }
}


