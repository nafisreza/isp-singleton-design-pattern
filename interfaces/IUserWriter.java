public interface IUserWriter extends IUserReader {
    void addUser(String username, String email, String password, String userType);
} 