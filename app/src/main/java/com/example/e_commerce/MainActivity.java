package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.e_commerce.adapter.ProductCategoryAdapter;
import com.example.e_commerce.model.ProductAdapter;
import com.example.e_commerce.model.ProductCategory;
import com.example.e_commerce.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler, productItemRecycler;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductCategory> productCategoryList= new ArrayList<>();
        productCategoryList.add(new ProductCategory(1,"Most Popular"));
        productCategoryList.add(new ProductCategory(2,"All Body Product"));
        productCategoryList.add(new ProductCategory(3,"Skin Care"));
        productCategoryList.add(new ProductCategory(4,"Hair"));

        setProductRecycler(productCategoryList);

        List<Products> productsList= new ArrayList<>();
        productsList.add(new Products(1,"Japanese Cherry Blossom","250 ml","$ 17.00", R.drawable.prod2));
        productsList.add(new Products(2,"African Mango Shower Gel","250 ml","$ 25.00", R.drawable.prod1));
        productsList.add(new Products(1,"Japanese Cherry Blossom","250 ml","$ 17.00", R.drawable.prod2));
        productsList.add(new Products(2,"African Mango Shower Gel","250 ml","$ 25.00", R.drawable.prod1));
        productsList.add(new Products(1,"Japanese Cherry Blossom","250 ml","$ 17.00", R.drawable.prod2));
        productsList.add(new Products(2,"African Mango Shower Gel","250 ml","$ 25.00", R.drawable.prod1));

        setProductItemRecycler(productsList);

    }

    private void setProductRecycler(List<ProductCategory> productCategoryList)
    {
        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);
    }

    private void setProductItemRecycler(List<Products> productsList)
    {
        productItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productsList);
        productItemRecycler.setAdapter(productAdapter);
    }

}