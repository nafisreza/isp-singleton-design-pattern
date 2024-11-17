public class PowerUser implements IUserWriter {
    private User user;
    private FileManager fileManager;

    public PowerUser(User user) {
        this.user = user;
        this.fileManager = FileManager.getInstance();
    }

    // Implement all methods from IUserReader and IUserWriter
} 