package edu.famu.jobboard.models.users;

import com.google.cloud.firestore.annotation.DocumentId;

public class AUsers {
    @DocumentId
    private String userId;
    private String username;
    private String email;
    private String role;
    private String resume;

    public AUsers(String userId, String username, String email, String role, String resume) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.role = role;
        this.resume = resume;
    }
}
