package com.scarlatti;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pc on 9/8/2017.
 */
@Entity
@Table(name="tb_tags")
public class Tag implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

    public Tag() {}

    public Tag(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}