package queue;

import lombok.*;

import java.util.*;

@ToString
@Getter
@Setter
public class MessageSendQueuePayload {

    private final String appkey;
    private final MessageType type;
    private final Message message;

    private String webHookUrl;
    private List<AlimtalkButton> alimtalkButtons;

    private Date requestDate = new Date();
    private int retryCount = 0;

    public MessageSendQueuePayload(String appkey, MessageType type, Message message) {
        this.appkey = appkey;
        this.type = type;
        this.message = message;
    }

    public void addAlimtalkButton(AlimtalkButton alimtalkButton) {
        if (this.alimtalkButtons == null) this.alimtalkButtons = new ArrayList<>();
        this.alimtalkButtons.add(alimtalkButton);
    }

    public void retryCountUp() {
        ++this.retryCount;
    }

    @Getter
    @AllArgsConstructor
    public enum MessageType {
        EMAIL("이메일 발송"),
        SMS("SMS 발송(국내)"),
        SMS_GLOBAL("SMS 발송(해외)"),
        ALIMTALK("카카오 알림톡 발송"),
        PUSH_BROWSER("브라우져 푸시"),
        PUSH_APP("앱 푸시");
        private final String name;
    }

    @ToString
    @Getter
    @Setter
    public static class Message {
        private final Set<String> to;
        private final String from;

        private String fromName;
        private String title;
        private String templateId;
        private String contents;
        private Map<String, Object> parameters;
        private Set<String> attachments;

        public Message(String to, String from) {
            this.to = Set.of(to);
            this.from = from;
        }

        public Message(Set<String> to, String from) {
            this.to = to;
            this.from = from;
        }

        public void addParameter(String key, Object value) {
            if (this.parameters == null) this.parameters = new HashMap<>();
            this.parameters.put(key, value);
        }

        public void addAttachment(String value) {
            if (this.attachments == null) this.attachments = new HashSet<>();
            this.attachments.add(value);
        }
    }

    @ToString
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AlimtalkButton {
        private String name;
        private String type;
        private String mobileUrl;
        private String pcUrl;
    }

}