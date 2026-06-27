package co.istad.elearninga01m1.features.course.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CourseResponse(
        Integer id,
        String slug,
        String keyword,
        String title,
        String description,
        String thumbnail,
        Float starRating,
        Integer ratingCount,
        Float totalHours,
        String levels,
        BigDecimal price,
        Float discountPercent,
        BigDecimal finalPrice,
        LocalDate createdDate,
        LocalDate updatedAt,
        Integer categoryId,
        String categoryName,
        Boolean isDelete,
        Boolean isPublished
) {
}