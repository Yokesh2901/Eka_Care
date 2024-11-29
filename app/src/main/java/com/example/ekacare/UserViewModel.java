package com.example.ekacare;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class UserViewModel extends AndroidViewModel {

    private final com.example.ekacare.UserRepository userRepository;
    private final MutableLiveData<User> userLiveData = new MutableLiveData<>();

    public UserViewModel(com.example.ekacare.UserRepository application) {
        super(application);
        userRepository = new com.example.ekacare.UserRepository(application); // Assuming you have a UserRepository
    }

    public LiveData<User> getUser() {
        return userLiveData;
    }

    public void saveUser(String name, int age, String dob, String address) {
        User newUser = new User(name, age, dob, address); // Assuming you have a User class
        userRepository.saveUser(newUser);
        userLiveData.setValue(newUser); // Update LiveData with the new user
    }
}
