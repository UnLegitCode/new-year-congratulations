package ru.unlegit.nyc.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.unlegit.nyc.model.Congratulation;
import ru.unlegit.nyc.repository.CongratulationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CongratulationService {

    private final CongratulationRepository repository;

    public List<Congratulation> getCongratulations(int page) {
        return repository.findAll(PageRequest.of(page, 10, Sort.by(Sort.Order.by("creationTime")))).getContent();
    }

    public void save(Congratulation congratulation) {
        System.out.println("Saving");
        repository.save(congratulation);
    }
}