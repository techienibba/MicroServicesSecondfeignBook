package com.BookService.bookservice.Service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.BookService.bookservice.ExternalServices.Ratings;


@Service
@FeignClient(name="RATING-SERVICE")
public interface RatingService {
	
	@GetMapping("/ratings")
	List<Ratings> getratings();
	
	

	@GetMapping("/ratings/{ratingid}")
	Ratings getratingbyid(@PathVariable("ratingid") int ratingid);
	
	
	
	
	

}
