package edu.ucsb.ucsbcslas.repositories;

import java.util.List;

import edu.ucsb.ucsbcslas.entities.OnlineOfficeHours;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineOfficeHoursRepository extends CrudRepository<OnlineOfficeHours, Long> {
  List<OnlineOfficeHours> findAll();
  Optional<OnlineOfficeHours> findById(Long id);
  void deleteById(Long id);
}
