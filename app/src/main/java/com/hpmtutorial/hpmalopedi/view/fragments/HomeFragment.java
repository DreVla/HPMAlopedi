package com.hpmtutorial.hpmalopedi.view.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.hpmtutorial.hpmalopedi.R;
import com.hpmtutorial.hpmalopedi.model.Child;
import com.hpmtutorial.hpmalopedi.model.Family;
import com.hpmtutorial.hpmalopedi.model.ItemType;
import com.hpmtutorial.hpmalopedi.model.User;
import com.hpmtutorial.hpmalopedi.view.HomeActivity;
import com.hpmtutorial.hpmalopedi.view.adapter.ParentAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    //    Recycler View
    private RecyclerView parentRecyclerView;
    private ParentAdapter parentRecyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;
    //    Data
    private List<Family> families = new ArrayList<>();
    private List<ItemType> adapterItems = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_home, container, false);
        parentRecyclerView = view.findViewById(R.id.parent_recycler_view_fragment);
        parentRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(view.getContext());
        parentRecyclerView.setLayoutManager(layoutManager);
        parentRecyclerViewAdapter = new ParentAdapter(adapterItems, new ParentAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ItemType item) {
                Toast.makeText(view.getContext(), "" + item.getType(), Toast.LENGTH_SHORT).show();
            }
        });
        parentRecyclerView.setAdapter(parentRecyclerViewAdapter);

//        Familii
        if(adapterItems.size()==0) {
            createFamily();
            loadAdapterItems();
        }
        return view;
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
        childOne.setName("Copil1");
        Child childTwo = new Child();
        childTwo.setId("2");
        childTwo.setName("Copil2");
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
}
