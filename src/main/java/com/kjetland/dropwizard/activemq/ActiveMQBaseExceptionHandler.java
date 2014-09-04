package com.kjetland.dropwizard.activemq;

import javax.jms.Message;

public interface ActiveMQBaseExceptionHandler {

    boolean onException(Message jmsMessage, String message, Exception exception);

}
