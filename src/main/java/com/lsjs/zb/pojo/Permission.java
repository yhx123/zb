package com.lsjs.zb.pojo;

public class Permission {
    private Integer id;

    private String name;

    private String description;

    private String url;

    private String method;

    public Permission(Integer id, String name, String description, String url, String method) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.method = method;
    }

    public Permission() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}