package de.sadrab.Mp6todo.endpoint;

import de.sadrab.Mp6todo.persistence.Do;
import de.sadrab.Mp6todo.persistence.DoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class ToDoEndpoint {

    private DoRepository doRepository;

    public ToDoEndpoint(DoRepository doRepository) {
        this.doRepository = doRepository;
    }

    @GetMapping
    List<Do> displayAll(){
        return doRepository.findAll();
    }

    @GetMapping("/{id}")
    Do displayById(@PathVariable String id){
        Optional<Do> result = doRepository.findById(id);
        if (result.isPresent())
            return result.get();
        return null;
    }

    @PostMapping
    Do save(@RequestBody Do todo){
        System.out.println("todo = [" + todo + "]");
        return doRepository.save(todo);
    }

    @GetMapping("/{id}/done")
    Do doneIt(@PathVariable String id){
        Optional<Do> result = doRepository.findById(id);
        if (result.isPresent()) {
            Do aDo = result.get();
            aDo.setDone(true);
            return doRepository.save(aDo);
        }
        return null;
    }
}
