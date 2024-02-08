package edu.famu.jobboard.models.jobViews;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.protobuf.util.Timestamps;
import jakarta.annotation.Nullable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;

@Data
@NoArgsConstructor
public abstract class AJobViews {
    @DocumentId
    private @Nullable String jobViewId;
    private Timestamp viewedAt;

    public AJobViews(@Nullable String jobViewId, Timestamp viewedAt) {
        this.jobViewId = jobViewId;
        this.viewedAt = viewedAt;
    }

    public void setViewedAt(String viewedAt) throws ParseException {
        this.viewedAt = Timestamp.fromProto(Timestamps.parse(viewedAt));
    }
}
