package Types;

public abstract class User {

    protected String UserName;
    protected Integer age;
    public String UserType;

    public User(String userName, Integer age, String userType) {
        UserName = userName;
        this.age = age;
        UserType = userType;
    }
}
