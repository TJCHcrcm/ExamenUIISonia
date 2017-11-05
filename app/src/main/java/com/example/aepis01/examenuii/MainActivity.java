package com.example.aepis01.examenuii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends RecyclerView.Adapter<UserAdapter.ViewHolder>  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
