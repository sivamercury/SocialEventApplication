package au.com.uxcps.eventapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by sramalingam on 7/07/2016.
 */


@Entity(name = "event")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Event {

    /**
     * Event Id
     */
    @Id
    @Column(name = "id", nullable = false)
    private long eventId;

    /**
     * Event Name
     */
    @Column(name = "event_name", nullable = true, insertable = true, updatable = true)
    private String eventName;

    /**
     * Event Description
     */
    @Column(name = "event_description", nullable = false, insertable = true, updatable = true)
    private String eventDescription;

    /**
     * Venue
     */
    @Column(name = "venue", nullable = false, insertable = true, updatable = true)
    private String venue;

    /**
     * Event Date
     */
    @Column(name = "event_date", nullable = false, insertable = true, updatable = true)
    private LocalDate eventDate;

}
