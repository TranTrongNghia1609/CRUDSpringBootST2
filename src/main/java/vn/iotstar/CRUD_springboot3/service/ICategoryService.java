package vn.iotstar.CRUD_springboot3.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import vn.iotstar.CRUD_springboot3.entity.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findAll();

    <S extends Category> S save(S entity);

    Optional<Category> findById(Long aLong);

    long count();

    void deleteById(Long aLong);

    List<Category> findAll(Sort sort);

    Optional<Category> findCategoriesByCategoryname(String categoryname);


    Page<Category> findAll(Pageable pageable);


    Page<Category> findByCategoryname(String categoryname, Pageable pageable);

    List<Category> findByCategoryname(String categoryname);
}
