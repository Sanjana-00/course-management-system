CREATE TABLE course (
                        id BIGSERIAL PRIMARY KEY,
                        title VARCHAR(255) NOT NULL,
                        description VARCHAR(255) NOT NULL,
                        instructor_name VARCHAR(255),
                        difficulty_level VARCHAR(255),
                        category VARCHAR(255)
);