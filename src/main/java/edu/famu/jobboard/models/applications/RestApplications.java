package edu.famu.jobboard.models.applications;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;

public class RestApplications extends AApplications{
    private DocumentReference jobId;
    private DocumentReference userId;

    public RestApplications(String applicationId, Timestamp appliedAt, DocumentReference jobId, DocumentReference userId) {
        super(applicationId, appliedAt);
        this.jobId = jobId;
        this.userId = userId;
    }
}
