package co.istad.elearninga01m1.features.course.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record CourseUpdateRequest(

        @NotBlank(message = "Slug is required")
        @Size(max = 150, message = "Slug must not exceed 150 characters")
        String slug,

        @Size(max = 100, message = "Keyword must not exceed 100 characters")
        String keyword,

        @NotBlank(message = "Title is required")
        @Size(max = 150, message = "Title must not exceed 150 characters")
        String title,

        String description,

        @Size(max = 255, message = "Thumbnail must not exceed 255 characters")
        String thumbnail,

        @NotBlank(message = "Level is required")
        @Size(max = 50, message = "Level must not exceed 50 characters")
        String levels,

        @NotNull(message = "Price is required")
        @DecimalMin(value = "0.00", message = "Price must be greater than or equal to 0")
        BigDecimal price,

        @DecimalMin(value = "0.00", message = "Discount percent must be at least 0")
        @DecimalMax(value = "100.00", message = "Discount percent must not exceed 100")
        Float discountPercent,

        @NotNull(message = "Category ID is required")
        Integer categoryId,

        Boolean isPublished
) {
}