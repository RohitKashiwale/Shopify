package com.kips.backend.service;

import com.kips.backend.service.dto.ReviewDto;
import com.kips.backend.service.request.ReviewRequest;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("http://localhost:3000/")
public interface ReviewService {
    ReviewDto getReview(Integer reviewId);
    void createReview(ReviewRequest createRequest);
    void deleteReview(Integer reviewId);
}
