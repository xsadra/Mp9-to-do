package de.sadrab.Mp6todo.endpoint;

import de.sadrab.Mp6todo.persistence.Do;
import de.sadrab.Mp6todo.persistence.DoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/load")
public class InitialiseEndpoint {
    private DoRepository doRepository;

    public InitialiseEndpoint(DoRepository doRepository) {
        this.doRepository = doRepository;
    }

    @GetMapping
    Do load(){
        doRepository.deleteAll();
        Do newElement = createNewElement();
        return doRepository.save(newElement);
    }

    private Do createNewElement() {
        return new Do("Test",false);
    }
}
