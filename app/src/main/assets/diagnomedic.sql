-- Table: symptome
CREATE TABLE symptome (id INTEGER PRIMARY KEY, description TEXT);
-- Table: maladie
CREATE TABLE maladie (id INTEGER PRIMARY KEY, nom TEXT, description TEXT);
-- Table: traitement
CREATE TABLE traitement (id INTEGER PRIMARY KEY AUTOINCREMENT, maladie_id INTEGER, description TEXT, FOREIGN KEY(maladie_id) REFERENCES maladie(id));
-- Table: maladie_symptome
CREATE TABLE maladie_symptome (maladie_id INTEGER, symptome_id INTEGER, FOREIGN KEY(maladie_id) REFERENCES maladie(id), FOREIGN KEY(symptome_id) REFERENCES symptome(id));

-- Insertion des symptômes
INSERT INTO symptome (id, description) VALUES (1, 'Fièvre');
INSERT INTO symptome (id, description) VALUES (2, 'Toux');
INSERT INTO symptome (id, description) VALUES (3, 'Maux de tête');
INSERT INTO symptome (id, description) VALUES (4, 'Fatigue');
INSERT INTO symptome (id, description) VALUES (5, 'Douleurs musculaires');
INSERT INTO symptome (id, description) VALUES (6, 'Frissons');
INSERT INTO symptome (id, description) VALUES (7, 'Essoufflement');
INSERT INTO symptome (id, description) VALUES (8, 'Douleur thoracique');
INSERT INTO symptome (id, description) VALUES (9, 'Nausées');
INSERT INTO symptome (id, description) VALUES (10, 'Vomissements');
INSERT INTO symptome (id, description) VALUES (11, 'Diarrhée');
INSERT INTO symptome (id, description) VALUES (12, 'Perte d''appétit');
INSERT INTO symptome (id, description) VALUES (13, 'Perte de poids');
INSERT INTO symptome (id, description) VALUES (14, 'Sueurs nocturnes');
INSERT INTO symptome (id, description) VALUES (15, 'Éruption cutanée');
INSERT INTO symptome (id, description) VALUES (16, 'Taches rouges');
INSERT INTO symptome (id, description) VALUES (17, 'Gonflement des ganglions');
INSERT INTO symptome (id, description) VALUES (18, 'Maux de gorge');
INSERT INTO symptome (id, description) VALUES (19, 'Nez bouché');
INSERT INTO symptome (id, description) VALUES (20, 'Éternuements');
INSERT INTO symptome (id, description) VALUES (21, 'Douleur abdominale');
INSERT INTO symptome (id, description) VALUES (22, 'Ballonnements');
INSERT INTO symptome (id, description) VALUES (23, 'Constipation');
INSERT INTO symptome (id, description) VALUES (24, 'Brûlures d''estomac');
INSERT INTO symptome (id, description) VALUES (25, 'Saignement de nez');
INSERT INTO symptome (id, description) VALUES (26, 'Vertiges');
INSERT INTO symptome (id, description) VALUES (27, 'Perte de l’équilibre');
INSERT INTO symptome (id, description) VALUES (28, 'Vision floue');
INSERT INTO symptome (id, description) VALUES (29, 'Acouphènes');
INSERT INTO symptome (id, description) VALUES (30, 'Douleur aux oreilles');
INSERT INTO symptome (id, description) VALUES (31, 'Raideur de la nuque');
INSERT INTO symptome (id, description) VALUES (32, 'Photophobie');
INSERT INTO symptome (id, description) VALUES (33, 'Troubles de la mémoire');
INSERT INTO symptome (id, description) VALUES (34, 'Troubles du sommeil');
INSERT INTO symptome (id, description) VALUES (35, 'Insomnie');
INSERT INTO symptome (id, description) VALUES (36, 'Somnolence excessive');
INSERT INTO symptome (id, description) VALUES (37, 'Tremblements');
INSERT INTO symptome (id, description) VALUES (38, 'Palpitations');
INSERT INTO symptome (id, description) VALUES (39, 'Transpiration excessive');
INSERT INTO symptome (id, description) VALUES (40, 'Frilosité');
INSERT INTO symptome (id, description) VALUES (41, 'Sensation de chaleur');
INSERT INTO symptome (id, description) VALUES (42, 'Peau sèche');
INSERT INTO symptome (id, description) VALUES (43, 'Chute de cheveux');
INSERT INTO symptome (id, description) VALUES (44, 'Ongles cassants');
INSERT INTO symptome (id, description) VALUES (45, 'Irritabilité');
INSERT INTO symptome (id, description) VALUES (46, 'Anxiété');
INSERT INTO symptome (id, description) VALUES (47, 'Dépression');
INSERT INTO symptome (id, description) VALUES (48, 'Hallucinations');
INSERT INTO symptome (id, description) VALUES (49, 'Crises d’épilepsie');
INSERT INTO symptome (id, description) VALUES (50, 'Confusion');
INSERT INTO symptome (id, description) VALUES (51, 'Sensation de brûlure urinaire');
INSERT INTO symptome (id, description) VALUES (52, 'Douleur pendant la miction');
INSERT INTO symptome (id, description) VALUES (53, 'Sang dans les urines');
INSERT INTO symptome (id, description) VALUES (54, 'Envies fréquentes d’uriner');
INSERT INTO symptome (id, description) VALUES (55, 'Incontinence');
INSERT INTO symptome (id, description) VALUES (56, 'Douleur pelvienne');
INSERT INTO symptome (id, description) VALUES (57, 'Règles irrégulières');
INSERT INTO symptome (id, description) VALUES (58, 'Absence de règles');
INSERT INTO symptome (id, description) VALUES (59, 'Saignements vaginaux anormaux');
INSERT INTO symptome (id, description) VALUES (60, 'Douleur testiculaire');
INSERT INTO symptome (id, description) VALUES (61, 'Éjaculation douloureuse');
INSERT INTO symptome (id, description) VALUES (62, 'Bourdonnement d’oreilles');
INSERT INTO symptome (id, description) VALUES (63, 'Toux sèche');
INSERT INTO symptome (id, description) VALUES (64, 'Toux grasse');
INSERT INTO symptome (id, description) VALUES (65, 'Douleur articulaire');
INSERT INTO symptome (id, description) VALUES (66, 'Gonflement articulaire');
INSERT INTO symptome (id, description) VALUES (67, 'Raideur articulaire');
INSERT INTO symptome (id, description) VALUES (68, 'Rougeur articulaire');
INSERT INTO symptome (id, description) VALUES (69, 'Fièvre persistante');
INSERT INTO symptome (id, description) VALUES (70, 'Ganglions enflés');
INSERT INTO symptome (id, description) VALUES (71, 'Rougeurs oculaires');
INSERT INTO symptome (id, description) VALUES (72, 'Sécheresse oculaire');
INSERT INTO symptome (id, description) VALUES (73, 'Larmoiement');
INSERT INTO symptome (id, description) VALUES (74, 'Vision double');
INSERT INTO symptome (id, description) VALUES (75, 'Taches noires dans la vision');
INSERT INTO symptome (id, description) VALUES (76, 'Jaunisse');
INSERT INTO symptome (id, description) VALUES (77, 'Coloration foncée des urines');
INSERT INTO symptome (id, description) VALUES (78, 'Urines mousseuses');
INSERT INTO symptome (id, description) VALUES (79, 'Selles claires');
INSERT INTO symptome (id, description) VALUES (80, 'Selles sanglantes');
INSERT INTO symptome (id, description) VALUES (81, 'Selles noires');
INSERT INTO symptome (id, description) VALUES (82, 'Démangeaisons');
INSERT INTO symptome (id, description) VALUES (83, 'Peau jaunâtre');
INSERT INTO symptome (id, description) VALUES (84, 'Langue blanche');
INSERT INTO symptome (id, description) VALUES (85, 'Aphtes');
INSERT INTO symptome (id, description) VALUES (86, 'Mauvaise haleine');
INSERT INTO symptome (id, description) VALUES (87, 'Goût métallique');
INSERT INTO symptome (id, description) VALUES (88, 'Troubles de la parole');
INSERT INTO symptome (id, description) VALUES (89, 'Difficultés à avaler');
INSERT INTO symptome (id, description) VALUES (90, 'Toux avec sang');
INSERT INTO symptome (id, description) VALUES (91, 'Douleur à l’épaule');
INSERT INTO symptome (id, description) VALUES (92, 'Douleur au dos');
INSERT INTO symptome (id, description) VALUES (93, 'Douleur au genou');
INSERT INTO symptome (id, description) VALUES (94, 'Engourdissement');
INSERT INTO symptome (id, description) VALUES (95, 'Fourmillements');
INSERT INTO symptome (id, description) VALUES (96, 'Difficulté à marcher');
INSERT INTO symptome (id, description) VALUES (97, 'Changements d’humeur');
INSERT INTO symptome (id, description) VALUES (98, 'Crises d’angoisse');
INSERT INTO symptome (id, description) VALUES (99, 'Troubles de l’attention');
INSERT INTO symptome (id, description) VALUES (100, 'Troubles du comportement');
INSERT INTO symptome (id, description) VALUES (101, 'Hyperactivité');

-- Insertion des maladies
INSERT INTO maladie (id, nom, description) VALUES (1, 'Grippe', 'Infection virale aiguë des voies respiratoires.');
INSERT INTO maladie (id, nom, description) VALUES (2, 'COVID-19', 'Maladie respiratoire causée par le coronavirus SARS-CoV-2.');
INSERT INTO maladie (id, nom, description) VALUES (3, 'Paludisme', 'Infection parasitaire transmise par les moustiques.');
INSERT INTO maladie (id, nom, description) VALUES (4, 'Tuberculose', 'Infection bactérienne chronique des poumons.');
INSERT INTO maladie (id, nom, description) VALUES (5, 'Pneumonie', 'Infection des poumons causée par des bactéries ou virus.');
INSERT INTO maladie (id, nom, description) VALUES (6, 'Bronchite chronique', 'Inflammation prolongée des bronches.');
INSERT INTO maladie (id, nom, description) VALUES (7, 'Asthme', 'Maladie respiratoire chronique avec crises.');
INSERT INTO maladie (id, nom, description) VALUES (8, 'Migraine', 'Céphalée chronique avec ou sans aura.');
INSERT INTO maladie (id, nom, description) VALUES (9, 'Sinusite', 'Inflammation des sinus nasaux.');
INSERT INTO maladie (id, nom, description) VALUES (10, 'Diabète de type 2', 'Maladie chronique de régulation du sucre dans le sang.');
INSERT INTO maladie (id, nom, description) VALUES (11, 'Hypertension', 'Tension artérielle élevée chronique.');
INSERT INTO maladie (id, nom, description) VALUES (12, 'Gastrite', 'Inflammation de la muqueuse de l’estomac.');
INSERT INTO maladie (id, nom, description) VALUES (13, 'Hépatite B', 'Infection virale du foie.');
INSERT INTO maladie (id, nom, description) VALUES (14, 'Insuffisance rénale', 'Fonctionnement anormal des reins.');
INSERT INTO maladie (id, nom, description) VALUES (15, 'Dépression', 'Trouble de l’humeur caractérisé par une tristesse persistante.');
INSERT INTO maladie (id, nom, description) VALUES (16, 'Anxiété généralisée', 'Trouble psychique avec inquiétude excessive.');
INSERT INTO maladie (id, nom, description) VALUES (17, 'Otite', 'Inflammation de l’oreille moyenne.');
INSERT INTO maladie (id, nom, description) VALUES (18, 'Infection urinaire', 'Infection bactérienne des voies urinaires.');
INSERT INTO maladie (id, nom, description) VALUES (19, 'Dermatite', 'Inflammation de la peau.');
INSERT INTO maladie (id, nom, description) VALUES (20, 'Insomnie', 'Trouble du sommeil chronique.');

-- Insertion des traitements
INSERT INTO traitement (maladie_id, description) VALUES (1, 'Paracétamol');
INSERT INTO traitement (maladie_id, description) VALUES (1, 'Repos');
INSERT INTO traitement (maladie_id, description) VALUES (1, 'Hydratation');
INSERT INTO traitement (maladie_id, description) VALUES (2, 'Antiviraux');
INSERT INTO traitement (maladie_id, description) VALUES (2, 'Oxygénothérapie');
INSERT INTO traitement (maladie_id, description) VALUES (2, 'Repos');
INSERT INTO traitement (maladie_id, description) VALUES (3, 'Artémisinine');
INSERT INTO traitement (maladie_id, description) VALUES (3, 'Chloroquine');
INSERT INTO traitement (maladie_id, description) VALUES (3, 'Repos');
INSERT INTO traitement (maladie_id, description) VALUES (4, 'Isoniazide');
INSERT INTO traitement (maladie_id, description) VALUES (4, 'Rifampicine');
INSERT INTO traitement (maladie_id, description) VALUES (4, 'Ethambutol');
INSERT INTO traitement (maladie_id, description) VALUES (5, 'Antibiotiques');
INSERT INTO traitement (maladie_id, description) VALUES (5, 'Antiviraux');
INSERT INTO traitement (maladie_id, description) VALUES (5, 'Repos');
INSERT INTO traitement (maladie_id, description) VALUES (6, 'Bronchodilatateurs');
INSERT INTO traitement (maladie_id, description) VALUES (6, 'Corticostéroïdes');
INSERT INTO traitement (maladie_id, description) VALUES (6, 'Oxygène');
INSERT INTO traitement (maladie_id, description) VALUES (7, 'Inhalateurs');
INSERT INTO traitement (maladie_id, description) VALUES (7, 'Corticostéroïdes');
INSERT INTO traitement (maladie_id, description) VALUES (7, 'Bronchodilatateurs');
INSERT INTO traitement (maladie_id, description) VALUES (8, 'Ibuprofène');
INSERT INTO traitement (maladie_id, description) VALUES (8, 'Sumatriptan');
INSERT INTO traitement (maladie_id, description) VALUES (8, 'Repos');
INSERT INTO traitement (maladie_id, description) VALUES (9, 'Antibiotiques');
INSERT INTO traitement (maladie_id, description) VALUES (9, 'Spray nasal');
INSERT INTO traitement (maladie_id, description) VALUES (9, 'Analgésiques');
INSERT INTO traitement (maladie_id, description) VALUES (10, 'Metformine');
INSERT INTO traitement (maladie_id, description) VALUES (10, 'Régime alimentaire');
INSERT INTO traitement (maladie_id, description) VALUES (10, 'Exercice');
INSERT INTO traitement (maladie_id, description) VALUES (11, 'Bêtabloquants');
INSERT INTO traitement (maladie_id, description) VALUES (11, 'Diurétiques');
INSERT INTO traitement (maladie_id, description) VALUES (11, 'IECA');
INSERT INTO traitement (maladie_id, description) VALUES (12, 'Inhibiteurs de pompe à protons');
INSERT INTO traitement (maladie_id, description) VALUES (12, 'Antiacides');
INSERT INTO traitement (maladie_id, description) VALUES (12, 'Régime alimentaire');
INSERT INTO traitement (maladie_id, description) VALUES (13, 'Interféron');
INSERT INTO traitement (maladie_id, description) VALUES (13, 'Antiviraux');
INSERT INTO traitement (maladie_id, description) VALUES (13, 'Repos');
INSERT INTO traitement (maladie_id, description) VALUES (14, 'Dialyse');
INSERT INTO traitement (maladie_id, description) VALUES (14, 'Régime pauvre en sel');
INSERT INTO traitement (maladie_id, description) VALUES (14, 'Traitement de la cause');
INSERT INTO traitement (maladie_id, description) VALUES (15, 'Antidépresseurs');
INSERT INTO traitement (maladie_id, description) VALUES (15, 'Psychothérapie');
INSERT INTO traitement (maladie_id, description) VALUES (15, 'Activité physique');
INSERT INTO traitement (maladie_id, description) VALUES (16, 'Anxiolytiques');
INSERT INTO traitement (maladie_id, description) VALUES (16, 'TCC');
INSERT INTO traitement (maladie_id, description) VALUES (16, 'Relaxation');
INSERT INTO traitement (maladie_id, description) VALUES (17, 'Antibiotiques');
INSERT INTO traitement (maladie_id, description) VALUES (17, 'Antalgiques');
INSERT INTO traitement (maladie_id, description) VALUES (17, 'Gouttes auriculaires');
INSERT INTO traitement (maladie_id, description) VALUES (18, 'Antibiotiques');
INSERT INTO traitement (maladie_id, description) VALUES (18, 'Hydratation');
INSERT INTO traitement (maladie_id, description) VALUES (18, 'Antalgiques');
INSERT INTO traitement (maladie_id, description) VALUES (19, 'Crèmes corticostéroïdes');
INSERT INTO traitement (maladie_id, description) VALUES (19, 'Antihistaminiques');
INSERT INTO traitement (maladie_id, description) VALUES (19, 'Hydratation');
INSERT INTO traitement (maladie_id, description) VALUES (20, 'Mélatonine');
INSERT INTO traitement (maladie_id, description) VALUES (20, 'Thérapie cognitive');
INSERT INTO traitement (maladie_id, description) VALUES (20, 'Hygiène du sommeil');

-- Insertion des relations maladie-symptome
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (1, 55);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (1, 99);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (1, 1);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (1, 90);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (1, 23);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (1, 36);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (2, 64);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (2, 22);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (2, 87);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (2, 85);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (2, 44);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (2, 95);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (3, 55);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (3, 91);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (3, 45);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (3, 82);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (4, 78);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (4, 51);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (4, 17);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (4, 74);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (4, 47);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (4, 60);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (5, 99);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (5, 34);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (5, 70);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (5, 93);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (5, 92);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (5, 69);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (6, 79);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (6, 65);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (6, 47);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (6, 88);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (6, 99);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (7, 16);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (7, 66);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (7, 32);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (7, 47);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (8, 15);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (8, 52);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (8, 99);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (8, 56);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (8, 91);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (9, 98);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (9, 17);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (9, 52);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (9, 22);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (9, 94);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (9, 28);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (10, 82);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (10, 18);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (10, 11);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (10, 28);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (10, 37);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (10, 78);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (11, 84);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (11, 34);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (11, 61);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (11, 48);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (11, 90);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (11, 30);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (12, 1);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (12, 45);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (12, 39);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (12, 42);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (13, 80);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (13, 73);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (13, 9);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (13, 66);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (13, 79);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (13, 8);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (14, 51);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (14, 89);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (14, 96);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (14, 81);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (14, 18);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (14, 70);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (15, 78);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (15, 4);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (15, 100);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (15, 12);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (16, 67);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (16, 63);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (16, 76);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (16, 9);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (17, 65);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (17, 52);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (17, 69);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (17, 93);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (17, 45);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (18, 66);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (18, 56);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (18, 95);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (18, 90);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (19, 59);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (19, 78);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (19, 17);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (19, 2);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (20, 90);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (20, 16);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (20, 9);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (20, 42);
INSERT INTO maladie_symptome (maladie_id, symptome_id) VALUES (20, 96);


-- Table: patient
CREATE TABLE patient (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nom TEXT,
    age INTEGER,
    sexe TEXT,
    antecedents TEXT,
    symptomes TEXT
);

-- Table: consultation
CREATE TABLE consultation (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    patient_id INTEGER,
    date TEXT,
    remarques TEXT,
    frais_consultation REAL,
    FOREIGN KEY (patient_id) REFERENCES patient(id)
);

-- Table: antecedent
CREATE TABLE antecedent (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    description TEXT
);

-- Table: antecedent_symptome (relation N:N)
CREATE TABLE antecedent_symptome (
    antecedent_id INTEGER,
    symptome_id INTEGER,
    FOREIGN KEY (antecedent_id) REFERENCES antecedent(id),
    FOREIGN KEY (symptome_id) REFERENCES symptome(id)
);

-- Table: medicament
CREATE TABLE medicament (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    traitement_id INTEGER,
    nom TEXT,
    posologie TEXT,
    duree_jours INTEGER,
    FOREIGN KEY (traitement_id) REFERENCES traitement(id)
);
