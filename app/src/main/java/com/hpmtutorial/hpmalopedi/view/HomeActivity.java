package com.hpmtutorial.hpmalopedi.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.hpmtutorial.hpmalopedi.R;
import com.hpmtutorial.hpmalopedi.model.Child;
import com.hpmtutorial.hpmalopedi.model.Family;
import com.hpmtutorial.hpmalopedi.model.ItemType;
import com.hpmtutorial.hpmalopedi.model.User;
import com.hpmtutorial.hpmalopedi.view.adapter.ParentAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

//    Recycler View
    private RecyclerView parentRecyclerView;
    private ParentAdapter parentRecyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;
//    Data
    private List<Family> families = new ArrayList<>();
    private List<ItemType> adapterItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_parent);

        parentRecyclerView = findViewById(R.id.parent_recycler_view);
        parentRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        parentRecyclerView.setLayoutManager(layoutManager);
        parentRecyclerViewAdapter = new ParentAdapter(adapterItems, new ParentAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ItemType item) {
                Toast.makeText(HomeActivity.this, "" + item.getType(), Toast.LENGTH_SHORT).show();
            }
        });
        parentRecyclerView.setAdapter(parentRecyclerViewAdapter);

//        Familii
        createFamily();
        loadAdapterItems();
    }

    private void loadAdapterItems() {
        for(Family f: families){
            adapterItems.add(f);
            adapterItems.addAll(f.getChildren());
        }
        parentRecyclerViewAdapter.notifyDataSetChanged();
    }

    private void createFamily() {
        User newUser = new User();
        newUser.setId("1");
        newUser.setName("Vlad");
        newUser.setPhone("123");
        Family newFamily = new Family();
        newFamily.setIdFamily("1");
        newFamily.setSuperUser(newUser);
        Child childOne = new Child();
        childOne.setId("1");
        childOne.setName("Vlad Jr");
        Child childTwo = new Child();
        childTwo.setId("2");
        childTwo.setName("Vlad Jr 2");
        List<Child> children = new ArrayList<>();
        children.add(childOne);
        children.add(childTwo);
        newFamily.setChildren(children);

        families.add(newFamily);

        Family newFamilyTwo = new Family();
        newFamilyTwo.setIdFamily("2");
        newFamilyTwo.setSuperUser(newUser);
        Child childThree = new Child();
        childThree.setId("1");
        childThree.setName("Child 21");
        Child childFour = new Child();
        childFour.setId("2");
        childFour.setName("Child 22");
        Child childFive = new Child();
        childFive.setId("3");
        childFive.setName("Child 23");
        List<Child> childrenTwo = new ArrayList<>();
        childrenTwo.add(childThree);
        childrenTwo.add(childFour);
        childrenTwo.add(childFive);
        newFamilyTwo.setChildren(childrenTwo);

        families.add(newFamilyTwo);

        Family newFamilyThree = new Family();
        newFamilyThree.setIdFamily("3");
        newFamilyThree.setSuperUser(newUser);
        Child childSix = new Child();
        childSix.setId("1");
        childSix.setName("Child 31");
        Child childSeven = new Child();
        childSeven.setId("2");
        childSeven.setName("Child 32");
        Child childEight = new Child();
        childEight.setId("3");
        childEight.setName("Child 33");
        List<Child> childrenThree = new ArrayList<>();
        childrenThree.add(childSix);
        childrenThree.add(childSeven);
        childrenThree.add(childEight);
        newFamilyThree.setChildren(childrenThree);

        families.add(newFamilyThree);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_new_child:
                Intent addNewChildActivity = new Intent(this, AddNewChildActivity.class);
                startActivityForResult(addNewChildActivity, 101);
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
