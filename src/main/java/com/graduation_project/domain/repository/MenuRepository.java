package com.graduation_project.domain.repository;

import com.graduation_project.domain.Menu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by elena on 02.04.16.
 */
@Repository
public interface MenuRepository extends PagingAndSortingRepository<Menu, Integer> {
}
