package com.ruso.backend.repository;

import com.ruso.backend.data.DescriereaProgramuluiData;
import com.ruso.backend.model.CalendarAdmitere;
import com.ruso.backend.model.Hotarare;
import com.ruso.backend.model.InfoAbsolvireDisertatie;
import com.ruso.backend.model.Regulament;
import com.ruso.backend.model.Semestru;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class DescriereaProgramuluiRepository {

    public Regulament getRegulamentCazare() {
        return new Regulament(
                DescriereaProgramuluiData.Regulamente.Cazare.TITLU,
                DescriereaProgramuluiData.Regulamente.Cazare.SUBTITLU,
                DescriereaProgramuluiData.Regulamente.Cazare.DESCRIERE,
                DescriereaProgramuluiData.Regulamente.Cazare.LINK_MAI_MULTE
        );
    }

    public Regulament getRegulamentCredite() {
        return new Regulament(
                DescriereaProgramuluiData.Regulamente.Credite.TITLU,
                DescriereaProgramuluiData.Regulamente.Credite.SUBTITLU,
                DescriereaProgramuluiData.Regulamente.Credite.DESCRIERE,
                DescriereaProgramuluiData.Regulamente.Credite.LINK_MAI_MULTE
        );
    }

    public List<Hotarare> getHotarari() {
        return Arrays.asList(
                DescriereaProgramuluiData.Regulamente.Hotarari.HOTARARE_1,
                DescriereaProgramuluiData.Regulamente.Hotarari.HOTARARE_2,
                DescriereaProgramuluiData.Regulamente.Hotarari.HOTARARE_3,
                DescriereaProgramuluiData.Regulamente.Hotarari.HOTARARE_4,
                DescriereaProgramuluiData.Regulamente.Hotarari.HOTARARE_5,
                DescriereaProgramuluiData.Regulamente.Hotarari.HOTARARE_6,
                DescriereaProgramuluiData.Regulamente.Hotarari.HOTARARE_7,
                DescriereaProgramuluiData.Regulamente.Hotarari.HOTARARE_8,
                DescriereaProgramuluiData.Regulamente.Hotarari.HOTARARE_9,
                DescriereaProgramuluiData.Regulamente.Hotarari.HOTARARE_10
        );
    }

    public InfoAbsolvireDisertatie getInfoAbsolvireDisertatie() {
        return DescriereaProgramuluiData.InfoAbsolvire.INFO;
    }

    public List<CalendarAdmitere> getInfoAdmitere() {
        return Arrays.asList(
                DescriereaProgramuluiData.InfoAdmitere.SESIUNEA_IULIE_2020,
                DescriereaProgramuluiData.InfoAdmitere.SESIUNEA_SEPTEMBRIE_2020
        );
    }

    public List<Semestru> getListaDiscipline() {
        return Arrays.asList(
                DescriereaProgramuluiData.ListaDiscipline.SEMESTRU_1,
                DescriereaProgramuluiData.ListaDiscipline.SEMESTRU_2,
                DescriereaProgramuluiData.ListaDiscipline.SEMESTRU_3,
                DescriereaProgramuluiData.ListaDiscipline.SEMESTRU_4
        );
    }
}