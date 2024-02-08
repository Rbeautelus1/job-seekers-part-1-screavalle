package edu.famu.jobboard.models.jobs;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.protobuf.util.Timestamps;
import jakarta.annotation.Nullable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;

@Data
@NoArgsConstructor
public abstract class AJobs
{
   @DocumentId
    private @Nullable String jobId;
    private String title;
    private String company;
    private String location;
    private String requirements;
    private Timestamp postedAt;
    private Timestamp expiryDate;
    private int views;

    public AJobs(@Nullable String jobId, String title, String company, String location, String requirements, Timestamp postedAt, Timestamp expiryDate, int views) {
        this.jobId = jobId;
        this.title = title;
        this.company = company;
        this.location = location;
        this.requirements = requirements;
        this.postedAt = postedAt;
        this.expiryDate = expiryDate;
        this.views = views;
    }

    public void setExpiryDate(String expiryDate) throws ParseException {
        this.expiryDate = Timestamp.fromProto(Timestamps.parse(expiryDate));
    }

    public void setPostedAt(String postedAt) throws ParseException {
        this.postedAt = Timestamp.fromProto(Timestamps.parse(postedAt));
    }
}
