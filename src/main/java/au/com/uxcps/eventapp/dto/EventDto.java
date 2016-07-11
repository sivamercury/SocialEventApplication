package au.com.uxcps.eventapp.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.time.LocalDate;

/**
 * Created by sramalingam on 8/07/2016.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EventDto {
    private long eventId;
    private String eventName;
    private String eventDescription;
    private String venue;
    @DateTimeFormat(pattern = "ddMMyyyy")
    private LocalDate eventDate;
}
