package org.launchcode.liftoffproject.data;

import org.launchcode.liftoffproject.models.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment,Integer> {
}
