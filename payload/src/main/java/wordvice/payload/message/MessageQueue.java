package wordvice.payload.message;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageQueue {

    private String appkey;
    private MessageType type;
    private Message message;
    private String webHookUrl;
    private List<AlimtalkButton> alimtalkButtons;
    private Date requestDate = new Date();
    private int retryCount = 0;

    public MessageQueue(String appkey, MessageType type, Message message) {
        this.appkey = appkey;
        this.type = type;
        this.message = message;
    }

    public void addAlimtalkButton(AlimtalkButton alimtalkButton) {
        if (this.alimtalkButtons == null) this.alimtalkButtons = new ArrayList<AlimtalkButton>();
        this.alimtalkButtons.add(alimtalkButton);
    }

    public void retryCountUp() {
        ++this.retryCount;
    }

}