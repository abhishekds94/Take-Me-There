package com.abhishek.avidprogrammers.takemethere.Widget;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class FavoriteRestaurantsWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new FavoriteRestaurantsRemoteViewFactory(this.getApplicationContext(), intent);
    }
}
