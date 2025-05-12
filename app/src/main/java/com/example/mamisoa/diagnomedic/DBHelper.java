package com.example.mamisoa.diagnomedic;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "diagnomedic.db";
    private static final int DB_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        // Cr�ation de la table Symptomes
        db.execSQL("CREATE TABLE Symptomes (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nom TEXT NOT NULL);");

        // Insertion des sympt�mes
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Fi�vre');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Toux');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Maux de t�te');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Fatigue');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Douleurs Musculaires');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Frissons');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Essoufflement');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Douleur Thoracique');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Naus�es');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Vomissements');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Diarrh�e');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Perte d'app�tit');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Perte de poids');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Sueurs nocturnes');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Eruption cutan�e');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Taches rouge');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Gonflements des ganglions');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Maux de gorge');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Nez bouch�');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Eternuement');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Douleur abdominale');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Ballonement');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Constipation');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Brulure d'estomac');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Saignement de nez');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Vertiges');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Perte de l'�quilibre');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Vision Flou');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Acouph�nes');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Douleurs aux oreilles');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Raideur de la nuque');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Photophobie');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Trouble de la m�moire');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Troubles du sommeil');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Insomnie');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Somnolence exessive');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Tremblements');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Palpitations');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Transpirations exessive');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Frilosit�');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Sensation de chaleur');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Peau s�che');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Chute de cheveux');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Ongle cassants');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Irritabilit�');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Anxi�t�');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('D�pression');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Hallucinations');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Crise d'�pilepsie');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Confusion');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Sensation de br�lure urinaire');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Douleur pendant la miction');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Sang dans les urines');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Envies fr�quent d'uriner');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Incontinence');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Douleur pelvienne');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('R�gle irr�guliaire');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Absence de r�gle');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Saignements vaginaux anormaux');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Douleurs testiculaire');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Ejacuation douloureuse');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Bourdonnement de l'oreille');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Toux s�che');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Toux grasse');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Douleur articulaire');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Gonflement ariculaire');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Raideur articulaire');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Rougeur articulaire');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Fi�vre persistante');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Ganglions enfl�s');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Rougeurs oculaire');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('S�cheresse oculaire');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Larmoiement');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Vision double');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('T�che noires dans la vision');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Jaunisse');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Coloration fonc�e des urines');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Urines mousseuses');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Selles claires');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Selles sanglantes');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Selles noires');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('D�mangeaisons');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Peau jaun�tre');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Langue blanche');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Aphtes');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Mauvaise haleine');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Go�t mettalique');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Troubles de la parole');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Difficult�s � aval�r');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Toux avec sang');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Douleur � l'�paule');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Douleur au dos');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Douleur au genou');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Engourdissement');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Fourmillements');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Difficult�s � marcher');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Changements d'humeur');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Crises d'angoisse');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Trouble de l'attention');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Trouble du comportement');");
        db.execSQL("INSERT INTO Symptomes (nom) VALUES ('Hyperacctivit�');");

        // Cr�ation de la table Maladies
        db.execSQL("CREATE TABLE Maladies (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nom TEXT NOT NULL, " +
                "description TEXT);");

        // Insertion des maladies
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Rhume', 'Infection virale b�nigne avec toux et congestion');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Grippe', 'Infection virale aigu� des voies respiratoires.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('COVID-19', 'Maladie respiratoire caus�e par le coronavirus SARS-CoV-2.');");
        db.execSQL("INSERT INTO Maladies(nom, description) VALUES('Paludisme', 'Infection parasitaire transmise par les moustiques.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Tuberculose', 'Infection bact�rienne chronique des poumons.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Pneumonie', 'Infection des poumons caus�e par des bact�ries ou virus.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES('Bronchite chronique', 'Inflammation prolong�e des bronches.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Asthme', 'Maladie respiratoire chronique avec crises.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Migraine', 'C�phal�e chronique avec ou sans aura.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Sinusite', 'Inflammation des sinus nasaux.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Diab�te de type 2', 'Maladie chronique de r�gulation du sucre dans le sang.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Hypertension', 'Tension art�rielle �lev�e chronique.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Gastrite', 'Inflammation de la muqueuse de l�estomac.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('H�patite B', 'Infection virale du foie.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Insuffisance r�nale', 'Fonctionnement anormal des reins.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('D�pression', 'Trouble de l�humeur caract�ris� par une tristesse persistante.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Anxi�t� g�n�ralis�e', 'Trouble psychique avec inqui�tude excessive.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Otite', 'Inflammation de l�oreille moyenne.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Infection urinaire', 'Infection bact�rienne des voies urinaires.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Dermatite', 'Inflammation de la peau.');");
        db.execSQL("INSERT INTO Maladies (nom, description) VALUES ('Insomnie', 'Trouble du sommeil chronique.');");

        // Cr�ation de la table Traitement
        db.execSQL("CREATE TABLE traitement (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "maladie_id INTEGER, " +
                "description TEXT, " +
                "FOREIGN KEY(maladie_id) REFERENCES Maladies(id));");

        //Insertion des traitements
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (1, 'Parac�tamol');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (1, 'Repos');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (1, 'Hydratation');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (2, 'Antiviraux');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (2, 'Oxyg�noth�rapie');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (2, 'Repos');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (3, 'Art�misinine');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (3, 'Chloroquine');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (3, 'Repos');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (4, 'Isoniazide');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (4, 'Rifampicine');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (4, 'Ethambutol');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (5, 'Antibiotiques');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (5, 'Antiviraux');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (5, 'Repos');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (6, 'Bronchodilatateurs');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (6, 'Corticost�ro�des');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (6, 'Oxyg�ne');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (7, 'Inhalateurs');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (7, 'Corticost�ro�des');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (7, 'Bronchodilatateurs');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (8, 'Ibuprof�ne');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (8, 'Sumatriptan');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (8, 'Repos');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (9, 'Antibiotiques');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (9, 'Spray nasal');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (9, 'Analg�siques');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (10, 'Metformine');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (10, 'R�gime alimentaire');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (10, 'Exercice');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (11, 'B�tabloquants');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (11, 'Diur�tiques');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (11, 'IECA');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (12, 'Inhibiteurs de pompe � protons');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (12, 'Antiacides');");
        db.execSQL("INSERT INTO traitement(maladie_id, description) VALUES (12, 'R�gime alimentaire');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (13, 'Interf�ron');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (13, 'Antiviraux');");
        db.execSQL("INSERT INTO traitement(maladie_id, description) VALUES (13, 'Repos');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (14, 'Dialyse');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (14, 'R�gime pauvre en sel');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (14, 'Traitement de la cause');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (15, 'Antid�presseurs');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (15, 'Psychoth�rapie');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (15, 'Activit� physique');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (16, 'Anxiolytiques');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (16, 'TCC');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (16, 'Relaxation');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (17, 'Antibiotiques');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (17, 'Antalgiques');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (17, 'Gouttes auriculaires');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (18, 'Antibiotiques');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (18, 'Hydratation');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (18, 'Antalgiques');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (19, 'Cr�mes corticost�ro�des');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (19, 'Antihistaminiques');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (19, 'Hydratation');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (20, 'M�latonine');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (20, 'Th�rapie cognitive');");
        db.execSQL("INSERT INTO traitement (maladie_id, description) VALUES (20, 'Hygi�ne du sommeil');");


        // Cr�ation de la table Liaison entre Sympt�mes et Maladies
        db.execSQL("CREATE TABLE SymptomesMaladies (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "id_symptome INTEGER, " +
                "id_maladie INTEGER, " +
                "FOREIGN KEY(id_symptome) REFERENCES Symptomes(id), " +
                "FOREIGN KEY(id_maladie) REFERENCES Maladies(id));");

        // Insertion de liaisons
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (1, 1);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (2, 1);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (3, 1);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (2, 2);");
        //ici
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (55, 1);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (99, 1);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (1, 1);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (90, 1);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (23, 1);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (36, 1);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (64, 2);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (22, 2);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (87, 2);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (85, 2);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (44, 2);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (95, 2);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (55, 3);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (91, 3);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (45, 3);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (82, 3);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (78, 4);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (51, 4);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (17, 4);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (74, 4);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (47, 4);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (60, 4);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (99, 5);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (34, 5);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (70, 5);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (93, 5);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (92, 5);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (69, 5);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (79, 6);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (65, 6);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (47, 6);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (88, 6);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (99, 6);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (16, 7);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (66, 7);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (32, 7);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (47, 7);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (15, 8);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (52, 8);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (99, 8);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (56, 8);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (91, 8);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (98, 9);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (17, 9);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (52, 9);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (22, 9);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (94, 9);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (28, 9);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (82, 10);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (18, 10);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (11, 10);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (28, 10);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (37, 10);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (78, 10);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (84, 11);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (34, 11);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (61, 11);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (48, 11);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (90, 11);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (30, 11);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (1, 12);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (45, 12);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (39, 12);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (42, 12);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (80, 13);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (73, 13);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (9, 13);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (66, 13);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (79, 13);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (8, 13);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (51, 14);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (89, 14);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (96, 14);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (81, 14);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (18, 14);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (70, 14);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (78, 15);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (4, 15);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (100, 15);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (12, 15);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (67, 15);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (63, 16);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (76, 16);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (9,  16);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (65, 17);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (52, 17);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (69, 17);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (93, 17);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (45, 17);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (66, 17);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (56, 18);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (95, 18);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (90, 18);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (59, 19);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (78, 19);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (17, 19);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (2, 19);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (90, 20);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (16, 20);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (9, 20);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (42, 20);");
        db.execSQL("INSERT INTO SymptomesMaladies (id_symptome, id_maladie) VALUES (96, 20);");

        //Cr�ation de la table consultation
        db.execSQL("CREATE TABLE consultation (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "patient_id INTEGER," +
                "date TEXT," +
                "remarques TEXT," +
                "frais_consultation REAL," +
                "FOREIGN KEY(patient_id)REFERENCES patient(id)");

        //Cr�ation de la table patient
        db.execSQL("CREATE TABLE patient (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nom TEXT," +
                "age INTEGER," +
                "sexe TEXT," +
                "antecedents TEXT," +
                "symptomes TEXT");

        //Cr�ation de la table ant�c�dent
        db.execSQL("CREATE TABLE antecedent (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "description TEXT");

        //Cr�ation de la table ant�c�dent patient
        db.execSQL("CREATE TABLE antecedent_symptome (" +
                "antecedent_id INTEGER," +
                "symptome_id INTEGER," +
                "FOREIGN KEY (antecedent_id) REFERENCES antecedent(id)," +
                "FOREIGN KEY (symptome_id) REFERENCES symptome(id)");

        //Cr�ation de la table m�dicament
        db.execSQL("CREATE TABLE medicaments (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "traitement_id INTEGER," +
                "nom TEXT," +
                "posologie TEXT," +
                "duree_jours INTEGER," +
                "FOREIGN KEY (traitement_id) REFERENCES traitement(id)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS traitement");
        db.execSQL("DROP TABLE IF EXISTS Maladies");
        db.execSQL("DROP TABLE IF EXISTS Symptomes");
        onCreate(db);
    }


    public List<String> getAllSymptomes() {
        List<String> symptomes = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        try {
            Cursor cursor = db.query("Symptomes", new String[]{"nom"}, null, null, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                do {
                    symptomes.add(cursor.getString(cursor.getColumnIndex("nom")));
                } while (cursor.moveToNext());
            }
        } catch (Exception e) {
            e.printStackTrace();  // Log the error
        }
        return symptomes;
    }


    public String getMaladieFromSymptomes(List<String> symptomesCoches) {
        StringBuilder ids = new StringBuilder();
        SQLiteDatabase db = this.getReadableDatabase();
        for (String s : symptomesCoches) {
            Cursor c = db.rawQuery("SELECT id FROM Symptomes WHERE nom = ?", new String[]{s});
            if (c.moveToFirst()) {
                ids.append(c.getInt(0)).append(",");
            }
            c.close();
        }
        if (ids.length() > 0) ids.setLength(ids.length() - 1);

        Cursor maladieCursor = db.rawQuery(
                "SELECT m.nom FROM Maladies m WHERE m.id IN (" +
                        "SELECT ms.id_maladie FROM maladie_symptomes ms WHERE ms.id_symptome IN (" + ids + ")" +
                        " GROUP BY ms.id_maladie HAVING COUNT(ms.id_symptome) = ?)", new String[]{String.valueOf(symptomesCoches.size())});

        if (maladieCursor.moveToFirst()) {
            String maladie = maladieCursor.getString(0);
            maladieCursor.close();
            return maladie;
        }
        return "Aucune correspondance";
    }

    public List<String> getMedicamentsForMaladie(String maladie) {
        List<String> meds = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT id FROM Maladies WHERE nom = ?", new String[]{maladie});
        if (cursor.moveToFirst()) {
            int idMaladie = cursor.getInt(0);
            cursor.close();
            Cursor medsCursor = db.rawQuery("SELECT nom, posologie, duree FROM medicaments WHERE id_maladie = ?", new String[]{String.valueOf(idMaladie)});
            while (medsCursor.moveToNext()) {
                meds.add(medsCursor.getString(0) + " - " + medsCursor.getString(1) + " pendant " + medsCursor.getString(2));
            }
            medsCursor.close();
        }
        return meds;
    }
}
