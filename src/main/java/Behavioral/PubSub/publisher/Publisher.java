package Behavioral.PubSub.publisher;


import Behavioral.PubSub.Message;
import Behavioral.PubSub.service.PubSubService;

public interface Publisher {
    //Published new message to PubSub service
    void publish(Message message, PubSubService service);
}
