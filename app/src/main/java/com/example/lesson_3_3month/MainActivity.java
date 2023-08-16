package com.example.lesson_3_3month;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_chat;
    private ArrayList<String> nameList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          rv_chat = findViewById(R.id.rv_chat);
          loadData();
          ChatAdapter adapter = new ChatAdapter(nameList);
          rv_chat.setAdapter(adapter);
    }

    private void loadData() {
        nameList.add("Ars");
        nameList.add("Edu");
        nameList.add("Tima");
        nameList.add("Akti");
        nameList.add("Bitu");
        nameList.add("Niyaz");
        nameList.add("Erbolot");
        nameList.add("Isko");
        nameList.add("Rabota");
        nameList.add("Boss");
        nameList.add("Чисто свои");
        nameList.add("Деньги на ДР");
        nameList.add("Корпоратив");
    }

}