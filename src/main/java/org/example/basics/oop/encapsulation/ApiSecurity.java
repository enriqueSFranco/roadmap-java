package org.example.basics.oop.encapsulation;

class User {
    private String name;
    private String email;
    private String passwordHash;

    // Constructor, getters and setters (not shown for brevity)
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }
}

class UserDTO {
    private String name;
    private String email;

    public UserDTO(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
    }

    // No passwordHash exposed
}

public class ApiSecurity {
}
