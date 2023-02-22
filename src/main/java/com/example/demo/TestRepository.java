package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TestRepository implements DemoRepository{
    // 저장소(DB)랑 대화헤서, 서비스가 원하는 데이터를 주거나/지우거나/수정하거나...
    // private Map<String, String> db = new HashMap<>();
    // 자바 (자료구조) 컬렉션 중 실무에선 2개만 알면 됨
    // List(arraylist), map(hashmap)
    Map<Long, String> db = new HashMap<Long, String>();
    Long id = 1L;
    // key value 형태
    // test() 메소드가 불리면, db 에서 "test" 글자를 찾아서 반환해주세요.
    public String save(String value) {
        db.put(id++, value);
        return value;
    }

    public String test() {
        // DB 에서 데이터 select 해와서 return
        return db.get(1L);
    }

    public String search(Long id) {
        return db.get(id);
    }
}
