CREATE DATABASE  IF NOT EXISTS `gargi` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `gargi`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: gargi
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointment` (
  `aid` int NOT NULL AUTO_INCREMENT,
  `doc_id` int NOT NULL,
  `p_id` int DEFAULT NULL,
  `date` varchar(45) NOT NULL,
  `time` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `notes` varchar(245) DEFAULT NULL,
  PRIMARY KEY (`aid`),
  KEY `doc_id_idx` (`doc_id`),
  KEY `p_id_idx` (`p_id`),
  CONSTRAINT `doc_id` FOREIGN KEY (`doc_id`) REFERENCES `doctor` (`did`),
  CONSTRAINT `p_id` FOREIGN KEY (`p_id`) REFERENCES `patient` (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
INSERT INTO `appointment` VALUES (1,11,1,'07-08-2024','10:30-10:45','pending','Regular Chcekup'),(2,11,2,'07-07-2024','10:30-10:45','done','Regular Chcekup'),(3,7,1,'07-07-2024','10:45-11:00','done','Regular Chcekup'),(4,3,1,'07-07-2024','11:45-12:00','ongoing','Regular Chcekup'),(5,5,1,'9-08-2024','11:15-11:30','Pending','Follow-up appointment to discuss chest pain and shortness of breath management plan.'),(6,7,2,'23-07-2024','10:30-10:45','New','Initial consultation for recent skin rash.'),(7,5,1,'2-08-2024','11:15-11:30','Pending','Follow-up appointment to discuss chest pain and shortness of breath management plan (Mr. Aditya Agarwal).'),(8,2,2,'3-08-2024','10:30-10:45','New','Initial consultation for recent skin rash (Ms. Brinda Shah).'),(9,11,3,'26-08-2024','10:30-10:45','Cancelled','no confirmation'),(10,11,4,'26-08-2024','10:45-11:00','Fully Booked','Dr. Patel\'s appointment (existing patient).'),(11,11,5,'26-08-2024','11:00-11:15','Fully Booked','Pre-scheduled surgery follow-up for stomach flu complications (Ms. Nalini Gupta).'),(12,11,6,'26-08-2024','11:15-11:30','Fully Booked','Dr. Patel\'s appointment (existing patient).'),(13,11,7,'26-08-2024','11:30-11:45','Fully Booked','Dr. Patel\'s appointment (existing patient).'),(14,11,8,'26-08-2024','11:45-12:00','Fully Booked','Dr. Patel\'s appointment (existing patient).'),(15,7,9,'25-07-2024','11:45-12:00','Confirmed','Follow-up appointment to discuss treatment plan for fever and cough (Mr. Chandrashekhar Kapoor).'),(16,8,10,'4-08-2024','11:30-11:45','Cancelled','Appointment cancelled due to patient illness (Ms. Devika Patil).'),(17,10,12,'27-07-2024','10:30-10:45','New','Initial consultation for back pain (Mr. Faisal Khan).'),(18,11,13,'29-08-2024','10:45-11:00','Pending','Follow-up appointment to discuss anxiety treatment (Ms. Gauri Mishra).'),(19,13,14,'28-07-2024','10:30-10:45','New','Annual checkup (Ms. Alice Johnson). - New Doctor (Dr. William Lee).'),(20,16,15,'28-08-2024','10:45-11:00','New','Blood pressure monitoring (Mr. Ben Miller). - New Doctor (Dr. William Lee).'),(21,17,16,'28-08-2024','11:00-11:15','New','Sports injury consultation (Ms. Claire Jones). - New Doctor (Dr. William Lee).'),(22,14,17,'30-08-2024','11:00-11:15','New','Scheduled appointment with Gastroenterologist for follow-up on stomach flu (after initial consultation with Intensivist) (Ms. Nalini Gupta).');
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `did` int NOT NULL AUTO_INCREMENT,
  `docname` varchar(45) NOT NULL,
  `post` varchar(45) NOT NULL,
  `study` varchar(45) NOT NULL,
  `experience` int NOT NULL,
  `typeOf` varchar(45) NOT NULL,
  `speciality1` varchar(45) DEFAULT NULL,
  `speciality2` varchar(45) DEFAULT NULL,
  `speciality3` varchar(45) DEFAULT NULL,
  `speciality4` varchar(45) DEFAULT NULL,
  `image` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,'Gargi','Surgeon, Cardiology','MBBS,fellowship ',9,'Surgeon','surgery','padeology','denstry','checkup','doc1.png'),(2,'Asha Kapadia','Head Of the Department of Medicine','MD(USA) , DABP',10,'Oncology','Hematology','Internal Medicine','Critical Care','Palliative Carey','docash2.png'),(3,'Ashit Hegde','Section Head – General Medicine','MD',2,'Intensivist','General Medicine','Emergency Medicine',' Infectious Disease','Critical Care','women6.jpg'),(4,' B K  Misra','Head of Department of Surgery','MS (Gen. Surg), MCh,Diplomate',20,'Neurosurgeon','Neurosurgery','Brain Tumor Surgery','Spine Surgery','Stereotactic Radiosurgery','11alice.png'),(5,'John Doe','Senior Consultant, Cardiology','MD, FACC',3,'Cardiologist','Cardiology','Electrophysiology','Interventional Cardiology','Echocardiography','11alice.png'),(6,'Jane Smith','Consultant, Pediatrics','MD, FAAP',5,'Pediatrician','Pediatrics','Neonatology','Adolescent Medicine','Developmental Pediatrics','11alice.png'),(7,'Emily Johnson','Dermatology','MD, FAAD',9,'Dermatologist',' Dermatology','Mohs Surgery','Cosmetic Dermatology','Pediatric Dermatology','11alice.png'),(8,'Michael Brown','Orthopedics','MD, FAAOS',13,'Orthopedic Surgeon','Consultant','Sports Medicine','Joint Replacement Surgery','Hand Surgery','11alice.png'),(9,'Sarah Davis',' Neurology','MD, FAAN',16,'Neurologist','Consultant','Neurodegenerative Diseases','Epilepsy','Movement Disorders','11alice.png'),(10,' David Wilson','Gastroenterology','MD, FACG',11,'Gastroenterologist','Consultant','Hepatology','Inflammatory Bowel Disease',' Endoscopy','11alice.png'),(11,'Alice Johnson','Ophthalmology','MD, FACS',15,'Ophthalmologist','Consultant','Cataract Surgery','Glaucoma Management','Retinal Diseases','11alice.png'),(12,'Robert Martin','Rheumatology','MD, FACR',11,'	Rheumatologist','Consultant','Autoimmune Diseases','Osteoporosis','Pain Management','11alice.png'),(13,'Laura Lee','Endocrinology','MD, FACE',16,'Endocrinologist','Consultant','Diabetes Management','Thyroid Disorders','Hormone Replacement Therapy','11alice.png'),(14,'James White','Infectious Disease','MD, FIDSA',18,'Infectious Disease Specialist','Consultant','Infectious Disease','Travel Medicine','Antibiotic Stewardship','11alice.png'),(15,'Nancy King','Psychiatry','MD, FAPA',4,'Psychiatrist','Consultant',' Adult Psychiatry',' Child & Adolescent Psychiatry','Geriatric Psychiatry','11alice.png'),(16,'Chris Adams','Pulmonology','MD, FCCP',8,'	Pulmonologist','Consultant','Asthma Management',' Critical Care Medicine','Sleep Medicine','11alice.png'),(17,'Karen Scott','Allergy and Immunology','MD, FAAAAI',11,'Allergist & Immunologist','Consultant','Asthma','Food Allergy','Allergy','11alice.png'),(18,'Anthony Clark','Nephrology','MD, FASN',7,'Nephrologist','Consultant','Kidney Disease','Dialysis','Hypertension','11alice.png'),(19,'Rachel Walker','Hematology','MD, FACP',5,'Hematologist','Consultant','Blood Disorders','Cancer Treatment','Bone Marrow Transplant','11alice.png');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `p_id` int NOT NULL AUTO_INCREMENT,
  `p_name` varchar(45) NOT NULL,
  `disease` varchar(45) NOT NULL,
  `docid` int NOT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (1,'ria','cancer',0),(2,'sia','malaria',0),(3,'mia','tb',0),(4,'jia','flu',1),(5,'Aditya Agarwal','Chest pain, shortness of breath',5),(6,'Brinda Shah','Skin rash',7),(7,'Chandrashekhar Kapoor','Fever, cough',3),(8,'Devika Patil','Difficulty walking after a fall',8),(9,'Ekta Verma','Diabetes',13),(10,'Faisal Khan','Back pain',4),(11,'Gauri Mishra','Anxiety',15),(12,'Hiten Desai','High Blood Pressure',18),(13,'Ishaan Khanna\n\n','	Stomach ache, vomiting',10),(14,'Jahnvi Mehta','Allergies\n\n',17),(15,'Faisal Khan','Back pain',8),(16,'Chandrashekhar Kapoor','Fever, cough',14),(17,'Leena Sharma','Migraine headaches',11),(18,'Marcus Jones','Chronic knee pain',8),(19,'Marcus Jones','Chronic knee pain',12),(20,'Priya Desai','Anxiety',15),(21,'Nalini Gupta','Stomach flu',3),(22,'Nalini Gupta','Stomach flu',10);
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `research`
--

DROP TABLE IF EXISTS `research`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `research` (
  `rid` int NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `docid` int DEFAULT NULL,
  PRIMARY KEY (`rid`),
  KEY `docid_idx` (`docid`),
  CONSTRAINT `docid` FOREIGN KEY (`docid`) REFERENCES `doctor` (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `research`
--

LOCK TABLES `research` WRITE;
/*!40000 ALTER TABLE `research` DISABLE KEYS */;
INSERT INTO `research` VALUES (2,'lighlo','kljgholk',3),(13,'Innovative Techniques in Cataract Surgery: Advancements and Outcomes','this',11),(14,'Glaucoma Management: Emerging Therapies and Long-Term Patient Outcomes','Manuscript preparation, literature review completed.',11),(15,'Retinal Diseases: Current Trends in Diagnosis and Treatment','Published in a peer-reviewed journal.',11),(16,'Comparative Study of Phacoemulsification and Femtosecond Laser-Assisted Cataract Surgery','Under peer review, revisions required.',11),(17,'The Role of Optical Coherence Tomography in the Early Detection of Retinal Diseases','Final stages of writing, figures and tables being finalized.',11),(18,'Novel Approaches to Glaucoma Treatment: A Focus on Minimally Invasive Surgery',' Initial draft completed, awaiting co-author feedback.\n',11),(19,'The Impact of Age-Related Macular Degeneration on Quality of Life',' Research proposal submitted, awaiting funding approval.',11),(20,'Advances in Retinal Imaging Techniques: From Diagnosis to Treatment Planning',' Data analysis ongoing, preliminary results promising.',11),(21,'Innovative Approaches to Pediatric Cardiac Surgery: Techniques and Outcomes','Ongoing research, patient outcome data being analyzed.',1),(22,'The Role of Minimally Invasive Surgery in Cardiology: A Comparative Study','Manuscript in final review, awaiting co-author approval.',1),(23,'Advancements in Cardiac Surgery for Congenital Heart Defects','Initial draft completed, revisions in progress.\n',1),(24,'Interdisciplinary Approaches to Cardiac Surgery in Pediatric Patients','Research proposal submitted, awaiting ethical committee approval.',1),(25,'The Impact of Early Diagnosis on Surgical Outcomes in Pediatric Cardiology','Data collection phase, patient recruitment ongoing.',1),(26,'Pediatric Cardiology and the Use of Advanced Imaging Techniques in Surgical Planning',' Literature review completed, data analysis in progress.',1),(27,'Exploring the Role of Dental Health in Cardiovascular Surgery Outcomes','Collaborative study with dentistry department, initial findings being documented.',1),(28,'Long-Term Follow-Up of Pediatric Cardiac Surgery Patients: Quality of Life and Health ',' Manuscript preparation, figures and tables being finalized.',1),(29,'The Role of Cardiovascular Surgery in Managing Complex Congenital Heart Diseases',' Published in a peer-reviewed journal.',1),(30,'Challenges and Innovations in Surgical Techniques for Pediatric Cardiology','Drafting stage, introduction and methodology sections completed.',1),(32,'this is it','on',11),(34,'yes','this',11),(43,'the heart surgery','ongoing',11),(45,'the heart','ongoing',11);
/*!40000 ALTER TABLE `research` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-11-30 23:36:17
