package ru.timofeev.aitestgeneration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.timofeev.aitestgeneration.model.RequestType;

@Repository
public interface RequestTypeRepository extends JpaRepository<RequestType, Long> {
}
