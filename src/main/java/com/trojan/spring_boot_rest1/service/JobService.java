package com.trojan.spring_boot_rest1.service;


import com.trojan.spring_boot_rest1.model.JobPost;
import com.trojan.spring_boot_rest1.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost)
    {
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs()
    {
        return repo.findAll();
    }

    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);

    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2),
                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 1),
                new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4),
                new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5)
        ));

        repo.saveAll(jobs);
    }
}
