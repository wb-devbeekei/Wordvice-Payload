package wordvice.payload.ee;

import lombok.*;

import java.util.Map;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SyncLegacyDataQueue {
    private String eventName;
    private Map<String, String> legacyData;
}
