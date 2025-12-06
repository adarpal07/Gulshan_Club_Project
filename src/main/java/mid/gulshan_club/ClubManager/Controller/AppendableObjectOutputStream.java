package mid.gulshan_club.ClubManager.Controller;

import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws Exception {
        super(out);
    }

    @Override
    protected void writeStreamHeader() {
        // Do nothing — prevents header duplication
    }
}
