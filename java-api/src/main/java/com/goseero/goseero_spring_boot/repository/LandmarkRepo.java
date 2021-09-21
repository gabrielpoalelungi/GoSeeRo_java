package com.goseero.goseero_spring_boot.repository;

import com.goseero.goseero_spring_boot.model.Landmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandmarkRepo extends JpaRepository<Landmark, Long> {
}
