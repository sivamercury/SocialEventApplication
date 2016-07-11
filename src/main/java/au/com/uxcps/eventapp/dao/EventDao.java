package au.com.uxcps.eventapp.dao;

import au.com.uxcps.eventapp.domain.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sramalingam on 8/07/2016.
 */
@Repository
public interface EventDao extends CrudRepository<Event,Long> {
}
