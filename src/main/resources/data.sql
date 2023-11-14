
CREATE TABLE test_steps(
    step_id INT PRIMARY KEY,
    step_name VARCHAR(255) NOT NULL
);

INSERT INTO test_steps(step_id , step_name ) VALUES (1, 'step1');
INSERT INTO test_steps(step_id , step_name ) VALUES (2, 'step2');
INSERT INTO test_steps(step_id , step_name ) VALUES (3, 'step3');

commit;