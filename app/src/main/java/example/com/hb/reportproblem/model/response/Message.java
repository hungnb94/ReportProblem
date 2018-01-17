package example.com.hb.reportproblem.model.response;

/**
 * Created by hung on 1/15/2018.
 */

public class Message {
    private boolean error;

    private String message;

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean getError() {
        return this.error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
