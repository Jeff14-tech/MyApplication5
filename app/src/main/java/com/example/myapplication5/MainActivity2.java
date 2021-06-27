package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView mRecycleView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mRecycleView = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity2.this,1);
        mRecycleView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Eggplant","Growing eggplants in the veggie garden can be so rewarding when the time comes to harvest these tasty, versatile plants. There are several varieties to choose from with a range of sizes, shapes, and colors. By understanding what eggplants need to grow and thrive, you can ensure a good harvest.","Eggplant",R.drawable.talong);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Papaya","A papaya plant will mature in six to nine months if you live in a warm region but may take up to 11 months in cooler areas. Once the plant is mature, it will flower in early spring and can produce as many as 100 fruits in summer or fall.","Papaya",R.drawable.papaya);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Gourds","Gourds take about 180 days total from planting till they produce ripe fruit, as a result of their extra long germination process. Keep in mind that if you're in a cold area, you'll need to start your seeds 6-8 weeks before the last frost of the season.","Gourds",R.drawable.gourds);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Tomato","Early-season tomatoes require 50 to 60 days to reach harvest from transplanting; mid-season tomatoes require 60 to 80 days; late-season tomatoes require 80 or more days. In hot summer-mild winter regions such as USDA zone 10 or warmer, tomatoes can be grown as a fall and winter crop.","Tomato",R.drawable.tomato);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Moringa","Moringa trees can grow up to 18 feet in less than six months, making it hard to harvest leaves and seed pods. If you “top” your tree at a height you are comfortable with, the tree will develop a lush bush-like habit in the warm weather months.","Moringa",R.drawable.moringa);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Ampalaya","The ampalaya takes about 60 to 70 days to grow and produce a bunch of ampalaya. This will make it faster when the necessary things like fertilizer and water are being applied regularly.","Ampalaya",R.drawable.ampalaya);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Squash","Set two or three summer squash plants 4 to 6 inches apart in the mound. Water gently with a watering can or gentle spray of a hose immediately after planting. Space mounds about 3 to 4 feet apart. Winter squash, which produce longer vines, need at least 4 feet between mounds, but 6 feet is better.","Squash",R.drawable.kalabasa);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Ochro","The plants often grow four to six feet tall and can spread just as far. Plant seed so that plants will be spaced 12 to 15 inches apart in rows at least three feet apart. Okra seed can be difficult to germinate, so soak the seed overnight to encourage germination, which takes place after a week or more.","Ochro",R.drawable.okra);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Beans","Plant bush bean seeds 2-4 inches (5-10 cm.) apart in rows that are 2-3 feet (61-91 cm.) apart and plant pole beans in either rows or hills with seeds 6-10 inches (15-25 cm.) apart in rows that are 3-4 feet (approximately 1 meter or so) apart. Provide support for pole beans as well."
                ,"Beans",R.drawable.sitaw);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Cabbage","Start seeds indoors 4 to 6 weeks before the last frost in spring. Sow seed outdoors when the soil can be worked in spring. Place transplants in the garden when they are 3 to 4 inches (7-10cm) tall as early as 3 to 4 weeks before the last frost in spring.","Cabbage",R.drawable.cabbage);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(MainActivity2.this,myFoodList);
        mRecycleView.setAdapter(myAdapter);
    }
}