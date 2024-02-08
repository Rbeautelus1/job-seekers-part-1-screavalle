package edu.famu.jobboard.models.savedJobs;

import com.google.cloud.firestore.DocumentReference;
import jakarta.annotation.Nullable;

public class RestSavedJobs extends ASavedJobs{
    private DocumentReference jobId;
    private DocumentReference userId;

    public RestSavedJobs(@Nullable String savedJobId, DocumentReference jobId, DocumentReference userId) {
        super(savedJobId);
        this.jobId = jobId;
        this.userId = userId;
    }
}
