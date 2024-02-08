package edu.famu.jobboard.models.jobs;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;
import jakarta.annotation.Nullable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RestJobs extends AJobs {
    private List<DocumentReference> applications;

    public RestJobs(List<DocumentReference> applications) {
        this.applications = applications;
    }

    public RestJobs(@Nullable String jobId, String title, String company, String location, String requirements, Timestamp postedAt, Timestamp expiryDate, int views, List<DocumentReference> applications) {
        super(jobId, title, company, location, requirements, postedAt, expiryDate, views);
        this.applications = applications;
    }
}
