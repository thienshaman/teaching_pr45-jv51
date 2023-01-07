package com.thiendo.repository;

import com.thiendo.entity.File;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FileRepository extends CrudRepository<File, Long> {
    List<File> findAllByOrderByIdDesc();
}
