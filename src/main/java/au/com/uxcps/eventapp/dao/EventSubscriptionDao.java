package au.com.uxcps.eventapp.dao;

import au.com.uxcps.eventapp.domain.EventSubscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sramalingam on 8/07/2016.
 */
@Repository
public interface EventSubscriptionDao extends CrudRepository<EventSubscription,Long> {
}
