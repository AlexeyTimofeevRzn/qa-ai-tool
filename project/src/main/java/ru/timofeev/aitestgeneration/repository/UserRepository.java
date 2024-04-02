package ru.timofeev.aitestgeneration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.timofeev.aitestgeneration.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
