package com.apress.todo.repository;

import com.apress.todo.domain.ToDo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

@Repository
public class ToDoRepository {
    private Flux<ToDo> toDoFlux = Flux.fromIterable(Arrays.asList(
            new ToDo("Do homework"),
            new ToDo("Workout in the mornings", true),
            new ToDo("Make dinner tonight"),
            new ToDo("Clean the studio", true)
    ));

    public Mono<ToDo> findById(String id){
        return Mono
                .from(toDoFlux.filter(toDo -> toDo.getId().equals(id)));
    }

    public Flux<ToDo> findAll(){
        return toDoFlux;
    }
}
