package vn.iotstar.CRUD_springboot3.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vn.iotstar.CRUD_springboot3.entity.Category;
import vn.iotstar.CRUD_springboot3.repository.CategoryRepository;
import vn.iotstar.CRUD_springboot3.service.ICategoryService;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public <S extends Category> S save(S entity) {
        return categoryRepository.save(entity);
    }

    @Override
    public Optional<Category> findById(Long aLong) {
        return categoryRepository.findById(aLong);
    }

    @Override
    public long count() {
        return categoryRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        categoryRepository.deleteById(aLong);
    }

    @Override
    public List<Category> findAll(Sort sort) {
        return categoryRepository.findAll(sort);
    }

    @Override
    public Optional<Category> findCategoriesByCategoryname(String categoryname) {
        return categoryRepository.findCategoriesByCategoryname(categoryname);
    }


    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Page<Category> findByCategoryname(String categoryname, Pageable pageable) {
        return categoryRepository.findByCategorynameContaining(categoryname, pageable);
    }

    @Override
    public List<Category> findByCategoryname(String categoryname) {
        return categoryRepository.findByCategoryname(categoryname);
    }
}
