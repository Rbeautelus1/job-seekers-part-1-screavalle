package edu.famu.jobboard.models.jobs;

import com.google.cloud.Timestamp;
import edu.famu.jobboard.models.applications.Applications;
import jakarta.annotation.Nullable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Jobs extends AJobs {
    private List<Applications> applications;

    public Jobs(List<Applications> applications) {
        this.applications = applications;
    }

    public Jobs(@Nullable String jobId, String title, String company, String location, String requirements, Timestamp postedAt, Timestamp expiryDate, int views, List<Applications> applications) {
        super(jobId, title, company, location, requirements, postedAt, expiryDate, views);
        this.applications = applications;
    }
}
