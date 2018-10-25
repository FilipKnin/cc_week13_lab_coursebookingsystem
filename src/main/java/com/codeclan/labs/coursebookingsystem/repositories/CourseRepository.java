package com.codeclan.labs.coursebookingsystem.repositories;

import com.codeclan.labs.coursebookingsystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
