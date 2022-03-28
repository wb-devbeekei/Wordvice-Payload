package wordvice.payload.sso;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private long userId;
    private String legacyId;
    private String legacyPassword;
    private String email;
    private String name;
    private String countryCode;
    private String phone;
    private String loginWith;
    private String picUrl;
    private String userIp;
    private String userAgent;
}
