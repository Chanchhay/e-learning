package co.istad.elearninga01m1.features.course.mapper;

import co.istad.elearninga01m1.features.course.Course;
import co.istad.elearninga01m1.features.course.dto.CourseResponse;
import co.istad.elearninga01m1.features.course.dto.CreateCourseRequest;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    Course mapCreateCourseRequestToCourse(CreateCourseRequest createCourseRequest);

    CourseResponse mapCourseToCourseResponse(Course course);

}
