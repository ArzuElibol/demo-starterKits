package example.demo.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name="demo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Demo {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;      
}
