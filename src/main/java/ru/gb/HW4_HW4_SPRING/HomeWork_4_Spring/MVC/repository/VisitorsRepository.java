package ru.gb.HW4_HW4_SPRING.HomeWork_4_Spring.MVC.repository;

import lombok.Getter;
import org.springframework.stereotype.Repository;
import ru.gb.HW4_HW4_SPRING.HomeWork_4_Spring.MVC.models.Visitor;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
public class VisitorsRepository {

    List<Visitor> visitors = new ArrayList<>();

    public void addVisitors(Visitor visitor){
        visitors.add(visitor);
    }
}
