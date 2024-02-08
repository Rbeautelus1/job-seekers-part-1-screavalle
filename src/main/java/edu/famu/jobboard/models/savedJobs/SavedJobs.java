package edu.famu.jobboard.models.savedJobs;

import edu.famu.jobboard.models.users.Users;
import edu.famu.jobboard.models.jobs.Jobs;
import jakarta.annotation.Nullable;

public class SavedJobs extends ASavedJobs{
    private Jobs jobId;
    private Users userId;

    public SavedJobs(@Nullable String savedJobId, Jobs jobId, Users userId) {
        super(savedJobId);
        this.jobId = jobId;
        this.userId = userId;
    }
}
