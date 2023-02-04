package example.demo.dataAccess.abstracts;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import example.demo.entities.concretes.Demo;

public interface DemoRepository extends JpaRepository<Demo, Integer> {
   
   
   
    // List<Brand> getAll();
}
