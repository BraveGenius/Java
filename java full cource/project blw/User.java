public class User {
    private int id;
    private String username;
    private String password;
    private int accountId;

    public User(int id, String username, String password, int accountId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.accountId = accountId;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountId() {
        return accountId;
    }
}