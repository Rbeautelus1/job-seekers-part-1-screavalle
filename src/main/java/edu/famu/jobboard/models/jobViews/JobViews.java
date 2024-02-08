package edu.famu.jobboard.models.jobViews;

import com.google.cloud.Timestamp;
import edu.famu.jobboard.models.users.Users;
import edu.famu.jobboard.models.jobs.Jobs;
import jakarta.annotation.Nullable;

public class JobViews extends AJobViews{
    private Jobs jobId;
    private Users userId;

    public JobViews(@Nullable String jobViewId, Timestamp viewedAt, Jobs jobId, Users userId) {
        super(jobViewId, viewedAt);
        this.jobId = jobId;
        this.userId = userId;
    }
}
