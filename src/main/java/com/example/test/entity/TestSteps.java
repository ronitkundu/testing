package com.example.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;

@Entity
@Table(name = "TEST_STEPS")
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class TestSteps implements Serializable {

    private static final long serialVersionUID = 103441329488155432L;
    @Id
    @Column
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer step_id;

    @Column
    @Getter @Setter
    private String step_name;

}
