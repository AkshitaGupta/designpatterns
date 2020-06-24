package Behavioral.PubSub.subscriber;

import Behavioral.PubSub.service.PubSubService;

public class SubscriberImpl extends Subscriber {

    public void subscribe(String topic, PubSubService pubSubService){

        pubSubService.addSubscriber(topic, this);
    }

    public void unSubscribe(String topic, PubSubService pubSubService){

        pubSubService.removeSubscriber(topic, this);
    }

    public void getMessagesForSubscriberOfTopics(String topic, PubSubService pubSubService){
        pubSubService.getMessagesForSubscriberOfTopic(topic, this);
    }
}
