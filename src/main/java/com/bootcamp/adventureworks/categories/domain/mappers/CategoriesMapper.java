package com.bootcamp.adventureworks.categories.domain.mappers;

import com.bootcamp.adventureworks.categories.domain.dto.CategoryDto;
import com.bootcamp.adventureworks.categories.persistence.entities.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriesMapper {


    @Mappings({
            @Mapping(source = "rowguid", target = "rowGuid")
    })
    CategoryDto toCategoryDto(Category entity);
    List<CategoryDto> toCategoriesDto(List<Category> entities);

}
