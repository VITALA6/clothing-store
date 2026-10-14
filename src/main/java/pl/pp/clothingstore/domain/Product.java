package pl.pp.clothingstore.domain;

import java.io.Serializable;
import java.time.LocalDate;

public class Product implements Serializable {

    private Long id;
    private String name;
    private String category;
    private String season;
    private String size;
    private LocalDate addedDate;
    private Float price;
    private Boolean available;

    public Product() {
    }

    public Product(Long id, String name, String category, String season, String size,
                   LocalDate addedDate, Float price, Boolean available) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.season = season;
        this.size = size;
        this.addedDate = addedDate;
        this.price = price;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
