public interface IUserReader {
    void viewUserDetails(String userId);
    boolean authenticate(String username, String password);
} 