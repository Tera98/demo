package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired  // 의존성 주입
    TestRepository tr;

    public String test() {
        return tr.test();
    }

    public String save(String value) {
        return tr.save(value);
    }

    public String search(Long id) {
        return tr.search(id);

    }
}
