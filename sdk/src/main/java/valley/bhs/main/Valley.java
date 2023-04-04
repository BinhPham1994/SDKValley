package valley.bhs.main;

public class Valley {
    public Valley(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Valley(String accessToken) {
        this.accessToken = accessToken;
    }


    public void connect() {

    }

    private String username;
    private String password;

    private String accessToken;
}