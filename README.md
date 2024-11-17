The following task implements Interface Segregation Principle (ISP) & Singleton Design Pattern
### USER MANAGEMENT SYSTEM
The User Management System will control access and privileges for different types of users
interacting with “User.csv” file. The system will implement role-based access control with
three distinct user types.

- User Types and Privileges
1.1.1 Regular User
• Read-only access to User.csv
• Can view contents but cannot modify
1.1.2 Power User
• Read and write access to User.csv
• Can view and add user details
• Cannot change system settings or user privileges
1.1.3 Admin User
• Can read and write to User.csv
• Can modify system settings (i.e., rename files)
• Can update user information and privilege
• Can add new users to the system
• Admin email and username stored in separate Admin.csv file

- User Attributes
Each user must have the following attributes:
• Username (unique identifier for login)
• Email address (unique)
• Password
• User ID (system-generated unique identifier)
• User Type (Regular/Power/Admin)

- Functional Requirements
1.3.1 User Authentication
• System shall authenticate users based on username and password
• System shall verify user type and assign appropriate privileges
• System shall verify admin users from Admin.csv at startup
1.3.2 File Operations
• System shall maintain all user data (except for the Admin user data) in User.csv
• System shall maintain all admin user data in Admin.csv
• System shall enforce access controls based on user type

- File Format
User.csv
UserID,Username,Email,Password,UserType
Admin.csv
UserID,Username,Email,Password