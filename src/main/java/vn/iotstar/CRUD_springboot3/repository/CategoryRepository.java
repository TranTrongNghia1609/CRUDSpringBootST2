package vn.iotstar.CRUD_springboot3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.iotstar.CRUD_springboot3.entity.Category;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findCategoriesByCategoryname(String categoryname);
}
