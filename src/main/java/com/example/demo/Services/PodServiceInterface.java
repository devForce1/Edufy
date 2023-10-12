package com.example.demo.Services;

import com.example.demo.Entity.Music;
import com.example.demo.Entity.Pod;

import java.util.List;

public interface PodServiceInterface {
    List<Pod> getAllPod(int artistID);
}
