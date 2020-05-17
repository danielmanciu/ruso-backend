package com.ruso.backend.repository;

import com.ruso.backend.model.Regulament;
import com.ruso.backend.utils.StringProvider;
import org.springframework.stereotype.Repository;

@Repository
public class DescriereaProgramuluiRepository {

    public Regulament getRegulamentCazare() {
        return new Regulament(
                StringProvider.DescriereaProgramului.Regulamente.Cazare.TITLU,
                StringProvider.DescriereaProgramului.Regulamente.Cazare.SUBTITLU,
                StringProvider.DescriereaProgramului.Regulamente.Cazare.DESCRIERE,
                StringProvider.DescriereaProgramului.Regulamente.Cazare.LINK_MAI_MULTE
        );
    }

    public Regulament getRegulamentCredite() {
        return new Regulament(
                StringProvider.DescriereaProgramului.Regulamente.Credite.TITLU,
                StringProvider.DescriereaProgramului.Regulamente.Credite.SUBTITLU,
                StringProvider.DescriereaProgramului.Regulamente.Credite.DESCRIERE,
                StringProvider.DescriereaProgramului.Regulamente.Credite.LINK_MAI_MULTE
        );
    }

    public Regulament getHotarari() {
        return new Regulament(
                StringProvider.DescriereaProgramului.Regulamente.Credite.TITLU,
                StringProvider.DescriereaProgramului.Regulamente.Credite.SUBTITLU,
                StringProvider.DescriereaProgramului.Regulamente.Credite.DESCRIERE,
                StringProvider.DescriereaProgramului.Regulamente.Credite.LINK_MAI_MULTE
        );
    }
}
