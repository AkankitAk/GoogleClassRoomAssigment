package com.example.urlhitcounter.service;


import com.example.urlhitcounter.model.VisitCounter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlService {

    static Map<String,Integer> map=new HashMap<>();
    public VisitCounter getVisits(String username) { // business logic

        int count=map.getOrDefault(username,0)+1;
        map.put(username,count);

        VisitCounter visit=new VisitCounter(username,count);
        return visit;
    }
}