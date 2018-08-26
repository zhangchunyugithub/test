package com.springboot.dao;

import com.springboot.vo.StudentVO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface StudentDao extends ElasticsearchRepository<StudentVO,String>{
}
