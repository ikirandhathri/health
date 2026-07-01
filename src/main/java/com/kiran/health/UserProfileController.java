package com.kiran.health;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/profile")
public class UserProfileController {

    private final UserProfileRepository userProfileRepository;

    // Connects our web endpoints directly to our cloud database repository
    public UserProfileController(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    // HTTP POST: Save or update your profile metrics
    @PostMapping
    public UserProfile saveProfile(@RequestBody UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    // HTTP GET: View your saved goals
    @GetMapping
    public List<UserProfile> getProfiles() {
        return userProfileRepository.findAll();
    }
}