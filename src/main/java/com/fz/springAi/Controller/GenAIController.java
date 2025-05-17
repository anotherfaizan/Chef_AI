package com.fz.springAi.Controller;

import com.fz.springAi.Service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ask/ai")
public class GenAIController {
    private final RecipeService recipeService;

    public GenAIController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @GetMapping("/recipeCreator")
    public ResponseEntity<String> recipeCreator(@RequestParam String ingredients,
                                @RequestParam(defaultValue = "any") String cuisine,
                                @RequestParam(defaultValue = "") String dietaryRestriction) {
        String response = recipeService.createRecipe(ingredients, cuisine, dietaryRestriction);

        return ResponseEntity.ok(response);
    }
}
