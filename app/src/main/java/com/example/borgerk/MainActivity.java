package com.example.borgerk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Beef Burger","Carefully selected premium beef from Auzzie farms creating the best beef burger combo you can get with chef's secret spices.","8",R.drawable.image);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Garlic Bread","Fresh and crisp with home-made sour dough and carefully-picked garden-grown organic chives.","5",R.drawable.image1);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Cheese Burger","Made with creamy cheese that drips from your meal, bursting with richness and flavour.","5",R.drawable.image2);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Chicken Burger","From range-free chicken's creating wonder and delight from just a single bite.","8",R.drawable.image3);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Spice Burger","Crafted with carefully chosen and home-made spices combined with pulled bacon. ","6",R.drawable.image4);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Fries","Fried golden and crisp with a hint of sweetness from our freshly picked potatoes.","4",R.drawable.image5);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Fish Burger","Fresh and crisp, made with local fish caught just this morning.","8",R.drawable.image6);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Hawaiin Pizza","This would be the pizza like no other using fresh pineapples and carefully selected ham to create a sensational experience.","15",R.drawable.image7);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Juice","Select from our variety of home-made juices: Orange, Lemon, Watermelon, Apple.","5",R.drawable.image8);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Meatlover Pizza","Loaded with beef, ham and chicken with a thick dough base and carefully chosen sauces. It's like a dream come true!","20",R.drawable.image9);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Prawn Pizza","Fresh prawns and herbs loaded on freshly baked dough.","21",R.drawable.image10);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Fried Rice","Fried rice with the best quality Thai rice grains and cage-free eggs in a golden belnd with vegetables of the day.","8",R.drawable.image11);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Smoothies","Home-made smoothies with Greek yoghurt, choosing from: Strawberry, Banana and Blueberry ","6",R.drawable.image12);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Soft Drink","Choose from: Coke, Fanta and Sprite","3",R.drawable.image13);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Vegetarian Pizza","Loaded with organic garden-grown veggies including mushrooms, chives, spinach, tomatoes and much more.","15",R.drawable.image14);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, myFoodList);
        mRecyclerView.setAdapter(myAdapter);





    }
}
