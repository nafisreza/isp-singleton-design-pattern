public class AdminUser implements IAdminOperations {
    private User user;
    private FileManager fileManager;

    public AdminUser(User user) {
        this.user = user;
        this.fileManager = FileManager.getInstance();
    }

    // Implement all methods from IUserReader, IUserWriter, and IAdminOperations
} 