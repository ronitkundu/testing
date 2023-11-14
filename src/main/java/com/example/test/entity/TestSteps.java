package com.example.test.entity;

import jakarta.persistence.*;
import lombok.*;

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
    private int step_id;

    @Column
    @Getter @Setter
    private String step_name;

}
