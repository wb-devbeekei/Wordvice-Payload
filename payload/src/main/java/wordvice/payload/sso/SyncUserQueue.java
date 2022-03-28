package wordvice.payload.sso;

import lombok.*;

import java.util.List;
import java.util.Map;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SyncUserQueue {
    private String eventName;
    private UserInfo userInfo;
    private SocialInfo socialInfo;
    private List<AgreeHistory> agreeHistory;
    private Map<String, Object> legacyData;
}
