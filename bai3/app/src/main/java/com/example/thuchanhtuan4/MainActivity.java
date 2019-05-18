package com.example.thuchanhtuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView1;
    ArrayList<FootballLegend> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setControl();
        setEvent();

    }
    void setControl(){
        listView1 = (ListView)findViewById(R.id.listview1);
    }
    void setEvent(){
        KhoiTao();
        FootballLegendAdapter adapter = new FootballLegendAdapter(this, R.layout.activity_list_view_row, data);
        listView1.setAdapter(adapter);
    }
    void KhoiTao(){
        data.add(new FootballLegend(R.mipmap.xuantruong,"Xuan Truong", "28/4/1995 (23 age)", R.mipmap.vn));
        data.add(new FootballLegend(R.mipmap.davidbeckham,"David Beckham", "2/5/1975 (43 age)", R.mipmap.gb));
        data.add(new FootballLegend(R.mipmap.crisronaldo,"Cris Ronaldo", "5/2/1985 (34 age))", R.mipmap.pt));
        data.add(new FootballLegend(R.mipmap.kylianmbappe,"Kylian Mbappe", "20/12/1998 (20 age)", R.mipmap.fr));
    }
}
