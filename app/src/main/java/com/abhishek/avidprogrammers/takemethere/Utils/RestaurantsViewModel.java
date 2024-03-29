package com.abhishek.avidprogrammers.takemethere.Utils;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

import com.abhishek.avidprogrammers.takemethere.DB.RestaurantDatabase;
import com.abhishek.avidprogrammers.takemethere.Objects.Restaurant_;

public class RestaurantsViewModel extends AndroidViewModel {

    private LiveData<List<Restaurant_>> restaurants;

    public RestaurantsViewModel(@NonNull Application application) {
        super(application);
        RestaurantDatabase restaurantDatabase = RestaurantDatabase.getInstance(getApplication());
        restaurants = restaurantDatabase.restaurantDao().loadFavoriteRestaurants();
    }

    public LiveData<List<Restaurant_>> getRestaurants() {
        return restaurants;
    }
}