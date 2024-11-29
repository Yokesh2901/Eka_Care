package com.example.ekacare;

import android.app.Application;
import android.content.Context;

public class UserRepository extends Application {

    private final Context context;

    public UserRepository(Context context) {
        this.context = context;
    }

    public void saveUser(com.example.ekacare.User user) {
        // Logic to save the user, could be database interaction or API call
    }
}
