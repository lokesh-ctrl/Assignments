import java.sql.Connection;
import java.sql.SQLException;

public class Consumer extends Thread {
    private SharedConnectionsBuffer sharedConnectionsBuffer;

    public Consumer(SharedConnectionsBuffer sharedConnectionsBuffer) {
        this.sharedConnectionsBuffer = sharedConnectionsBuffer;
    }
    @Override
    public void run(){
        synchronized (this){
            Connection connection = sharedConnectionsBuffer.consumeConnection ();
            try {
                sleep ( 2000 );
            } catch ( InterruptedException e ) {
                e.printStackTrace ( );
            }
            sharedConnectionsBuffer.closeConnection ( connection );
            run ();
        }
    }
}
