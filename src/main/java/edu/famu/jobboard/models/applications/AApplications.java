package edu.famu.jobboard.models.applications;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.protobuf.util.Timestamps;
import jakarta.annotation.Nullable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;

@Data
@NoArgsConstructor
public class AApplications {
    @DocumentId
    private @Nullable String applicationId;
    private Timestamp appliedAt;

    public AApplications(String applicationId, Timestamp appliedAt) {
        this.applicationId = applicationId;
        this.appliedAt = appliedAt;
    }
    public void setAppliedAt(String appliedAt) throws ParseException {
        this.appliedAt = Timestamp.fromProto(Timestamps.parse(appliedAt));
    }

}
