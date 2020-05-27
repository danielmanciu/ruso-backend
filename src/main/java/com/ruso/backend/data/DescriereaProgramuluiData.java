package com.ruso.backend.data;

import com.ruso.backend.model.Act;
import com.ruso.backend.model.CalendarAdmitere;
import com.ruso.backend.model.Disciplina;
import com.ruso.backend.model.Hotarare;
import com.ruso.backend.model.InfoAbsolvireDisertatie;
import com.ruso.backend.model.Semestru;
import java.util.Arrays;

import static com.ruso.backend.data.Constants.EMPTY_STRING;

public class DescriereaProgramuluiData {

    public static class Regulamente {

        public static class Cazare {
            public static String TITLU = "REGULAMENT – CADRU al Universitatii Babes-Bolyai privind cazarea in caminele studentesti";
            public static String SUBTITLU = "- aprobat in sedinta Consiliului de Administratie din data de 23 iulie 2009 -";
            public static String DESCRIERE = "Capitolul I. Dispozitii generale\n" +
                    "Art. 1. Caminele studentesti sunt unitati aflate in proprietatea, administrarea si folosinta Universitatii Babes-Bolyai, care asigura conditii de viata si studiu pentru studenti. Acestea functioneaza pe intreaga perioada a anului universitar. \n" +
                    "Art. 2. Cazarea in caminele studentesti se face anual, la inceputul fiecarui an universitar, pe baza de cerere nominala. \n" +
                    "Art. 3. Repartitia locurilor de cazare pe facultati va fi propusa spre aprobarea Senatului Universitatii Babes-Bolyai de catre Directia Generala Administrativa a Universitatii, impreuna cu prefectul si subprefectii studentilor, in conformitate cu reglementarile in vigoare si tinând cont de numarul studentilor cu domiciliul stabil in afara municipiului Cluj-Napoca. \n" +
                    "Art. 4. Pentru a putea repartiza locurile de cazare in camine, este obligatoriu ca: \n" +
                    "(1) fiecare facultate sa comunice Directiei Generale Administrative cifra de scolarizare a studentilor bugetati: cursuri de zi, nivel licenta si master, a studentilor straini, bursieri ai statului român si a doctoranzilor cu frecventa. \n" +
                    "(2) Centrul de Cooperari Internationale sa comunice cifra studentilor straini veniti la studiu in cadrul programelor SOCRATES/ERASMUS si CEEPUS care urmeaza sa fie cazati in caminele alocate acestora. \n" +
                    "(3) Prefectul studentilor sa comunice lista studentilor senatori si cancelari care vor beneficia de cazare in camine. \n" +
                    "Art. 5. (1) La nivelul fiecarei facultati se constituie o Comisie de cazare care are obligatia de a repartiza toate locurile de cazare in camine, in termen de cel mult 15 zile calendaristice de la inceperea anului universitar. \n" +
                    "(2) Facultatile pot efectua schimburi de locuri de cazare in camine in functie de solicitari, in limita locurilor disponibile, in termen de 15 zile calendaristice de la inceperea anului universitar. \n" +
                    "(3) In situatia in care o facultate considera ca nu poate acoperi numarul total de locuri de cazare ce ii revin cu studentii proprii, va pune la dispozitia Directiei Generale Administrative locurile disponibile, pentru a fi redistribuite celorlaltor facultati, conform algoritmului de distribuire a locurilor de cazare pe facultati.";
            public static String LINK_MAI_MULTE = "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/reg_cazari.pdf";
        }

        public static class Credite {
            public static String TITLU = "REGULAMENT privind activitatea profesională a studenţilor (nivel licenţă şi master) din Universitatea Babeş-Bolyai în baza sistemului european de credite transferabile (ECTS)";
            public static String SUBTITLU = EMPTY_STRING;
            public static String DESCRIERE = "CAP. I. DISPOZIŢII GENERALE\n" +
                    "\n" +
                    "Art.1. Regulamentul privind activitatea profesională a studenţilor în baza Sistemului European de Credite Transferabile cuprinde un set de norme aplicabile în interiorul Universităţii Babeş-Bolyai din Cluj-Napoca." +
                    "\n" +
                    "Art.2. Prevederile prezentului regulament se aplică tuturor categoriilor de studenţi şi tuturor formelor de învăţământ de la Universitatea Babeş-Bolyai din Cluj-Napoca, respectând Legea educaţiei naţionale 1/2011, Ordinul MECTS privind aprobarea Codului drepturilor şi obligaţiilor studentului şi Carta Universităţii Babeş-Bolyai din Cluj-Napoca. În Universitate, în conformitate cu prevederile legale în vigoare, procesul de învăţământ se organizează pe cicluri:\n" +
                    "\n" +
                    "ciclul I: licenţa, cuprinde 6 – 8 semestre;\n" +
                    "ciclul II: masterat, cuprinde 2 - 4 semestre;";
            public static String LINK_MAI_MULTE = "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/reg_credite.pdf";
        }

        public static class Hotarari {
            public static Hotarare HOTARARE_1 = new Hotarare(
                    "Consiliul Facultatii",
                    "14.05.2019",
                    "EXTRAS referitor la sesiunea de lichidare",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/hotarari-cf/extras-sesiune-lichidare-2019.pdf",
                    EMPTY_STRING
            );
            public static Hotarare HOTARARE_2 = new Hotarare(
                    "Consiliul Facultatii",
                    "21.11.2017",
                    "criterii suplimentare pentru transferul de la specializarea Pedagogie la specializarea Pedagogia învățământului primar și preșcolar",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/hotarari-cf/2017-transfer-ped-pipp.pdf",
                    EMPTY_STRING
            );
            public static Hotarare HOTARARE_3 = new Hotarare(
                    "Consiliul de Administratie",
                    "17.04.2016",
                    "hotarare privind modificarea cuantumului burselor studentilor din semestrul II, anul universitar 2015-2016",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/hotarari-ca/2015-2016-modificare-cuantum-burse-sem-2.pdf",
                    EMPTY_STRING
            );
            public static Hotarare HOTARARE_4 = new Hotarare(
                    "Senat UBB",
                    EMPTY_STRING,
                    "Hotararea Nr. 24.314/30.09.2014",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/hotarari-ubb/taxe-2014_2015.pdf",
                    "Referitor la Regulamentul de taxe pe anul universitar 2014-2015"
            );
            public static Hotarare HOTARARE_5 = new Hotarare(
                    "Colegiu Consiliului Profesoral",
                    "14.05.2014",
                    "EXTRAS referitor la sesiunea de lichidare",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/hotarari-ccp/extras-sesiune-lichidare-2014.pdf",
                    EMPTY_STRING
            );
            public static Hotarare HOTARARE_6 = new Hotarare(
                    "Senat UBB",
                    EMPTY_STRING,
                    "Hotararea Nr. 4510/03.03.2014",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/hotarari-ubb/2014-referitor-burse-performanta.pdf",
                    "Referitor la Metodologia de acordare a burselor de performanta"
            );
            public static Hotarare HOTARARE_7 = new Hotarare(
                    "Colegiu Consiliului Profesoral",
                    "05.06.2013",
                    "EXTRAS referitor la pragul minim acceptat la examenul de licenta/inscriere admitere masterat si numarul minim de puncte obtinut la testul de limba la centrele universitatii",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/hotarari-ccp/extras-prag-punct-nivel-limba.pdf",
                    EMPTY_STRING
            );
            public static Hotarare HOTARARE_8 = new Hotarare(
                    "Colegiu Consiliului Profesoral",
                    "07.05.2012",
                    "Hotarare cu privire la organizarea sesiunii de lichidare",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/hotarari-ccp/extras-sesiune-lichidare-02.pdf",
                    EMPTY_STRING
            );
            public static Hotarare HOTARARE_9 = new Hotarare(
                    "Senat UBB",
                    EMPTY_STRING,
                    "Hotararea Nr. 33/SEN/02.05.2012",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/hotarari-ubb/hotarare-senat-33-2012.pdf",
                    EMPTY_STRING
            );
            public static Hotarare HOTARARE_10 = new Hotarare(
                    "Senat UBB",
                    EMPTY_STRING,
                    "17.02.2011 - Notificare privind aspectele vietii studentesti",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/regulamente/hotarari-ubb/viata_studenteasca.pdf",
                    EMPTY_STRING
            );
        }
    }

    public static class InfoAbsolvire {

        public static Act CERERE_TIP = new Act("cerere tip (semnată)", "modelul de cerere", "https://psiedu.ubbcluj.ro/data/uploads/doc/disertatie/2020-formular-inscriere-disertatie.pdf");
        public static Act DIPLOMA_BACALAUREAT = new Act("diploma de bacalaureat și foaia matricolă (pentru diplomele însoțite de foaie matricolă) sau diploma echivalentă acesteia (excepție fac absolvenții care au la dosarul de student aceste acte în original)");
        public static Act DIPLOMA_LICENTA = new Act("diploma de licență și foaia matricolă/suplimentul la diplomă (pentru diplomele însoțite de foaie matricolă/suplimentul la diplomă) sau diploma echivalentă acesteia (excepție fac absolvenții care au la dosarul de student aceste acte în original)");
        public static Act CERTIFICAT_NASTERE = new Act("certificatul de naștere");
        public static Act CARTE_IDENTITATE = new Act("cartea de identitate, în situațiile în care: a) certificatul de naștere nu conține Codul Numeric Personal; b) certificatul de naștere este vechi și se specifică raionul și nu județul; c) denumirea oficială a localității s-a schimbat; d) este nevoie de clarificarea datelor personale ale titularului");
        public static Act LUCRARE_DISERTATIE = new Act("lucrarea de disertație");
        public static Act ACCEPTUL_COORDONATORULUI = new Act("acceptul coordonatorului științific pentru lucrarea de disertație", "acord profesor/referat", "https://psiedu.ubbcluj.ro/data/uploads/doc/licenta/2018-referat-licenta.pdf");
        public static Act DECLARATIE_AUTENTICITATE = new Act(" declarație pe proprie răspundere privind originalitatea lucrării de diserație (semnată)", "declarația tip", "https://psiedu.ubbcluj.ro/data/uploads/doc/licenta/2018-declaratie-autenticitate-licenta-disertatie.pdf");
        public static Act DOVADA_ACHITARE_TAXE = new Act("dovada achitării taxei de înscriere (dacă este cazul)");
        public static Act DECLARATIE_DATE_CONTACT = new Act("declarație date de contact", "declarație tip", "https://psiedu.ubbcluj.ro/data/uploads/doc/licenta/2019-declaratie-contact-licenta-disertatie.pdf");

        public static InfoAbsolvireDisertatie INFO = new InfoAbsolvireDisertatie(
                "Psihologie",
                "Psihologia resurselor umane si sanatate organizationala LR",
                Arrays.asList(CERERE_TIP, DIPLOMA_BACALAUREAT, DIPLOMA_LICENTA, CERTIFICAT_NASTERE, CARTE_IDENTITATE,
                        LUCRARE_DISERTATIE, ACCEPTUL_COORDONATORULUI, DECLARATIE_AUTENTICITATE, DOVADA_ACHITARE_TAXE,
                        DECLARATIE_DATE_CONTACT)
        );
    }

    public static class InfoAdmitere {
        public static CalendarAdmitere SESIUNEA_IULIE_2020 = new CalendarAdmitere(
                "Sesiunea iulie 2020",
                Arrays.asList(
                        "9,10,11,13 iulie 2020",
                        "- înscrierea candidaţilor, ora 9-13 (orar casierie 9-13)",
                        "15,16 iulie 2019",
                        "- sustineri de examen (sălile vor fi afișate cu o zi înainte)",
                        "17 iulie 2020",
                        "- afişarea listelor de admitere",
                        "18,20 iulie 2020",
                        "– confirmarea locurilor, depunerea cererilor de redistribuire, ora 9-13 (orar casierie 9-13)",
                        "21,22 iulie 2020",
                        "- afişarea rezultatelor dupa redistribuire 1",
                        "- confirmarea locurilor după redistribuire 1, ora 9-15 (orar casierie 9-15)",
                        "- afişarea rezultatelor după redistribuire 2",
                        "23 iulie 2020",
                        "- confirmarea locurilor după redistribuire 2, ora 9-15 (orar casierie 9-15),",
                        "24 iulie 2020",
                        "- afişarea listelor finale")
        );
        public static CalendarAdmitere SESIUNEA_SEPTEMBRIE_2020 = new CalendarAdmitere(
                "Sesiunea septembrie 2020",
                Arrays.asList(
                        "7,8 septembrie 2020",
                        "- înscrierea candidaţilor, ora 9-13 (orar casierie 9-13)",
                        "10 septembrie 2020",
                        "- sustineri de examen",
                        "11 septembrie 2020",
                        "- afişarea listelor de admitere",
                        "14 septembrie 2020",
                        "– confirmarea locurilor, depunerea cererilor de redistribuire, ora 9-13 (orar casierie 9-13)",
                        "15 septembrie 2020",
                        "- afişarea rezultatelor dupa redistribuire",
                        "- confirmarea locurilor dupa redistribuire, ora 9-13 (orar casierie 9-13)",
                        "16 septembrie 2020",
                        "- afişarea listelor finale")
        );
    }

    public static class ListaDiscipline {
        public static Semestru SEMESTRU_1 = new Semestru(
                1,
                Arrays.asList(
                        new Disciplina("PMR1401", "Psihologia personalului / Personnel Psychology"),
                        new Disciplina("PME1427", "Advanced Organizational Psychology / Psihologie organizațională avansată (în limba engleză)"),
                        new Disciplina("PMR1428", "Metodologia cercetării și analiza datelor I (elemente de etică, noțiuni de bază" +
                                " de Excel & SPSS) / Research methodology and data analysis I (ethics, basic concepts of Excel & SPSS)"),
                        new Disciplina("PMR1425", "Psihologie antreprenorială / Psychology of entrepreneurship"),
                        new Disciplina("PME1429", "Managerial Decision Making/Decizia managerială (în limba engleză)"),
                        new Disciplina("PMR1422", "Stagiu practic 1 / Traineeship 1")
                )
        );
        public static Semestru SEMESTRU_2 = new Semestru(
                2,
                Arrays.asList(
                        new Disciplina("PME1438", "Occupational Health Psychology / Psihologia sănătății ocupaționale (în limba engleză)"),
                        new Disciplina("PME1439", "Methods of Enhancing Group Performance / Metode de optimizare a performanței grupurilor (în limba engleză)"),
                        new Disciplina("PME1430", "Knowledge Management and Innovation / Managementul cunoștințelor și inovație (în limba engleză)"),
                        new Disciplina("PMR1431", "Metodologia cercetării și analiza datelor II (nivel avansat) / Research methodology and data analysis II (advanced)"),
                        new Disciplina("PMR1419", "Managementul proiectelor / Project Management"),
                        new Disciplina("PMR1408", "Stagiu practic 2 / Traineeship 2"),
                        new Disciplina("PRM1420", "Curs opțional: Tehnici de analiză de conținut în organizații / Content analysis in organisations"),
                        new Disciplina("PRM1423", "Curs opțional: Sănătate și stare de bine în organizații / Health and wellbeing in organizations")
                )
        );
        public static Semestru SEMESTRU_3 = new Semestru(
                3,
                Arrays.asList(
                        new Disciplina("PMR1409", "Coaching: metode și tehnici / Coaching: methods and techniques"),
                        new Disciplina("PMR1432", "Management strategic / Strategic Management"),
                        new Disciplina("PME1443", "Diagnoză organizațională / Organizational Diagnosis (în limba engleză)"),
                        new Disciplina("PMR1412", "Training în organizații / Training in organizations"),
                        new Disciplina("PME1433", "Research in Organizations I / Stagiu de cercetare în organizații I (în limba engleză)"),
                        new Disciplina("PME1441", "Curs opțional: Consumer Psychology and Social Marketing / Psihologia consumatorului și marketing social (în limba engleză)"),
                        new Disciplina("PME1437", "Curs opțional: Gaming and Simulations / Simulări și metoda jocurilor (în limba engleză)")
                )
        );
        public static Semestru SEMESTRU_4 = new Semestru(
                4,
                Arrays.asList(
                        new Disciplina("PME1442", "Research in Organizations II (applied research, research ethics and " +
                                "preparing the disertation) / Stagiu de cercetare în organizații II (cercetare " +
                                "aplicată, etica cercetării și pregătirea disertației) (în limba engleză)"),
                        new Disciplina("PMR1403", "Dezvoltare organizațională / Organizational Development"),
                        new Disciplina("PME1440", "Multi-party Collaboration and Negotiation / Colaborare și negociere (în limba engleză)"),
                        new Disciplina("PME1435", "Writing and Presentation Skills / Abilități de redactare a unui manuscris științific și prezentare (în limba engleză)"),
                        new Disciplina("PME1436", "Technology and Society / Tehnologie și societate (în limba engleză)"),
                        new Disciplina("PMR1418", "Centre de evaluare și dezvoltare a personalului / Assessment centers and personnel development")
                )
        );
    }
}