package com.pineapple.eckotur.message.logic.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2015-05-08T22:08:50")
@StaticMetamodel(MessageEntity.class)
public class MessageEntity_ { 

    public static volatile SingularAttribute<MessageEntity, Long> id;
    public static volatile SingularAttribute<MessageEntity, String> message;
    public static volatile SingularAttribute<MessageEntity, Long> userIdTo;
    public static volatile SingularAttribute<MessageEntity, String> subject;
    public static volatile SingularAttribute<MessageEntity, Long> userIdFrom;
    public static volatile SingularAttribute<MessageEntity, Date> date;

}