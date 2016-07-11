package au.com.uxcps.eventapp.service;

import au.com.uxcps.eventapp.dao.EventDao;
import au.com.uxcps.eventapp.domain.Event;
import au.com.uxcps.eventapp.dto.EventDto;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by sramalingam on 8/07/2016.
 */
@Service
public class EventHandlerService {

    @Autowired
    EventDao eventDao;

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    public Event saveEvent(EventDto eventDto) throws Exception
    {
        Event newEvent = dozerBeanMapper.map(eventDto,Event.class);
        return eventDao.save(newEvent);
    }

    public Event getEventById(long id)
    {
        return eventDao.findOne(id);
    }

    public Iterable<Event> getEvents()
    {
        return eventDao.findAll();
    }
}
