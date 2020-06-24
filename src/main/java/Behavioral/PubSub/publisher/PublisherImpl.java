package Behavioral.PubSub.publisher;

import Behavioral.PubSub.Message;
import Behavioral.PubSub.service.PubSubService;

public class PublisherImpl implements Publisher {

    public void publish(Message message, PubSubService pubSubService){

        pubSubService.addMessageToQueue(message);
    }
}
