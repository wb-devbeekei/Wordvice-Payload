package wordvice.payload.sso;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgreeHistory {
    private String agreeType;
    private String agreeStatus;
    private String logDatetime;
    private String ip;
    private String userAgent;
}
