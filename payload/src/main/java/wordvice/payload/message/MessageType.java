package wordvice.payload.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

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
