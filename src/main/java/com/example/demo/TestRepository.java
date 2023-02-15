package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TestRepository {
    // 저장소(DB)랑 대화헤서, 서비스가 원하는 데이터를 주거나/지우거나/수정하거나...

    // private Map<String, String> db = new HashMap<>();
    // 자바 (자료구조) 컬렉션 중 실무에선 2개만 알면 됨
    // List(arraylist), map(hashmap)

    public String test(){
        // DB 에서 데이터 select 해와서 return
        return "test";
    }
}
