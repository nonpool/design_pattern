package listener;

import event.ApplicationEvent;
import listener.Listener;

/**
 * Author: nonpool
 * Date: 2017/5/28
 */
public class AllEventListener implements Listener<ApplicationEvent> {
    @Override
    public void onEvent(ApplicationEvent applicationEvent) {
        System.out.println("我老大，我监听所有事件" + applicationEvent);
    }
}
