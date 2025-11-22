package AnimalCareCentre.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AnimalCareCentre.server.enums.Status;
import AnimalCareCentre.server.model.Shelter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ShelterRepository extends JpaRepository<Shelter, Long> {

  public List<Shelter> findByStatus(Status status);

  Shelter findShelterByEmail(String email);

}
