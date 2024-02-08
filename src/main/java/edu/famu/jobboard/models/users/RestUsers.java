package edu.famu.jobboard.models.users;

import com.google.cloud.firestore.DocumentReference;

import java.util.List;

public class RestUsers extends AUsers{
    private List<DocumentReference> applications;

    public RestUsers(String userId, String username, String email, String role, String resume, List<DocumentReference> applications) {
        super(userId, username, email, role, resume);
        this.applications = applications;
    }
}

