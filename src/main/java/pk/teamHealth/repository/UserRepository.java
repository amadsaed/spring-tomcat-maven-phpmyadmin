package pk.teamHealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import pk.teamHealth.model.User;


public interface UserRepository extends JpaRepository<User , Long> {



}