package ir.nima.todo.repository;



import ir.nima.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

    Todo findById(int id);
    List<Todo> findAllByOrderById();
}
