package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class DiceRollController {

//    @GetMapping("/roll-dice")
//    public String returnDiceRollPage(@RequestParam int guess, Model model){
//        Random random = new Random();
//        int randomNum = random.nextInt((6 - 1) + 1) + 1;
//        System.out.println(randomNum);
//        model.addAttribute("The random dice roll was " + randomNum + " your number guessed was " + guess);
//        return "dice";
//    }

    @GetMapping("/roll-dice")
    public String returnDiceRollPage() {


        return "dice";
    }

    @GetMapping("/roll-dice/{}")
    public String returnDiceRollPage(@RequestParam int guess,  Model model){
                Random random = new Random();
        int randomNum = random.nextInt((6 - 1) + 1) + 1;

        System.out.println(randomNum);
        if(guess != randomNum) {

            model.addAttribute("picked", "The random dice roll was " + randomNum + " your number guessed was " + guess);
        } else {
            model.addAttribute("picked", "The random dice roll was " + randomNum + " your number guessed was " + guess +
                     ". Your Guessed Correctly");

        }
//                model.addAttribute("The random dice roll was " + randomNum + " your number guessed was " + guess);


        return "diceguess";
    }
}
