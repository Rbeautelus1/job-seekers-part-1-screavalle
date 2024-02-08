package edu.famu.jobboard.models.jobViews;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;
import jakarta.annotation.Nullable;

public class RestJobViews extends AJobViews {
    private DocumentReference jobId;
    private DocumentReference userId;

    public RestJobViews(@Nullable String jobViewId, Timestamp viewedAt, DocumentReference jobId, DocumentReference userId) {
        super(jobViewId, viewedAt);
        this.jobId = jobId;
        this.userId = userId;
    }
}
