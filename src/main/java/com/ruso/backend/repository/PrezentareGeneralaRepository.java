package com.ruso.backend.repository;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

import static com.ruso.backend.utils.StringProvider.PrezentareGenerala.TESTIMONIAL_1;
import static com.ruso.backend.utils.StringProvider.PrezentareGenerala.TESTIMONIAL_2;
import static com.ruso.backend.utils.StringProvider.PrezentareGenerala.TESTIMONIAL_3;
import static com.ruso.backend.utils.StringProvider.PrezentareGenerala.TESTIMONIAL_4;
import static com.ruso.backend.utils.StringProvider.PrezentareGenerala.TESTIMONIAL_5;

@Repository
public class PrezentareGeneralaRepository {

    public List<String> getTestimoniale() {
        return Arrays.asList(TESTIMONIAL_1, TESTIMONIAL_2, TESTIMONIAL_3, TESTIMONIAL_4, TESTIMONIAL_5);
    }
}