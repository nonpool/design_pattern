package event;

import java.util.EventObject;

/**
 * Author: nonpool
 * Date: 2017/5/28
 */
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    ApplicationEvent(Object source) {
        super(source);
    }


}
