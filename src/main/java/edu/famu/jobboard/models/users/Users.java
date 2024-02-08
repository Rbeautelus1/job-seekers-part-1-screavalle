package edu.famu.jobboard.models.users;

import edu.famu.jobboard.models.applications.Applications;

import java.util.List;

public class Users extends AUsers{

    private List<Applications> applications;

    public Users(String userId, String username, String email, String role, String resume, List<Applications> applications) {
        super(userId, username, email, role, resume);
        this.applications = applications;
    }
}
