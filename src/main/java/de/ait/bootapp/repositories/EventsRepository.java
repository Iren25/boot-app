package de.ait.bootapp.repositories;

import de.ait.bootapp.models.Event;
import org.springframework.stereotype.Repository;


@Repository
public interface EventsRepository extends CrudRepository<Event>{
    Event findOneByName(String name);
}
