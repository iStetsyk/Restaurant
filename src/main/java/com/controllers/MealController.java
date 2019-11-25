package com.controllers;

import com.domain.Meal;
import com.repositories.MealRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("manager/meal/{id}")
public class MealController {

    private MealRepository mealRepository;


    public MealController(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @GetMapping
    public Meal getMeal(){
        Meal meal = new Meal();
        return meal;
    }


    @GetMapping("/meals/add")
    public String preaperMealcreation(){
        return "ścieżka do";
    }

    @PostMapping("/meals/add")
    public String addMeal(String mealName, String descrpition, Double price){
        Meal meal = new Meal();

        meal.setMealName(mealName);
        meal.setDescrpition(descrpition);
        meal.setPrice(price);

        mealRepository.save(meal);
        log.info("Danie : " + mealName + " zostało dodane do menu.");
        return "meal";
    }
}
