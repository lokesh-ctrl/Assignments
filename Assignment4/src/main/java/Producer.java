import java.sql.SQLException;

public class Producer extends Thread {
    SharedConnectionsBuffer sharedConnectionsBuffer;
    private int MAX_LIMIT;

    public Producer(int MAX_LIMIT, SharedConnectionsBuffer sharedConnectionsBuffer) {
        this.MAX_LIMIT = MAX_LIMIT;
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
        run ();
    }
}


