package com.ruso.backend.data;

import com.ruso.backend.model.Act;
import com.ruso.backend.model.CalendarAdmitere;
import com.ruso.backend.model.Hotarare;
import com.ruso.backend.model.InfoAbsolvireDisertatie;
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

        public static class Acte {
            public static Act DOSAR_PLIC = new Act("dosar plic");
            public static Act FISA_LICHIDARE = new Act(
                    "fisa de lichidare semnata si stampilata de catre serviciile UBB",
                    "fisa de lichidare",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/licenta/fisa-lichidare.pdf"
            );
            public static Act REFERAT_DISERTATIE = new Act(
                    "referat privind lucrarea de disertatie",
                    "referatul tipizat",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/licenta/2018-referat-licenta.pdf"
            );
            public static Act CERERE_TIP = new Act(
                    "cerere tip, fata-verso",
                    "modelul de cerere",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/disertatie/2020-formular-inscriere-disertatie.pdf"
            );
            public static Act CERTIFICAT_NASTERE = new Act("certificat de nastere original + copie");
            public static Act DIPLOMA_BACALAUREAT = new Act("diploma de bacalaureat (original si 2 copii) si foaie matricola (original si 2 copii)");
            public static Act DIPLOMA_LICENTA = new Act("diploma de licenta (original si 2 copii) si foaie matricola sau supliment la diploma (original si 2 copii)");
            public static Act LUCRAREA_DISERTATIE_LISTATA = new Act("lucrarea de disertatie – 1 exemplar listat si legat (nu este obligatorie copertarea) care se depune la comisie in momentul sustinerii");
            public static Act LUCRAREA_DISERTATIE_CD = new Act("lucrarea de disertatie in format electronic, pe CD");
            public static Act DECLARATIE_AUTENTICITATE = new Act(
                    "declaratie privind autenticitatea tezei",
                    "declaratia tip",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/licenta/2018-declaratie-autenticitate-licenta-disertatie.pdf"
            );
            public static Act DECLARATIE_DATE_CONTACT = new Act(
                    "declaratie date contact",
                    "declaratia tip",
                    "https://psiedu.ubbcluj.ro/data/uploads/doc/licenta/2019-declaratie-contact-licenta-disertatie.pdf"
            );
            public static Act REZUMATUL_LUCRARII = new Act("rezumatul lucrarii de licenta/disertatie, max. 1 pag. (un exemplar in limba romana si un exemplar intr-o limba de circulatie internationala)");
            public static Act DOVADA_ACHITARE_TAXE = new Act("dovada achitării taxei de înscriere (daca este cazul)");
        }

        public static InfoAbsolvireDisertatie INFO = new InfoAbsolvireDisertatie(
                "Psihologie",
                "Psihologia resurselor umane si sanatate organizationala LR",
                "19 februarie ora 9, str. Republicii nr.37, biroul prof.dr. Baban, etajul I",
                Arrays.asList(Acte.DOSAR_PLIC, Acte.FISA_LICHIDARE, Acte.REFERAT_DISERTATIE, Acte.CERERE_TIP,
                        Acte.CERTIFICAT_NASTERE, Acte.DIPLOMA_BACALAUREAT, Acte.DIPLOMA_LICENTA,
                        Acte.LUCRAREA_DISERTATIE_LISTATA, Acte.LUCRAREA_DISERTATIE_CD, Acte.DECLARATIE_AUTENTICITATE,
                        Acte.DECLARATIE_DATE_CONTACT, Acte.REZUMATUL_LUCRARII, Acte.DOVADA_ACHITARE_TAXE)
        );
    }

    public static class InfoAdmitere {
        public static CalendarAdmitere SESIUNEA_IULIE_2020 = new CalendarAdmitere(
                "Sesiunea iulie 2020",
                "9,10,11,13 iulie 2020\n- înscrierea candidaţilor, ora 9-13 (orar casierie 9-13)\n" +
                        "15,16 iulie 2019\n- sustineri de examen (sălile vor fi afișate cu o zi înainte)\n" +
                        "17 iulie 2020\n- afişarea listelor de admitere\n" +
                        "18,20 iulie 2020\n– confirmarea locurilor, depunerea cererilor de redistribuire, ora 9-13 (orar casierie 9-13)\n" +
                        "21,22 iulie 2020\n- afişarea rezultatelor dupa redistribuire 1\n" +
                        "- confirmarea locurilor după redistribuire 1, ora 9-15 (orar casierie 9-15)\n" +
                        "- afişarea rezultatelor după redistribuire 2\n" +
                        "23 iulie 2020\n- confirmarea locurilor după redistribuire 2, ora 9-15 (orar casierie 9-15)\n" +
                        "24 iulie 2020\n- afişarea listelor finale"
        );
        public static CalendarAdmitere SESIUNEA_SEPTEMBRIE_2020 = new CalendarAdmitere(
                "Sesiunea septembrie 2020",
                "7,8 septembrie 2020\n- înscrierea candidaţilor, ora 9-13 (orar casierie 9-13)\n" +
                        "10 septembrie 2020\n- sustineri de examen\n" +
                        "11 septembrie 2020\n- afişarea listelor de admitere\n" +
                        "14 septembrie 2020\n– confirmarea locurilor, depunerea cererilor de redistribuire, ora 9-13 (orar casierie 9-13)\n" +
                        "15 septembrie 2020\n- afişarea rezultatelor dupa redistribuire\n" +
                        "- confirmarea locurilor dupa redistribuire, ora 9-13 (orar casierie 9-13)\n" +
                        "16 septembrie 2020\n- afişarea listelor finale"
        );
    }
}