package wordvice.payload.sso;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SocialInfo {
    private String provider;
    private String identifier;
    private String userLogin;
    private String fullName;
    private String firstName;
    private String lastName;
    private String userEmail;
    private String phone1;
    private String picUrl;
}
