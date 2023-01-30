/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;

/**
 *
 * @author emi
 */
public class RecipeBlog {
    
    String recipeTitle;
    int numOfServing; //for number input, check for 0 and negative values as intake
    boolean isGlutenFree; //only Yes or No value
    float difficultyLevel; //Scale of 1 to 5 hint: value can be 3.5
    int numOfIngredients;
    String categoryOfFood;
    String description;
    File recipePicture; // either store the File Path/ File Object
    UserInfo userInfo;
    
    public RecipeBlog(){
        UserInfo userInfo = new UserInfo();
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public int getNumOfServing() {
        return numOfServing;
    }

    public void setNumOfServing(int numOfServing) {
        this.numOfServing = numOfServing;
    }

    public float getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(float difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getNumOfIngredients() {
        return numOfIngredients;
    }

    public void setNumOfIngredients(int numOfIngredients) {
        this.numOfIngredients = numOfIngredients;
    }

    public String getCategoryOfFood() {
        return categoryOfFood;
    }

    public void setCategoryOfFood(String categoryOfFood) {
        this.categoryOfFood = categoryOfFood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getRecipePicture() {
        return recipePicture;
    }

    public void setRecipePicture(File recipePicture) {
        this.recipePicture = recipePicture;
    }

    public boolean isIsGlutenFree() {
        return isGlutenFree;
    }

    public void setIsGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }
    
    
    
    public UserInfo getUserInfo() {
        return userInfo;
    }
}
