package au.com.uxcps.eventapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sramalingam on 7/07/2016.
 */
@Entity(name = "event_subscription")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class EventSubscription {

    /**
     * Event Subscription Id
     */
    @Id
    @Column(name = "id", nullable = false)
    private long eventSubscriptionId;

    /**
     * Event Id
     */
    @Column(name = "event_id", nullable = true, insertable = true, updatable = true)
    private long eventId;

    /**
     * Event Id
     */
    @Column(name = "user_name", nullable = true, insertable = true, updatable = true)
    private long user_name;


    /**
     * Event Id
     */
    @Column(name = "is_subscribed", nullable = true, insertable = true, updatable = true)
    private boolean isSubscribed;

    /**
     * Event Id
     */
    @Column(name = "subscription_date", nullable = true, insertable = true, updatable = true)
    private long subscriptionDate;



}
