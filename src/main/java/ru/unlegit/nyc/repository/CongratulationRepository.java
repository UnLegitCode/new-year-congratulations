package ru.unlegit.nyc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.unlegit.nyc.model.Congratulation;

@Repository
public interface CongratulationRepository extends PagingAndSortingRepository<Congratulation, Long> {

}