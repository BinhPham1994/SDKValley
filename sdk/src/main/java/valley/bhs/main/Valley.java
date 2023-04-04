package valley.bhs.main;

import org.json.JSONObject;

public class Valley {
    public Valley(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Valley(String accessToken) {
        this.accessToken = accessToken;
    }

    public void connect() {
        valleyListener.onSubmitForm();
    }

    private ValleyListener valleyListener;
    private String username;
    private String password;

    private String accessToken;
}