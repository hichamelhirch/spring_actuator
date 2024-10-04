package com.hicham.emp.monotoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

@Endpoint(id = "custom")
@Component
public class CustomActuatorEndpoint {




    @ReadOperation
    public Map<String,String> custom(String username){
        Map<String,String> map=new HashMap<>();
        map.put("key","value");
        map.put("key",username);
        return map;
    }
}
