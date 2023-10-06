-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: web_live
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `band`
--

DROP TABLE IF EXISTS `band`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `band` (
  `P_Key` int NOT NULL AUTO_INCREMENT,
  `Band` varchar(50) DEFAULT NULL,
  `Debut` int DEFAULT NULL,
  `Song` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`P_Key`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `band`
--

LOCK TABLES `band` WRITE;
/*!40000 ALTER TABLE `band` DISABLE KEYS */;
INSERT INTO `band` VALUES (1,'SHISHAMO',2013,'明日も'),(2,'ずっと真夜中でいいのに。',2018,'秒針を噛む'),(3,'ヤバイTシャツ屋さん',2016,'あつまれ! パーティーピーポー'),(4,'キュウソネコカミ',2014,'ビビった'),(5,'ヨルシカ',2019,'ただ君に晴れ'),(8,'ネクライトーキー',2017,'オシャレ大作戦'),(9,'go!go!vanillas',2014,'平成ペイン'),(10,'あいみょん',2016,'マリーゴールド'),(11,'神様、僕は気づいてしまった',2017,'CQCQ'),(12,'神はサイコロを振らない',2020,'夜永唄'),(13,'かりゆし58',2006,'アンマー'),(14,'クリープハイプ',2012,'栞'),(15,'ゲスの極み乙女',2014,'私以外私じゃないの'),(16,'ザ・クロマニヨンズ',2006,'ナンバーワン野郎!'),(17,'サカナクション',2007,'新宝島'),(18,'サザンオールスターズ',1978,'いとしのエリー'),(19,'サンボマスター',2003,'世界はそれを愛と呼ぶんだぜ'),(20,'女王蜂',2011,'火炎'),(21,'神聖かまってちゃん',2010,'ロボットノ夜'),(22,'スキマスイッチ',2003,'全力少年'),(23,'スピッツ',1991,'チェリー'),(24,'東京スカパラダイスオーケストラ',1990,'Paradise Has No Border'),(25,'ハンブレッダーズ',2020,'ファイナルボーイフレンド'),(26,'The ピーズ',1989,'バカになったのに'),(27,'羊文学',2020,'光るとき'),(28,'フジファブリック',2004,'若者のすべて'),(29,'フレデリック',2014,'オドループ'),(30,'ポルカドットスティングレイ',2017,'テレキャスター・ストライプ'),(31,'ポルノグラフィティ',1999,'アゲハ蝶'),(32,'マカロニえんぴつ',2020,'恋人ごっこ'),(33,'マキシマム ザ ホルモン',2002,'恋のメガラバ'),(34,'緑黄色社会',2017,'Mela!'),(35,'amazarashi',2010,'空に歌えば'),(36,'ASIAN KUNG-FU GENERATION',2003,'リライト'),(37,'Awesome City Club',2015,'勿忘'),(38,'back number',2011,'クリスマスソング'),(39,'BLUE ENCOUNT',2014,'もっと光を'),(40,'BUMP OF CHICKEN',2000,'天体観測'),(41,'Creepy Nuts',2017,'よふかしのうた'),(42,'Hump Back',2018,'拝啓、少年よ');
/*!40000 ALTER TABLE `band` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `live`
--

DROP TABLE IF EXISTS `live`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `live` (
  `Name` varchar(50) DEFAULT NULL,
  `Band` varchar(30) DEFAULT NULL,
  `Place` varchar(30) DEFAULT NULL,
  `Date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `live`
--

LOCK TABLES `live` WRITE;
/*!40000 ALTER TABLE `live` DISABLE KEYS */;
INSERT INTO `live` VALUES ('SHISHAMO NO YAON!!! 2023 EAST','SHISHAMO','日比谷野外音楽堂','2023-07-08'),('カネコアヤノ Hall Tour 2023 \"タオルケットは穏やかな\"','カネコアヤノ','NHKホール','2023-06-22'),('カネコアヤノ Hall Tour 2023 \"タオルケットは穏やかな\"','カネコアヤノ','日本特殊陶業市民会館 フォレストホール','2023-06-27'),('カネコアヤノ Hall Tour 2023 \"タオルケットは穏やかな\"','カネコアヤノ','大阪 フェスティバルホール','2023-06-28'),('カネコアヤノ Hall Tour 2023 \"タオルケットは穏やかな\"','カネコアヤノ','ミュージックタウン音市場','2023-07-08'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','相模女子大学グリーンホール','2023-06-24'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','LINE CUBE SHIBUYA','2023-06-25'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','松山市民会館大ホール','2023-07-01'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','高知県立県民文化ホール','2023-07-02'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','ホクト文化ホール','2023-07-08'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','新潟県民会館','2023-07-09'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','ロームシアター京都','2023-07-15'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','ひこね市文化プラザ','2023-07-16'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','北陸電力会館','2023-07-17'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','周南市文化会館','2023-07-22'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','神戸国際会館','2023-07-23'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','松戸・森のホール２１','2023-07-29'),('Greeeen LIVE TOUR 2023 \"The GAME\"','Greeeen','Zepp Osaka Bayside','2023-07-30'),('DISH//HALL TOUR 2023 \"TRIANGLE\"','DISH//','広島文化学園HBGホール','2023-06-24'),('DISH//HALL TOUR 2023 \"TRIANGLE\"','DISH//','神戸国際会館','2023-06-25'),('DISH//HALL TOUR 2023 \"TRIANGLE\"','DISH//','東京ガーデンシアター','2023-06-29');
/*!40000 ALTER TABLE `live` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `P_Key` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Part` varchar(50) DEFAULT NULL,
  `Band` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`P_Key`)
) ENGINE=InnoDB AUTO_INCREMENT=140 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'宮崎朝子','Gt, Vo','SHISHAMO'),(2,'松岡彩','Ba','SHISHAMO'),(3,'吉川美冴貴','Dr','SHISHAMO'),(4,'柳田周作','Gt, Vo','神はサイコロを振らない'),(5,'吉田喜一','Gt','神はサイコロを振らない'),(6,'桐木岳貢','Ba, Key','神はサイコロを振らない'),(7,'黒川亮介','Dr','神はサイコロを振らない'),(8,'前川真吾','Vo, Ba, Gt','かりゆし58'),(9,'新屋行裕','Gt','かりゆし58'),(10,'中村洋貴','Dr, Perc','かりゆし58'),(11,'宮平直樹','Gt, Ba','かりゆし58'),(12,'ヤマサキセイヤ','Vo, Gt','キュウソネコカミ'),(13,'オカザワカズマ','Gt','キュウソネコカミ'),(14,'カワクボタクロウ','Ba','キュウソネコカミ'),(15,'ヨコタシンノスケ','Key, Vo','キュウソネコカミ'),(16,'ソゴウタイスケ','Dr','キュウソネコカミ'),(17,'尾崎世界観','Vo, Gt','クリープハイプ'),(18,'小川幸慈','Gt','クリープハイプ'),(19,'長谷川カオナシ','Ba, Cho','クリープハイプ'),(20,'小泉拓','Dr','クリープハイプ'),(21,'川谷絵音','Vo, Gt, Key','ゲスの極み乙女'),(22,'休日課長','Ba','ゲスの極み乙女'),(23,'ちゃんMARI','Key, Vo','ゲスの極み乙女'),(24,'ほな・いこか','Dr','ゲスの極み乙女'),(25,'甲本ヒロト','Vo, ブルースハープ','ザ・クロマニヨンズ'),(26,'真島昌利','Gt, Cho','ザ・クロマニヨンズ'),(27,'小林勝','Ba, Cho','ザ・クロマニヨンズ'),(28,'桐田勝治','Dr, Cho','ザ・クロマニヨンズ'),(29,'山口一郎','Vo, Gt','サカナクション'),(30,'岩寺基晴','Gt, Cho','サカナクション'),(31,'草刈愛美','Ba, Cho','サカナクション'),(32,'岡崎英美','Key, Cho','サカナクション'),(33,'江島啓一','Dr','サカナクション'),(34,'桑田佳祐','Vo, Gt','サザンオールスターズ'),(35,'関口和之','Ba','サザンオールスターズ'),(36,'松田弘','Dr','サザンオールスターズ'),(37,'原由子','Key, Vo','サザンオールスターズ'),(38,'野沢秀幸','Perc','サザンオールスターズ'),(39,'山口隆','Vo, Gt','サンボマスター'),(40,'近藤洋一','Ba, Cho','サンボマスター'),(41,'木内泰史','Dr','サンボマスター'),(42,'薔薇園アヴ','Vo, Gt','女王蜂'),(43,'赤鳥居ヤシ','Ba','女王蜂'),(44,'虹ヶ峰ルリ','Dr','女王蜂'),(45,'ひばりくん','Gt','女王蜂'),(46,'の子','Vo, Gt, ヴォコーダー','神聖かまってちゃん'),(47,'mono','key, ヴォコーダー','神聖かまってちゃん'),(48,'みきこ','Dr','神聖かまってちゃん'),(49,'大橋卓弥','Vo, Gt, ハーモニカ','スキマスイッチ'),(50,'常田真太郎','Pf, Cho, Org, etc','スキマスイッチ'),(51,'ACAね','Vo, Gt, 扇風琴','ずっと真夜中でいいのに。'),(52,'草野マサムネ','Vo, Gt','スピッツ'),(53,'三輪テツヤ','Gt','スピッツ'),(54,'田村明浩','Ba','スピッツ'),(55,'崎山龍尾','Dr','スピッツ'),(56,'NARGO','Tp','東京スカパラダイスオーケストラ'),(57,'北原雅彦','Tb','東京スカパラダイスオーケストラ'),(58,'GAMO','T-sax','東京スカパラダイスオーケストラ'),(59,'谷中敦','B. Sax','東京スカパラダイスオーケストラ'),(60,'沖祐市','Key','東京スカパラダイスオーケストラ'),(61,'川上つよし','Ba','東京スカパラダイスオーケストラ'),(62,'加藤隆志','Gt','東京スカパラダイスオーケストラ'),(63,'大森はじめ','Perc','東京スカパラダイスオーケストラ'),(64,'茂木欣一','Dr, Vo','東京スカパラダイスオーケストラ'),(65,'もっさ','Vo, Gt','ネクライトーキー'),(66,'朝日','Gt','ネクライトーキー'),(67,'藤田','Ba','ネクライトーキー'),(68,'カズマ・タケイ','Dr','ネクライトーキー'),(69,'中村郁香','Key','ネクライトーキー'),(70,'ムツムロアキラ','Vo, Gt','ハンブレッダーズ'),(71,'でらし','Ba, Cho','ハンブレッダーズ'),(72,'木島','Dr','ハンブレッダーズ'),(73,'ukicaster','Gt','ハンブレッダーズ'),(74,'大木温之','Vo, Gt, Ba','The ピーズ'),(75,'安孫子義一','Gt','The ピーズ'),(76,'岡田光史','Ba','The ピーズ'),(77,'茂木左','Dr','The ピーズ'),(78,'塩塚モエカ','Vo, Gt','羊文学'),(79,'河西ゆりか','Ba, Cho','羊文学'),(80,'フクダヒロア','Dr, Cho','羊文学'),(81,'山内総一郎','Gt, Vo','フジファブリック'),(82,'金澤ダイスケ','Key','フジファブリック'),(83,'加藤慎一','Ba','フジファブリック'),(84,'三原健司','Vo, Gt','フレデリック'),(85,'三原康司','Ba, Cho','フレデリック'),(86,'赤頭隆児','Gt','フレデリック'),(87,'高橋武','Dr','フレデリック'),(88,'雫','Vo, Gt','ポルカドットスティングレイ'),(89,'エマジハルシ','Gt','ポルカドットスティングレイ'),(90,'ウエムラユウキ','Ba','ポルカドットスティングレイ'),(91,'ミツヤマカズマ','Dr','ポルカドットスティングレイ'),(92,'岡野昭仁','Vo','ポルノグラフィティ'),(93,'新藤晴一','Gt, Cho','ポルノグラフィティ'),(94,'はっとり','Gt, Vo','マカロニえんぴつ'),(95,'高野賢也','Ba','マカロニえんぴつ'),(96,'田辺由明','Gt','マカロニえんぴつ'),(97,'長谷川大喜','Key','マカロニえんぴつ'),(98,'マキシマムザ亮君','歌と6弦と弟','マキシマム ザ ホルモン'),(99,'ダイスケはん','キャーキャーうるさい方','マキシマム ザ ホルモン'),(100,'上ちゃん','4弦','マキシマム ザ ホルモン'),(101,'ナヲ','ドラムと女声と姉','マキシマム ザ ホルモン'),(102,'こやまたくや','Vo, Gt','ヤバイＴシャツ屋さん'),(103,'しばたありぼぼ','Vo, Ba','ヤバイＴシャツ屋さん'),(104,'もりもりもと','Dr, Cho','ヤバイＴシャツ屋さん'),(105,'n-buna','Gt, Vo','ヨルシカ'),(106,'suis','Vo, Cho','ヨルシカ'),(107,'長屋晴子','Vo, Gt','緑黄色社会'),(108,'小林壱誓','Gt','緑黄色社会'),(109,'peppe','Key','緑黄色社会'),(110,'穴見真吾','Ba','緑黄色社会'),(111,'秋田ひろむ','Vo, Gt','amazarashi'),(112,'豊川真奈美','Key','amazarashi'),(113,'後藤正文','Vo, Gt','ASIAN KUNG-FU GENERATION'),(114,'喜多建介','Gt, Vo','ASIAN KUNG-FU GENERATION'),(115,'山田貴洋','Ba, Vo','ASIAN KUNG-FU GENERATION'),(116,'伊地知潔','Dr','ASIAN KUNG-FU GENERATION'),(117,'atagi','Vo, Gt','Awesome City Club'),(118,'PORIN','Vo, Syn','Awesome City Club'),(119,'モリシー','Gt, Syn, Vo','Awesome City Club'),(120,'清水依与吏','Gt, Vo','back number'),(121,'小島和也','Ba, Cho','back number'),(122,'栗原寿','Dr','back number'),(123,'田邊駿一','Vo, Gt','BLUE ENCOUNT'),(124,'江口雄也','Gt','BLUE ENCOUNT'),(125,'辻村勇太','Ba','BLUE ENCOUNT'),(126,'高村佳秀','Dr','BLUE ENCOUNT'),(127,'藤原基央','Vo, Gt','BUMP OF CHICKEN'),(128,'増川孔明','Gt','BUMP OF CHICKEN'),(129,'直井由文','Ba','BUMP OF CHICKEN'),(130,'升秀夫','Dr','BUMP OF CHICKEN'),(131,'R-指定','MC','Creepy Nuts'),(132,'DJ 松永','DJ','Creepy Nuts'),(133,'牧達弥','Vo, Gt','go!go!vanillas'),(134,'長谷川プリティ敬祐','Ba','go!go!vanillas'),(135,'柳沢進太郎','Gt, Vo','go!go!vanillas'),(136,'ジェットセイヤ','Dr','go!go!vanillas'),(137,'林萌々子','Vo, Gt','Hump Back'),(138,'ぴか','Ba, Cho','Hump Back'),(139,'美咲','Dr, Cho','Hump Back');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `place`
--

DROP TABLE IF EXISTS `place`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `place` (
  `Name` varchar(50) DEFAULT NULL,
  `Area` varchar(3) DEFAULT NULL,
  `Capa` int DEFAULT NULL,
  `Stat` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `place`
--

LOCK TABLES `place` WRITE;
/*!40000 ALTER TABLE `place` DISABLE KEYS */;
INSERT INTO `place` VALUES ('KT Zepp Yokohama','神奈川',2146,'横浜駅'),('ぴあアリーナMM','神奈川',12000,'みなとみらい駅'),('NHKホール','東京',3800,'原宿駅'),('大阪 フェスティバルホール','大阪',2700,'渡辺橋駅'),('ミュージックタウン音市場','沖縄',1100,'なし'),('LINE CUBE SHIBUYA','東京',2084,'渋谷駅'),('松山市民会館大ホール','愛媛',1825,'松山駅'),('高知県立県民文化ホール','高知',1507,'高知城前駅'),('ホクト文化ホール','長野',1971,'長野駅'),('新潟県民会館','新潟',1730,'白山駅'),('ロームシアター京都','京都',2000,'東山駅'),('ひこね市文化プラザ','滋賀',1480,'彦根駅'),('北陸電力会館','石川',1707,'野町駅'),('周南市文化会館','山口',1800,'徳山駅'),('神戸国際会館','兵庫',2112,'三宮・花時計前駅'),('松戸・森のホール','千葉',1955,'八柱駅'),('Zepp Osaka Bayside','大阪',2801,'桜島駅'),('Zepp Divercity Tokyo','東京',2473,'東京テレポート'),('Zepp Haneda Tokyo','東京',2925,'天空橋駅'),('Zepp Nagoya','愛知',1864,'ささしまライブ駅'),('Zepp Namba Osaka','大阪',2513,'恵美須町駅'),('Zepp Sapporo','北海道',2009,'中島公園駅'),('Zepp Fukuoka','福岡',1526,'唐人町駅'),('サンパレスホール','福岡',2316,'呉服町駅'),('本多の森ホール','石川',1707,'金沢駅'),('広島文化学園HBGホール','広島',2001,'広島駅'),('東京ガーデンシアター','東京',8000,'有明駅');
/*!40000 ALTER TABLE `place` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `review` (
  `Name` varchar(20) DEFAULT NULL,
  `Band` varchar(20) DEFAULT NULL,
  `Song` varchar(20) DEFAULT NULL,
  `Text` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES ('無名','SHISHAMO','量産型彼氏','元気がもらえます。'),('無名','SHISHAMO','OH!','元気がもらえます。'),('しょたろ','フレデリック','KITAKU　BEATS','音源よりもYoutubeのライブバージョン聴いてください\r\n'),('カノン','マンウィズ','七つの大罪のオープニングの奴','聴いてね(⋈◍＞◡＜◍)。✧♡'),('wool','ネクライトーキー','許せ! 服部','服部いつもごめん');
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-06  1:21:55
