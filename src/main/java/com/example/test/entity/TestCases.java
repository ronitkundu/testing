package com.example.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "test_cases")
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class TestCases {

    private static final long serialVersionUID = 103441329488155432L;
    @Id
    @Column
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int case_id;

    @Column
    @Getter @Setter
    private String case_name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "step_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    @Getter @Setter
    private TestSteps steps;
}
