package co.istad.elearninga01m1.features.category.mapper;

import co.istad.elearninga01m1.features.category.Category;
import co.istad.elearninga01m1.features.category.dto.CategoryCreateRequest;
import co.istad.elearninga01m1.features.category.dto.CategoryResponse;
import co.istad.elearninga01m1.features.category.dto.CategoryUpdateRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-27T19:50:44+0700",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 25.0.3 (Arch Linux)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category fromCreateRequest(CategoryCreateRequest request) {
        if ( request == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( request.name() );
        category.setIcon( request.icon() );

        category.setIsDeleted( false );
        category.setIsPublished( request.isPublished() != null ? request.isPublished() : true );

        return category;
    }

    @Override
    public CategoryResponse toResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        Integer id = null;
        String name = null;
        String icon = null;
        Boolean isDeleted = null;
        Boolean isPublished = null;

        id = category.getId();
        name = category.getName();
        icon = category.getIcon();
        isDeleted = category.getIsDeleted();
        isPublished = category.getIsPublished();

        CategoryResponse categoryResponse = new CategoryResponse( id, name, icon, isDeleted, isPublished );

        return categoryResponse;
    }

    @Override
    public List<CategoryResponse> toResponseList(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryResponse> list = new ArrayList<CategoryResponse>( categories.size() );
        for ( Category category : categories ) {
            list.add( toResponse( category ) );
        }

        return list;
    }

    @Override
    public void updateCategoryFromRequest(CategoryUpdateRequest request, Category category) {
        if ( request == null ) {
            return;
        }

        if ( request.name() != null ) {
            category.setName( request.name() );
        }
        if ( request.icon() != null ) {
            category.setIcon( request.icon() );
        }
        if ( request.isPublished() != null ) {
            category.setIsPublished( request.isPublished() );
        }
    }
}
