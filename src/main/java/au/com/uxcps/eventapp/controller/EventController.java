package au.com.uxcps.eventapp.controller;

import au.com.uxcps.eventapp.domain.Event;
import au.com.uxcps.eventapp.dto.EventDto;
import au.com.uxcps.eventapp.service.EventHandlerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.IterableMap;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sramalingam on 8/07/2016.
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/event")
@Slf4j
public class EventController {

    @Autowired
    EventHandlerService eventHandlerSvc;

    @RequestMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity createEvent(@RequestBody EventDto eventDto) throws Exception {
        log.info("eventDto {}",eventDto);
        eventHandlerSvc.saveEvent(eventDto);
        return ResponseEntity.accepted().build();
    }

    @RequestMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Event getEventById(@PathVariable long id) throws Exception {
        log.info("id {}",id);
        Event event = eventHandlerSvc.getEventById(id);
        return event;
    }

    @RequestMapping(value = "/getEvents", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Iterable<Event> getEvents() throws Exception {

        log.info("getEvents");
        return eventHandlerSvc.getEvents();

    }

}
