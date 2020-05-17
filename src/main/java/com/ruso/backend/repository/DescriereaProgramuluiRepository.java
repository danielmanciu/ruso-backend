package com.ruso.backend.repository;

import com.ruso.backend.model.Hotarare;
import com.ruso.backend.model.Regulament;
import com.ruso.backend.utils.DataProvider;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class DescriereaProgramuluiRepository {

    public Regulament getRegulamentCazare() {
        return new Regulament(
                DataProvider.DescriereaProgramului.Regulamente.Cazare.TITLU,
                DataProvider.DescriereaProgramului.Regulamente.Cazare.SUBTITLU,
                DataProvider.DescriereaProgramului.Regulamente.Cazare.DESCRIERE,
                DataProvider.DescriereaProgramului.Regulamente.Cazare.LINK_MAI_MULTE
        );
    }

    public Regulament getRegulamentCredite() {
        return new Regulament(
                DataProvider.DescriereaProgramului.Regulamente.Credite.TITLU,
                DataProvider.DescriereaProgramului.Regulamente.Credite.SUBTITLU,
                DataProvider.DescriereaProgramului.Regulamente.Credite.DESCRIERE,
                DataProvider.DescriereaProgramului.Regulamente.Credite.LINK_MAI_MULTE
        );
    }

    public List<Hotarare> getHotarari() {
        return Arrays.asList(
                DataProvider.DescriereaProgramului.Regulamente.Hotarari.HOTARARE_1,
                DataProvider.DescriereaProgramului.Regulamente.Hotarari.HOTARARE_2,
                DataProvider.DescriereaProgramului.Regulamente.Hotarari.HOTARARE_3,
                DataProvider.DescriereaProgramului.Regulamente.Hotarari.HOTARARE_4,
                DataProvider.DescriereaProgramului.Regulamente.Hotarari.HOTARARE_5,
                DataProvider.DescriereaProgramului.Regulamente.Hotarari.HOTARARE_6,
                DataProvider.DescriereaProgramului.Regulamente.Hotarari.HOTARARE_7,
                DataProvider.DescriereaProgramului.Regulamente.Hotarari.HOTARARE_8,
                DataProvider.DescriereaProgramului.Regulamente.Hotarari.HOTARARE_9,
                DataProvider.DescriereaProgramului.Regulamente.Hotarari.HOTARARE_10
        );
    }
}