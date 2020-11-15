package com.example.wattpadclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.wattpadclone.Adapters.Beans.HorizontalRecyclerViewHomeBean1;
import com.example.wattpadclone.Adapters.Beans.HorizontalRecyclerViewHomeBean2;
import com.example.wattpadclone.Adapters.Beans.VerticalRecyclerViewHomeBean;
import com.example.wattpadclone.Adapters.HorizontalRecyclerViewHomeAdapter1;
import com.example.wattpadclone.Adapters.VerticalRecyclerViewHomeAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView verticalRecyclerView;
    VerticalRecyclerViewHomeAdapter vAdapter;
    ArrayList<VerticalRecyclerViewHomeBean> arrayListVertical;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar_home);
        setSupportActionBar(toolbar);

        arrayListVertical = new ArrayList<>();

        verticalRecyclerView = (RecyclerView)findViewById(R.id.home_recyclerViewMain);
        verticalRecyclerView.setHasFixedSize(true);
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        vAdapter = new VerticalRecyclerViewHomeAdapter(this,arrayListVertical);
        verticalRecyclerView.setAdapter(vAdapter);


        completedBookAdd();
        test2();

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId()==R.id.toolbar_home_setting)
                {
                    // do something
                }
                else if(item.getItemId()== R.id.toolbar_home_account)
                {
                    startActivity(new Intent(getApplicationContext(), Account.class));
                }
                return false;
            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home_bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_bottom_navigation:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.search_bottom_navigation:
                        startActivity(new Intent(getApplicationContext(), Search.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar_home,menu);
        return true;
    }

    private void completedBookAdd() {
        ArrayList<HorizontalRecyclerViewHomeBean1> arrayListHorizontal1 = new ArrayList<>();
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "Guns, germs and steel", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "aaaaaaaaaaaaaaa", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "bbbbbbbbbbbbbbbb", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "Guns, germs and steel", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "Guns, germs and steel", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "Guns, germs and steel", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "Guns, germs and steel", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));

        ArrayList<HorizontalRecyclerViewHomeBean2> arrayListHorizontal2 = new ArrayList<>();
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        VerticalRecyclerViewHomeBean mVerticalRecyclerViewHomeBean = new VerticalRecyclerViewHomeBean("Truyện đã Hoàn Thành", "Đọc say sưa từ đầu đến cuối",
                "Truyện được thảo luận nhiều", "Các truyện có nhiều bình luận nhất", arrayListHorizontal1, arrayListHorizontal2);
        arrayListVertical.add(mVerticalRecyclerViewHomeBean);
        vAdapter.notifyDataSetChanged();
    }

    private void test2() {
        ArrayList<HorizontalRecyclerViewHomeBean1> arrayListHorizontal1 = new ArrayList<>();
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "Guns, germs and steel", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "aaaaaaaaaaaaaaa", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "bbbbbbbbbbbbbbbb", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "Guns, germs and steel", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "Guns, germs and steel", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "Guns, germs and steel", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));
        arrayListHorizontal1.add(new HorizontalRecyclerViewHomeBean1(R.drawable.testimg, "Guns, germs and steel", "Súng vi trùng và thép là một quyển sách hay", "Jared Diamond"));

        ArrayList<HorizontalRecyclerViewHomeBean2> arrayListHorizontal2 = new ArrayList<>();
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        arrayListHorizontal2.add(new HorizontalRecyclerViewHomeBean2(R.drawable.testimg));
        VerticalRecyclerViewHomeBean mVerticalRecyclerViewHomeBean = new VerticalRecyclerViewHomeBean("Truyện đã Hoàn Thành", "Đọc say sưa từ đầu đến cuối",
                "Truyện được thảo luận nhiều", "Các truyện có nhiều bình luận nhất", arrayListHorizontal1, arrayListHorizontal2);
        arrayListVertical.add(mVerticalRecyclerViewHomeBean);
        vAdapter.notifyDataSetChanged();
    }

}