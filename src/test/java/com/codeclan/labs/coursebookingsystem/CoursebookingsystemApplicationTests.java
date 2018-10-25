package com.codeclan.labs.coursebookingsystem;

import com.codeclan.labs.coursebookingsystem.models.Booking;
import com.codeclan.labs.coursebookingsystem.models.Course;
import com.codeclan.labs.coursebookingsystem.repositories.BookingRepository;
import com.codeclan.labs.coursebookingsystem.repositories.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingsystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddCourse() {
		Course course = new Course("Course1", "Edinburgh", 5);
		courseRepository.save(course);
	}

	@Test
	public void canAddBooking() {
		Course course = new Course("Course1", "Edinburgh", 5);
		courseRepository.save(course);

		Booking booking1 = new Booking("12-10-2018", course);
		bookingRepository.save(booking1);

	}

}
