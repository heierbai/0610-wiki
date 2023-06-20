package com.hei.wiki.service;

import com.hei.wiki.domain.Test;
import com.hei.wiki.mapper.TestMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;


    public List<Test> list(){
        return testMapper.list();
    }
}
