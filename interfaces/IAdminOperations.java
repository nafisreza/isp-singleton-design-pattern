public interface IAdminOperations extends IUserWriter {
    void modifySystemSettings(String operation, String value);
    void updateUserPrivileges(String userId, String newUserType);
} 