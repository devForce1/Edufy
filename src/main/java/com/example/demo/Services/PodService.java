package com.example.demo.Services;

import com.example.demo.Entity.Music;
import com.example.demo.Entity.Pod;
import com.example.demo.Repositories.ArtistRepository;
import com.example.demo.Repositories.MusicRepository;
import com.example.demo.Repositories.PodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodService implements PodServiceInterface {
    @Autowired
    private PodRepository podRepository;
    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public List<Pod> getAllPod(int artistID) {
        List<Pod> getAllPod = podRepository.findPodByArtist(artistRepository.findById(artistID).get());
        return getAllPod;
    }
}
