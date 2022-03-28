package wordvice.payload.message;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlimtalkButton {
    private String name;
    private String type;
    private String mobileUrl;
    private String pcUrl;
}
