import org.junit.Test;
import static org.junit.Assert.*;

public class UserManagementTest {
    
    @Test
    public void testRegularUserAuthentication() {
        User regularUser = new User("U001", "john", "john@example.com", "password123", "Regular");
        RegularUser user = new RegularUser(regularUser);
        
        assertTrue(user.authenticate("john", "password123"));
        assertFalse(user.authenticate("john", "wrongpassword"));
    }

    @Test
    public void testAdminUserPrivileges() {
        User adminUser = new User("A001", "admin", "admin@example.com", "adminpass", "Admin");
        AdminUser admin = new AdminUser(adminUser);
        
        admin.addUser("newuser", "new@example.com", "pass123", "Regular");
        admin.updateUserPrivileges("U001", "Power");
        
        // Add assertions to verify the operations
    }
} 