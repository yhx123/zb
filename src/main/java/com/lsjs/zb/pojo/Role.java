package com.lsjs.zb.pojo;

public class Role {
    private Integer id;

    private Integer name;

    private String description;

    public Role(Integer id, Integer name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Role() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}