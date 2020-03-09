package listener;

import event.SendMessageEvent;
import listener.Listener;

/**
 * Author: nonpool
 * Date: 2017/6/8
 */
public class SendMessageListener implements Listener<SendMessageEvent> {

    @Override
    public void onEvent(SendMessageEvent sendMessageEvent) {
        System.out.println("发送短信到" + sendMessageEvent.getSource());
    }
}
