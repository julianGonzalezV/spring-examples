package com.springbdpy.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShirtBrand {
    @Value("ref123")
    private String id;
    @Value("nike")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ShirtBrand [id=" + id + ", name=" + name + "]";
    }
}
