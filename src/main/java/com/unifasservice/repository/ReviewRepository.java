package com.unifasservice.repository;

import com.unifasservice.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReviewRepository  extends JpaRepository<Review, Long> {
}
