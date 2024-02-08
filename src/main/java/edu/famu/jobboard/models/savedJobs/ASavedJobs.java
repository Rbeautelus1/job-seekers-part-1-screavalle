package edu.famu.jobboard.models.savedJobs;

import com.google.cloud.firestore.annotation.DocumentId;
import jakarta.annotation.Nullable;

public class ASavedJobs {
    @DocumentId
    private @Nullable String savedJobId;

    public ASavedJobs(@Nullable String savedJobId) {
        this.savedJobId = savedJobId;
    }
}
