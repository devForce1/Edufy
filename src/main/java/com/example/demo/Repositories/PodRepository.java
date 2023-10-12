package com.example.demo.Repositories;

import com.example.demo.Entity.Artist;
import com.example.demo.Entity.Music;
import com.example.demo.Entity.Pod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PodRepository extends JpaRepository<Pod, Integer> {
    List<Pod> findPodByArtist(Artist artist);
}
