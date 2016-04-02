package com.graduation_project.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by elena on 31.03.16.
 */
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //@Column(name = "date", nullable = false)
    @NotNull
    private LocalDateTime dateTime;
    //@JoinColumn(name = " ", nullable = false)
    @OneToMany(cascade={CascadeType.PERSIST})
    List<Dish> dishes = new ArrayList<>();

    public Menu() {
    }

    public Menu(LocalDateTime dateTime, List<Dish> dishes) {
        this.dateTime = dateTime;
        this.dishes = dishes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", dishes=" + dishes +
                '}';
    }
}
