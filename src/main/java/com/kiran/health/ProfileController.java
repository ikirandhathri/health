package com.kiran.health;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    private final ProfileRepository profileRepository;

    // Connects our web endpoints directly to our cloud database repository
    public ProfileController(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    // HTTP POST: Save or update your profile metrics
    @PostMapping
    public Profile saveProfile(@RequestBody Profile profile) {
        return profileRepository.save(profile);
    }

    // HTTP GET: View your saved goals
    @GetMapping
    public List<Profile> getProfiles() {
        return profileRepository.findAll();
    }
}