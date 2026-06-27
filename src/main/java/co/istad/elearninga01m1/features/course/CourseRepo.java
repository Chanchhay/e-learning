package co.istad.elearninga01m1.features.course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Integer> {

    Boolean existsBySlug(String slug);
}