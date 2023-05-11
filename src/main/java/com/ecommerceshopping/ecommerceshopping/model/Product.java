package com.ecommerceshopping.ecommerceshopping.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
//so the product class has a many to one relationship with category
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = true)
    private Category category;

    //@ManyToOne(fetch = FetchType.LAZY): This is an annotation used to specify a many-to-one
    //relationship between two entities. It indicates that the Category class (the "many" side)
    //is associated with multiple instances of the current class (the "one" side).
    //The fetch attribute determines how the related entity is loaded from the database when this
    //association is accessed. In this case, FetchType.LAZY is used, which means that the Category
    //entity will be loaded from the database only when it is explicitly accessed for the first time.



    private BigDecimal price;
    @Column(name="image")
    private String imageUrl;

}
