package com.ruso.backend.repository;

import com.ruso.backend.data.MediulMunciiData;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MediulMunciiRepository {

    public List<String> getOportunitatiProfesionale() {
        return Arrays.asList(
                MediulMunciiData.OportunitatiProfesionale.OPORTUNITATE_PROFESIONALA_1,
                MediulMunciiData.OportunitatiProfesionale.OPORTUNITATE_PROFESIONALA_2,
                MediulMunciiData.OportunitatiProfesionale.OPORTUNITATE_PROFESIONALA_3,
                MediulMunciiData.OportunitatiProfesionale.OPORTUNITATE_PROFESIONALA_4,
                MediulMunciiData.OportunitatiProfesionale.OPORTUNITATE_PROFESIONALA_5
        );
    }
}