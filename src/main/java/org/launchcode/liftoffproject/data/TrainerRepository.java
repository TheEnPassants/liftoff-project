package org.launchcode.liftoffproject.data;

import org.launchcode.liftoffproject.models.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer,Integer> {
}
