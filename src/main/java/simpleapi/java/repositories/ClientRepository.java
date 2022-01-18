package simpleapi.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simpleapi.java.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
  
}
