package wordvice.payload.message;

import lombok.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private Set<String> to;
    private String from;
    private String fromName;
    private String title;
    private String templateId;
    private String contents;
    private String icon;
    private String channel;
    private Map<String, Object> parameters;
    private Set<String> attachments;

    public Message(String to, String from) {
        this.to = new HashSet<String>(){{ add(to); }};
        this.from = from;
    }

    public Message(Set<String> to, String from) {
        this.to = to;
        this.from = from;
    }

    public void addParameter(String key, Object value) {
        if (this.parameters == null) this.parameters = new HashMap<String, Object>();
        this.parameters.put(key, value);
    }

    public void addAttachment(String value) {
        if (this.attachments == null) this.attachments = new HashSet<String>();
        this.attachments.add(value);
    }
}
