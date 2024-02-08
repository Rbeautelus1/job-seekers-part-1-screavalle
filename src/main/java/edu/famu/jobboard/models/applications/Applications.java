package edu.famu.jobboard.models.applications;

import com.google.cloud.Timestamp;
import edu.famu.jobboard.models.users.Users;
import edu.famu.jobboard.models.jobs.Jobs;

public class Applications extends AApplications {
    private Jobs jobId;
    private Users userId;

    public Applications(String applicationId, Timestamp appliedAt, Jobs jobId, Users userId) {
        super(applicationId, appliedAt);
        this.jobId = jobId;
        this.userId = userId;
    }
}
