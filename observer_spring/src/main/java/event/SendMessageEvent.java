package event;

import event.ApplicationEvent;

/**
 * Author: nonpool
 * Date: 2017/6/8
 */
public class SendMessageEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public SendMessageEvent(Object source) {
        super(source);
    }
}
