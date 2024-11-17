public class RegularUser implements IUserReader {
    private User user;
    private FileManager fileManager;

    public RegularUser(User user) {
        this.user = user;
        this.fileManager = FileManager.getInstance();
    }

    @Override
    public void viewUserDetails(String userId) {
        List<String> users = fileManager.readFromFile("User.csv");
        // Implementation to find and display user details
    }

    @Override
    public boolean authenticate(String username, String password) {
        // Implementation for authentication
        return false;
    }
} 