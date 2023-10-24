CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255),
    name VARCHAR(255),
    job_title VARCHAR(255),
    phone VARCHAR(15),
    image_url VARCHAR(255),
    employee_code VARCHAR(255) NOT NULL
);