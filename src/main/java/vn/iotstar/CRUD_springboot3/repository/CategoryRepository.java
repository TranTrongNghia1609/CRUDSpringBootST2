package vn.iotstar.CRUD_springboot3.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.iotstar.CRUD_springboot3.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findCategoriesByCategoryname(String categoryname);
    //Tìm kiếm nội dung theo tên
    List<Category> findByCategoryname(String categoryname);
    Page<Category> findByCategoryname(String categoryname, Pageable pageable);
}
