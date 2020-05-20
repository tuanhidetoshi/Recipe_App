package com.example.myapplication.model;

import java.io.Serializable;
import java.util.List;

public class Recipe implements Serializable {
    private int id;
    private String title;
    private String image;
    private List<Ingredient> ingredients;
    private String desc;
    private String detail;
    private String type;

    public Recipe(String title, String image, String desc, String detail) {
        this.title = title;
        this.image = image;
        this.desc = desc;
        this.detail = detail;
    }

    public Recipe() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", ingredients=" + ingredients +
                ", desc='" + desc + '\'' +
                ", detail='" + detail + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
