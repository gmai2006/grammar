# EMS MySQL Manager 2.6.0.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : openpay


SET FOREIGN_KEY_CHECKS=0;

DROP DATABASE IF EXISTS openpay;

CREATE DATABASE openpay;

USE openpay;

#
# Structure for the `afxfilter` table : 
#

DROP TABLE IF EXISTS afxfilter;

CREATE TABLE afxfilter (
  kodfilter bigint(20) NOT NULL default '0',
  descfilter varchar(50) NOT NULL default '',
  tablename varchar(50) NOT NULL default '',
  UNIQUE KEY afxfilter_x (kodfilter)
) TYPE=InnoDB;

#
# Structure for the `afxfilterd` table : 
#

DROP TABLE IF EXISTS afxfilterd;

CREATE TABLE afxfilterd (
  kodfilterd bigint(20) NOT NULL default '0',
  kodfilter bigint(20) NOT NULL default '0',
  pedio varchar(50) NOT NULL default '',
  telestis varchar(20) NOT NULL default '',
  timi varchar(50) NOT NULL default '',
  joint varchar(10) default NULL,
  PRIMARY KEY  (kodfilterd),
  KEY kodfilter (kodfilter),
  CONSTRAINT 0_15 FOREIGN KEY (kodfilter) REFERENCES afxfilter (kodfilter) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `afxinfo` table : 
#

DROP TABLE IF EXISTS afxinfo;

CREATE TABLE afxinfo (
  dbver varchar(10) default NULL
) TYPE=InnoDB;

#
# Structure for the `afxkeygen` table : 
#

DROP TABLE IF EXISTS afxkeygen;

CREATE TABLE afxkeygen (
  tblname varchar(50) NOT NULL default '',
  lastid bigint(20) default '0',
  PRIMARY KEY  (tblname),
  KEY lastid (lastid)
) TYPE=InnoDB;

#
# Structure for the `afxoperators` table : 
#

DROP TABLE IF EXISTS afxoperators;

CREATE TABLE afxoperators (
  operatorname varchar(50) NOT NULL default '',
  operator varchar(50) NOT NULL default '',
  orderno tinyint(4) default NULL,
  PRIMARY KEY  (operatorname),
  UNIQUE KEY afxoperators_x (operatorname)
) TYPE=InnoDB;

#
# Structure for the `afxptoseis` table : 
#

DROP TABLE IF EXISTS afxptoseis;

CREATE TABLE afxptoseis (
  onom varchar(50) NOT NULL default '',
  gen varchar(50) default NULL,
  ait varchar(50) default NULL,
  PRIMARY KEY  (onom)
) TYPE=InnoDB;

#
# Structure for the `afxtable` table : 
#

DROP TABLE IF EXISTS afxtable;

CREATE TABLE afxtable (
  tablename varchar(50) NOT NULL default '',
  tabledesc varchar(50) NOT NULL default '',
  PRIMARY KEY  (tablename),
  UNIQUE KEY afxtable_x (tablename)
) TYPE=InnoDB;

#
# Structure for the `afxtablefields` table : 
#

DROP TABLE IF EXISTS afxtablefields;

CREATE TABLE afxtablefields (
  tablename varchar(50) NOT NULL default '',
  fieldname varchar(70) NOT NULL default '',
  fielddesc varchar(70) NOT NULL default '',
  sorting tinyint(1) default NULL,
  fieldtype varchar(15) NOT NULL default '',
  orderno bigint(20) default NULL,
  PRIMARY KEY  (tablename,fieldname),
  KEY tablename (tablename),
  CONSTRAINT 0_22 FOREIGN KEY (tablename) REFERENCES afxtable (tablename) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `afxtranslate` table : 
#

DROP TABLE IF EXISTS afxtranslate;

CREATE TABLE afxtranslate (
  id bigint(20) NOT NULL default '0',
  el varchar(255) default NULL,
  uk varchar(255) default NULL,
  PRIMARY KEY  (id)
) TYPE=InnoDB;

#
# Structure for the `misth_zpxrisi` table : 
#

DROP TABLE IF EXISTS misth_zpxrisi;

CREATE TABLE misth_zpxrisi (
  kodxrisi varchar(4) NOT NULL default '',
  descxrisi varchar(50) NOT NULL default '',
  startdate date NOT NULL default '0000-00-00',
  enddate date NOT NULL default '0000-00-00',
  maskposo varchar(50) default '###,##0.00',
  maskposot varchar(50) default '###,##0.00',
  maskdate varchar(50) default 'dd/mm/yyyy',
  eteria varchar(100) default '',
  eteriadesc varchar(100) default '',
  address varchar(100) default '',
  tk varchar(15) default '',
  city varchar(50) default '',
  phone varchar(100) default '',
  fax varchar(100) default '',
  maskdate_e varchar(50) default 'dd/mm/yyyy',
  maskposo_e varchar(50) default '###,##0.00',
  maskposot_e varchar(50) default '###,##0.00',
  afm varchar(20) default '',
  doy varchar(100) default '',
  round int(11) default '2',
  prn_logo1 varchar(100) default NULL,
  prn_logo2 varchar(100) default NULL,
  prn_logo3 varchar(100) default NULL,
  prn_logo4 varchar(100) default NULL,
  prn_logo5 varchar(100) default NULL,
  prn_sign1_prosf varchar(100) default NULL,
  prn_sign1_name varchar(100) default NULL,
  prn_sign2_prosf varchar(100) default NULL,
  prn_sign2_name varchar(100) default NULL,
  prn_sign3_prosf varchar(100) default NULL,
  prn_sign3_name varchar(100) default NULL,
  prn_notes1 longtext,
  prn_notes2 longtext,
  prn_notes3 longtext,
  PRIMARY KEY  (kodxrisi)
) TYPE=InnoDB;

#
# Structure for the `misth_zpperiod` table : 
#

DROP TABLE IF EXISTS misth_zpperiod;

CREATE TABLE misth_zpperiod (
  kodperiod char(2) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  descperiod varchar(50) NOT NULL default '',
  orderno int(11) default NULL,
  PRIMARY KEY  (kodperiod,kodxrisi),
  KEY kodxrisi (kodxrisi),
  CONSTRAINT 0_26 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_zpkat` table : 
#

DROP TABLE IF EXISTS misth_zpkat;

CREATE TABLE misth_zpkat (
  kodkat char(2) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  desckat varchar(50) NOT NULL default '',
  PRIMARY KEY  (kodkat,kodxrisi),
  KEY kodxrisi (kodxrisi),
  CONSTRAINT 0_28 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_final` table : 
#

DROP TABLE IF EXISTS misth_final;

CREATE TABLE misth_final (
  kodfinal bigint(20) NOT NULL default '0',
  kodxrisi varchar(4) NOT NULL default '',
  descfinal varchar(100) NOT NULL default '',
  title longtext,
  datefinal date NOT NULL default '0000-00-00',
  kodkat char(2) default NULL,
  kodperiod char(2) default NULL,
  aa bigint(20) default NULL,
  PRIMARY KEY  (kodfinal,kodxrisi),
  KEY kodxrisi (kodxrisi),
  KEY datefinal (datefinal),
  KEY kodkat (kodkat,kodxrisi),
  KEY kodperiod (kodperiod,kodxrisi),
  CONSTRAINT 0_30 FOREIGN KEY (kodperiod, kodxrisi) REFERENCES misth_zpperiod (kodperiod, kodxrisi) ON UPDATE CASCADE,
  CONSTRAINT 0_31 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT 0_32 FOREIGN KEY (kodkat, kodxrisi) REFERENCES misth_zpkat (kodkat, kodxrisi) ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_zptmima` table : 
#

DROP TABLE IF EXISTS misth_zptmima;

CREATE TABLE misth_zptmima (
  kodtmima char(2) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  desctmima varchar(50) NOT NULL default '',
  PRIMARY KEY  (kodtmima,kodxrisi),
  KEY kodxrisi (kodxrisi),
  CONSTRAINT 0_34 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_zpidikot` table : 
#

DROP TABLE IF EXISTS misth_zpidikot;

CREATE TABLE misth_zpidikot (
  kodidikot char(2) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  descidikot varchar(50) NOT NULL default '',
  PRIMARY KEY  (kodidikot,kodxrisi),
  KEY kodxrisi (kodxrisi),
  CONSTRAINT 0_36 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_zpthesi` table : 
#

DROP TABLE IF EXISTS misth_zpthesi;

CREATE TABLE misth_zpthesi (
  kodthesi char(2) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  descthesi varchar(50) NOT NULL default '',
  PRIMARY KEY  (kodthesi,kodxrisi),
  KEY kodxrisi (kodxrisi),
  CONSTRAINT 0_38 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_zptamio` table : 
#

DROP TABLE IF EXISTS misth_zptamio;

CREATE TABLE misth_zptamio (
  kodtamio char(2) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  desctamio varchar(50) NOT NULL default '',
  PRIMARY KEY  (kodtamio,kodxrisi),
  KEY kodxrisi (kodxrisi),
  KEY kodxrisi_2 (kodxrisi,kodtamio),
  CONSTRAINT 0_40 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_zpoikog` table : 
#

DROP TABLE IF EXISTS misth_zpoikog;

CREATE TABLE misth_zpoikog (
  kodoikog char(2) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  descoikog varchar(50) NOT NULL default '',
  PRIMARY KEY  (kodoikog,kodxrisi),
  KEY kodxrisi (kodxrisi),
  CONSTRAINT 0_42 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_ypal` table : 
#

DROP TABLE IF EXISTS misth_ypal;

CREATE TABLE misth_ypal (
  kodypal bigint(20) NOT NULL default '0',
  kodxrisi varchar(4) NOT NULL default '',
  surname varchar(70) NOT NULL default '',
  name varchar(30) default '',
  fathername varchar(30) default '',
  adt varchar(10) default '',
  mitroo varchar(20) default '',
  afm varchar(10) default '',
  doy varchar(50) default '',
  kodtitlos char(2) default '',
  birthdate date default '0000-00-00',
  homephone varchar(50) default '',
  mobilphone varchar(50) default '',
  sex char(1) default '',
  spouse varchar(100) default '',
  childs int(11) default '0',
  prostmeli int(11) default '0',
  city varchar(50) default '',
  area varchar(50) default '',
  address varchar(100) default '',
  tk varchar(10) default '',
  email varchar(100) default '',
  kodtmima char(2) default '',
  kodidikot char(2) default '',
  jobtitle varchar(100) default '',
  hireddate date default '0000-00-00',
  rehireddate date default '0000-00-00',
  termdate date default '0000-00-00',
  termreason varchar(100) default '',
  jobphone varchar(50) default '',
  intphone varchar(20) default '',
  klimakio int(11) default '0',
  bathmos char(1) default '',
  klados varchar(10) default '',
  bank varchar(100) default '',
  bankno varchar(50) default '',
  exeldate date default '0000-00-00',
  kodthesi char(2) default '',
  kodoikog char(2) default '',
  kodtamio char(2) default NULL,
  mothername varchar(30) default NULL,
  newexeldate date default NULL,
  PRIMARY KEY  (kodypal,kodxrisi),
  KEY kodxrisi (kodxrisi),
  KEY kodtitlos (kodtitlos,kodxrisi),
  KEY kodtmima (kodtmima,kodxrisi),
  KEY kodidikot (kodidikot,kodxrisi),
  KEY kodthesi (kodthesi,kodxrisi),
  KEY kodoikog (kodoikog,kodxrisi),
  KEY surname (surname,kodxrisi),
  KEY adt (adt,kodxrisi),
  KEY mitroo (mitroo,kodxrisi),
  KEY afm (afm,kodxrisi),
  KEY sex (sex,kodxrisi),
  KEY kodtamio (kodtamio,kodxrisi),
  CONSTRAINT 0_44 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT 0_45 FOREIGN KEY (kodtmima, kodxrisi) REFERENCES misth_zptmima (kodtmima, kodxrisi) ON UPDATE CASCADE,
  CONSTRAINT 0_46 FOREIGN KEY (kodidikot, kodxrisi) REFERENCES misth_zpidikot (kodidikot, kodxrisi) ON UPDATE CASCADE,
  CONSTRAINT 0_47 FOREIGN KEY (kodthesi, kodxrisi) REFERENCES misth_zpthesi (kodthesi, kodxrisi) ON UPDATE CASCADE,
  CONSTRAINT 0_48 FOREIGN KEY (kodtamio, kodxrisi) REFERENCES misth_zptamio (kodtamio, kodxrisi) ON UPDATE CASCADE,
  CONSTRAINT 0_49 FOREIGN KEY (kodoikog, kodxrisi) REFERENCES misth_zpoikog (kodoikog, kodxrisi) ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_final_ypal` table : 
#

DROP TABLE IF EXISTS misth_final_ypal;

CREATE TABLE misth_final_ypal (
  kodfinal bigint(20) NOT NULL default '0',
  kodypal bigint(20) NOT NULL default '0',
  kodxrisi varchar(4) NOT NULL default '',
  plirdate date default NULL,
  PRIMARY KEY  (kodfinal,kodypal,kodxrisi),
  KEY kodfinal (kodfinal,kodxrisi),
  KEY kodypal (kodypal,kodxrisi),
  CONSTRAINT 0_51 FOREIGN KEY (kodfinal, kodxrisi) REFERENCES misth_final (kodfinal, kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT 0_52 FOREIGN KEY (kodypal, kodxrisi) REFERENCES misth_ypal (kodypal, kodxrisi) ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_zpepidom` table : 
#

DROP TABLE IF EXISTS misth_zpepidom;

CREATE TABLE misth_zpepidom (
  kodepidom varchar(20) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  descepidom varchar(50) NOT NULL default '',
  hasforo int(11) default '0',
  expr longtext,
  isasf int(11) default '0',
  autoforos int(11) default '0',
  hasasf int(11) default '0',
  PRIMARY KEY  (kodepidom,kodxrisi),
  KEY kodxrisi (kodxrisi),
  KEY hasasf (hasasf,kodxrisi),
  KEY hasforo (hasforo,kodxrisi),
  KEY isasf (isasf,kodxrisi),
  KEY autoforos (autoforos,kodxrisi),
  CONSTRAINT 0_54 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_final_ypal_epidom` table : 
#

DROP TABLE IF EXISTS misth_final_ypal_epidom;

CREATE TABLE misth_final_ypal_epidom (
  kodfinal bigint(20) NOT NULL default '0',
  kodypal bigint(20) NOT NULL default '0',
  kodepidom varchar(20) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  poso double(15,3) default NULL,
  aa int(11) default NULL,
  notes longtext,
  PRIMARY KEY  (kodfinal,kodypal,kodepidom,kodxrisi),
  KEY kodfinal (kodfinal,kodypal,kodxrisi),
  KEY kodepidom (kodepidom,kodxrisi),
  CONSTRAINT 0_56 FOREIGN KEY (kodfinal, kodypal, kodxrisi) REFERENCES misth_final_ypal (kodfinal, kodypal, kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT 0_57 FOREIGN KEY (kodepidom, kodxrisi) REFERENCES misth_zpepidom (kodepidom, kodxrisi) ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_zpkrat` table : 
#

DROP TABLE IF EXISTS misth_zpkrat;

CREATE TABLE misth_zpkrat (
  kodkrat varchar(20) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  desckrat varchar(50) NOT NULL default '',
  isforos int(11) default '0',
  isasf int(11) default '0',
  isautoforos int(11) default '0',
  PRIMARY KEY  (kodkrat,kodxrisi),
  KEY kodxrisi (kodxrisi),
  KEY isforos (isforos,kodxrisi),
  KEY isasf (isasf,kodxrisi),
  KEY isautoforos (isautoforos,kodxrisi),
  CONSTRAINT 0_59 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_kratapod` table : 
#

DROP TABLE IF EXISTS misth_kratapod;

CREATE TABLE misth_kratapod (
  kodkratapod bigint(20) NOT NULL auto_increment,
  kodxrisi varchar(4) NOT NULL default '',
  desckratapod varchar(100) NOT NULL default '',
  apoddate date NOT NULL default '0000-00-00',
  PRIMARY KEY  (kodkratapod),
  KEY kodxrisi (kodxrisi),
  KEY apoddate (apoddate,kodxrisi),
  CONSTRAINT 0_61 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_final_ypal_krat` table : 
#

DROP TABLE IF EXISTS misth_final_ypal_krat;

CREATE TABLE misth_final_ypal_krat (
  kodfinal bigint(20) NOT NULL default '0',
  kodypal bigint(20) NOT NULL default '0',
  kodkrat varchar(20) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  poso double(15,3) default NULL,
  aa int(11) default NULL,
  notes longtext,
  kodkratapod bigint(20) default NULL,
  PRIMARY KEY  (kodfinal,kodypal,kodkrat,kodxrisi),
  KEY kodfinal (kodfinal,kodypal,kodxrisi),
  KEY kodkrat (kodkrat,kodxrisi),
  KEY kodkratapod (kodkratapod),
  CONSTRAINT 0_63 FOREIGN KEY (kodfinal, kodypal, kodxrisi) REFERENCES misth_final_ypal (kodfinal, kodypal, kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT 0_64 FOREIGN KEY (kodkrat, kodxrisi) REFERENCES misth_zpkrat (kodkrat, kodxrisi) ON UPDATE CASCADE,
  CONSTRAINT 0_65 FOREIGN KEY (kodkratapod) REFERENCES misth_kratapod (kodkratapod) ON DELETE SET NULL ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_fylo` table : 
#

DROP TABLE IF EXISTS misth_fylo;

CREATE TABLE misth_fylo (
  kodfylo varchar(4) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  descfylo varchar(50) NOT NULL default '',
  PRIMARY KEY  (kodfylo,kodxrisi),
  KEY kodxrisi (kodxrisi),
  CONSTRAINT 0_67 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_fylo_epidom` table : 
#

DROP TABLE IF EXISTS misth_fylo_epidom;

CREATE TABLE misth_fylo_epidom (
  kodfylo varchar(4) NOT NULL default '',
  kodepidom varchar(20) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  expr longtext,
  aa int(11) default NULL,
  notes longtext,
  PRIMARY KEY  (kodfylo,kodepidom,kodxrisi),
  KEY kodxrisi (kodxrisi),
  KEY kodfylo (kodfylo,kodxrisi),
  KEY kodepidom (kodepidom,kodxrisi),
  KEY aa (aa),
  CONSTRAINT 0_69 FOREIGN KEY (kodfylo, kodxrisi) REFERENCES misth_fylo (kodfylo, kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT 0_70 FOREIGN KEY (kodepidom, kodxrisi) REFERENCES misth_zpepidom (kodepidom, kodxrisi) ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_fylo_krat` table : 
#

DROP TABLE IF EXISTS misth_fylo_krat;

CREATE TABLE misth_fylo_krat (
  kodfylo varchar(4) NOT NULL default '',
  kodkrat varchar(20) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  expr longtext,
  aa int(11) default NULL,
  notes longtext,
  PRIMARY KEY  (kodfylo,kodkrat,kodxrisi),
  KEY kodxrisi (kodxrisi),
  KEY kodfylo (kodfylo,kodxrisi),
  KEY kodkrat (kodkrat,kodxrisi),
  KEY aa (aa),
  CONSTRAINT 0_72 FOREIGN KEY (kodfylo, kodxrisi) REFERENCES misth_fylo (kodfylo, kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT 0_73 FOREIGN KEY (kodkrat, kodxrisi) REFERENCES misth_zpkrat (kodkrat, kodxrisi) ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_fylo_ypal` table : 
#

DROP TABLE IF EXISTS misth_fylo_ypal;

CREATE TABLE misth_fylo_ypal (
  kodfylo varchar(4) NOT NULL default '',
  kodypal bigint(20) NOT NULL default '0',
  kodxrisi varchar(4) NOT NULL default '',
  PRIMARY KEY  (kodfylo,kodypal,kodxrisi),
  KEY kodxrisi (kodxrisi),
  KEY kodfylo (kodfylo,kodxrisi),
  KEY kodypal (kodypal,kodxrisi),
  CONSTRAINT 0_75 FOREIGN KEY (kodfylo, kodxrisi) REFERENCES misth_fylo (kodfylo, kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT 0_76 FOREIGN KEY (kodypal, kodxrisi) REFERENCES misth_ypal (kodypal, kodxrisi) ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_report` table : 
#

DROP TABLE IF EXISTS misth_report;

CREATE TABLE misth_report (
  kodreport char(2) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  descreport varchar(100) NOT NULL default '',
  subtitle longtext,
  print_margin_top int(11) default NULL,
  print_margin_bottom int(11) default NULL,
  print_margin_left int(11) default NULL,
  print_margin_right int(11) default NULL,
  print_orientation int(11) default NULL,
  print_paper_size int(11) default NULL,
  print_scale int(11) default NULL,
  prn_notes1 longtext,
  prn_notes2 longtext,
  PRIMARY KEY  (kodreport,kodxrisi),
  KEY kodxrisi (kodxrisi),
  CONSTRAINT 0_78 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_report_cols` table : 
#

DROP TABLE IF EXISTS misth_report_cols;

CREATE TABLE misth_report_cols (
  kodcol int(11) NOT NULL default '0',
  kodreport char(2) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  expr longtext,
  header_text varchar(50) default NULL,
  width int(11) default NULL,
  aa int(11) default NULL,
  PRIMARY KEY  (kodcol,kodreport,kodxrisi),
  KEY kodreport (kodreport,kodxrisi),
  CONSTRAINT 0_80 FOREIGN KEY (kodreport, kodxrisi) REFERENCES misth_report (kodreport, kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_report_ypal` table : 
#

DROP TABLE IF EXISTS misth_report_ypal;

CREATE TABLE misth_report_ypal (
  kodreport char(2) NOT NULL default '',
  kodypal bigint(20) NOT NULL default '0',
  kodxrisi varchar(4) NOT NULL default '',
  PRIMARY KEY  (kodreport,kodypal,kodxrisi),
  KEY kodreport (kodreport,kodxrisi),
  KEY kodypal (kodypal,kodxrisi),
  CONSTRAINT 0_82 FOREIGN KEY (kodreport, kodxrisi) REFERENCES misth_report (kodreport, kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT 0_83 FOREIGN KEY (kodypal, kodxrisi) REFERENCES misth_ypal (kodypal, kodxrisi) ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_zpyvar` table : 
#

DROP TABLE IF EXISTS misth_zpyvar;

CREATE TABLE misth_zpyvar (
  kodyvar varchar(20) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  descyvar varchar(50) NOT NULL default '',
  expr longtext,
  PRIMARY KEY  (kodyvar,kodxrisi),
  KEY kodxrisi (kodxrisi),
  CONSTRAINT 0_85 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_ypal_yvar` table : 
#

DROP TABLE IF EXISTS misth_ypal_yvar;

CREATE TABLE misth_ypal_yvar (
  kodypal bigint(20) NOT NULL default '0',
  kodyvar varchar(20) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  expr longtext,
  aa int(11) default '0',
  PRIMARY KEY  (kodypal,kodyvar,kodxrisi),
  KEY kodxrisi (kodxrisi),
  KEY kodypal (kodypal,kodxrisi),
  KEY kodyvar (kodyvar,kodxrisi),
  KEY aa (aa),
  CONSTRAINT 0_87 FOREIGN KEY (kodypal, kodxrisi) REFERENCES misth_ypal (kodypal, kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT 0_88 FOREIGN KEY (kodyvar, kodxrisi) REFERENCES misth_zpyvar (kodyvar, kodxrisi) ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_zpstath` table : 
#

DROP TABLE IF EXISTS misth_zpstath;

CREATE TABLE misth_zpstath (
  kodstath varchar(20) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  descstath varchar(50) NOT NULL default '',
  poso double(15,3) default NULL,
  PRIMARY KEY  (kodstath,kodxrisi),
  KEY kodxrisi (kodxrisi),
  CONSTRAINT 0_90 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Structure for the `misth_zptitlos` table : 
#

DROP TABLE IF EXISTS misth_zptitlos;

CREATE TABLE misth_zptitlos (
  kodtitlos char(2) NOT NULL default '',
  kodxrisi varchar(4) NOT NULL default '',
  desctitlos varchar(10) NOT NULL default '',
  PRIMARY KEY  (kodtitlos,kodxrisi),
  KEY kodxrisi (kodxrisi),
  CONSTRAINT 0_92 FOREIGN KEY (kodxrisi) REFERENCES misth_zpxrisi (kodxrisi) ON DELETE CASCADE ON UPDATE CASCADE
) TYPE=InnoDB;

#
# Data for the `afxinfo` table  (LIMIT 0,500)
#

INSERT INTO afxinfo (dbver) VALUES 
  ('0.1.1');

COMMIT;

#
# Data for the `afxoperators` table  (LIMIT 0,500)
#

INSERT INTO afxoperators (operatorname, operator, orderno) VALUES 
  ('δεν είναι','is not',10),
  ('είναι','is',9),
  ('ίσο','=',1),
  ('μεγαλύτερο','>',3),
  ('μεγαλύτερο ή ίσο','>=',5),
  ('μικρότερο','<',2),
  ('μικρότερο ή ίσο','<=',4),
  ('να μη μοιάζει με','not like',8),
  ('να μοιάζει με','like',7),
  ('όχι ίσο','<>',6);

COMMIT;

#
# Data for the `afxtranslate` table  (LIMIT 0,500)
#

INSERT INTO afxtranslate (id, el, uk) VALUES 
  (1,'&’κυρο','&Cancel'),
  (2,'&Ακύρωση','&Cancel'),
  (3,'&Αναζήτηση','&Find'),
  (4,'&Αναλυτικά','&Details'),
  (5,'&Ανανέωση','&Update'),
  (6,'&Ανανέωση άδειας χρήσης','&Update licence'),
  (7,'&Αντιγραφή','&Copy'),
  (8,'&Αποδοχή - επίδομα','&Wage - bonus'),
  (9,'&Αριστερά','&Left'),
  (10,'&Βοήθεια','&Help'),
  (11,'&Δεξιά','&Right'),
  (12,'&Δημιουργία','&Create'),
  (13,'&Διαγραφή','&Delete'),
  (14,'&Διαμόρφωση σελίδας','Page &setup'),
  (15,'&Εγγραφές','&Records'),
  (16,'&Εκτυπώσεις','&Print'),
  (17,'&Εκτύπωση','&Print'),
  (18,'&Εκτύπωση μισθοδοσίας','&Print payroll'),
  (19,'&Εκτυπωτής','&Printer'),
  (20,'&Έξοδος','&Exit'),
  (21,'&Επάνω','&Up'),
  (22,'&Επεξεργασία','&Edit'),
  (23,'&Επόμενο','&Next'),
  (24,'&Επόμενο φίλτρο','&Next filter'),
  (25,'&Ζουμ','&Zoom'),
  (26,'&Καθαρισμός ιστορικού','&Clear histoyr'),
  (27,'&Κατακόρυφη παράθεση','Arange &vertically'),
  (28,'&Κλείσιμο','&Close'),
  (29,'&Κράτηση','&Deduction'),
  (30,'&Μετάβαση','Go&to'),
  (31,'&Μεταβλητή υπαλλήλου','Employee&variable'),
  (32,'&Νέα μισθοδοσία','&New payroll'),
  (33,'&Οριζόντια παράθεση','Arange &horizontally'),
  (34,'&Παράθυρο','&Window'),
  (35,'&Πίνακες','&Tables'),
  (36,'&Πίσω','&Back'),
  (37,'&Πληροφορίες εφαρμογή','&About'),
  (38,'&Πληροφορίες εφαρμογής','Application &information'),
  (39,'&Πληρωμή απλήρωτων','Pay&unsettled'),
  (40,'&Πληρωμή μισθοδοσίας','&Pay payroll'),
  (41,'&Προβολή επιλογών','View &options'),
  (42,'&Προηγούμενο φίλτρο','&Previous filter'),
  (43,'&Προσθήκη','&Insert'),
  (44,'&Σελίδες','&Pages'),
  (45,'&Συγκεντρωτικά','&Totals'),
  (46,'&Τακτοποίηση εικονιδίων','Arange &icons'),
  (47,'&Τελευταία εγγραφή','&Last record'),
  (48,'&Τέλος','&End'),
  (49,'@@ΚΕΝΟ','@@NULL'),
  (50,'@@ΝΑΙ','@@YES'),
  (51,'@@ΟΧΙ','@@NO'),
  (52,'e-mail','e-mail'),
  (53,'Α&νανέωση','&Update'),
  (54,'Α&ντικατάσταση','&Replace'),
  (55,'Α.Δ.Τ.','ID No.'),
  (56,'Α.Φ.Μ.','Tax No.'),
  (57,'Α/Α','S.N.'),
  (58,'Αιτία λήξης','Exp. Reason'),
  (59,'Αιτιατική','Accusative'),
  (60,'Ακύρωση','Cancel'),
  (61,'Αλλαγές Μ.Κ.','Promotion'),
  (62,'Αλλαγή κλ.','Promotion'),
  (63,'Αλλαγή κλιμ.','Promotion'),
  (64,'ΑΛΛΑΓΗ ΚΛΙΜΑΚΙΟΥ','PROMOSION'),
  (65,'Αλλαγή κλιμακίου','Promotion'),
  (66,'Αλλαγή χρήσης','Change season'),
  (67,'Ανα&νέωση','&Update'),
  (68,'Αναζήτηση','Search'),
  (69,'Αναζήτηση εγγραφών','Search records'),
  (70,'Αναζήτηση εργαζομένων','Search employees'),
  (71,'Αναζήτηση μισθοδοσίας','Search payroll'),
  (72,'Αναζήτηση μισθοδοσίας (αναλυτικά)','Search payroll (details)'),
  (73,'ΑΝΑΛΥΣΗ ΑΠΟΔΟΧΩΝ - ΚΡΑΤΗΣΕΩΝ','WAGES - DEDUCTIONS ANALYSIS'),
  (74,'Ανάλυση αποδοχών - κρατήσεων (ανά εργαζόμενο)','Wages - deductions analysis (per employee)'),
  (75,'Ανάλυση αποδοχών - κρατήσεων ανά υπάλληλο','Wages - deductions analysis (per employee)'),
  (76,'Αναλυτικά','Details'),
  (77,'Αναλυτική κατάσταση μισθοδοσιών','Payrolls (analytic)'),
  (78,'Ανανέωση','Update'),
  (79,'Ανανέωση περιεχομένων','Update contents'),
  (80,'’νοιγμα φίλτρου','Open filter'),
  (81,'Αντίγραφα','Copies'),
  (82,'Αντίγραφα ασφαλείας','Backup'),
  (83,'Αντιγραφή φύλου','Copy sheet'),
  (84,'Απλήρωτες καταστάσεις','Unrequited payrolls'),
  (85,'Απλήρωτες καταστάσεις (Ε)','Unrequited payrolls (Ε)'),
  (86,'Απλήρωτες καταστάσεις (Κ)','Unrequited payrolls (P)'),
  (87,'ΑΠΛΗΡΩΤΕΣ ΚΑΤΑΣΤΑΣΕΙΣ ΜΙΣΘΟΔΟΣΙΑΣ','UNREQUITED PAYROLLS'),
  (88,'Απλήρωτες καταστάσεις μισθοδοσίας','Unrequited payrolls'),
  (89,'Απλήρωτες καταστάσεις μισθοδοσίας (ανά εργαζόμενο)','Unrequited payrolls (per employee)'),
  (90,'Απλήρωτες καταστάσεις μισθοδοσίας (ανά κατάσταση)','Unrequited payrolls (per payroll)'),
  (91,'Απλήρωτες καταστάσεις μισθοδοσίας (ανά υπάλληλο)','Unrequited payrolls (per employee)'),
  (92,'Από','From'),
  (93,'ΑΠΟΔΟΣΗ ΚΡΑΤΗΣΕΩΝ','RETURN DEDUCTIONS'),
  (94,'Απόδοση κρατήσεων','Deposit deductions'),
  (95,'Αποδοχές','Wages'),
  (96,'Αποδοχές / Επιδόματα','Wages / Bonus'),
  (97,'Αποδοχές/Επιδόματα','Wages / Bonus'),
  (98,'Αποδοχή - Επίδομα','Wages / Bonus'),
  (99,'Αποεπιλογή όλων','Deselect all'),
  (100,'Αποθήκευση &εγγραφής','&Save record'),
  (101,'Αποθήκευση φίλτρου','Save &filter'),
  (102,'Αποτυχία σύνδεσης','Connection faild'),
  (103,'Απριλίου','April'),
  (104,'Αρ. λογαρ.','Account No'),
  (105,'Αρ. μισθοδοσίας','Payroll No'),
  (106,'Αριθμ.','Number'),
  (107,'Αριθμ. μισθ.','Payroll No'),
  (108,'Αριθμ. τέκνων','Children'),
  (109,'Αριθμός λογ.','Account No'),
  (110,'Αριθμός μητρώου','Register No'),
  (111,'Αριθμός μισθοδοσίας','Payroll No'),
  (112,'Αριστερά','Left'),
  (113,'’ρρεν','Male'),
  (114,'Αρχείο αντιγραφής','Backup file'),
  (115,'Ασφ.','I.D.'),
  (116,'Ασφ. ταμείο','Insurance'),
  (117,'Ασφ.κρ.','E.I.'),
  (118,'Ασφαλιστικά ταμεία','Insurance agencies'),
  (119,'Ασφαλιστική εισφορά','Insurance wages'),
  (120,'Ατομικά στοιχεία','Personal data'),
  (121,'Ατομικές καταστάσεις','Personal payrolls'),
  (122,'Ατομικές καταστάσεις μισθοδοσίας','Personal payrolls'),
  (123,'Ατομική κατάσταση','Personal payroll'),
  (124,'ΑΤΟΜΙΚΗ ΚΑΤΑΣΤΑΣΗ ΜΙΣΘΟΔΟΣΙΑΣ','PERSONAL PAYROLL'),
  (125,'Αυγούστου','August'),
  (126,'Αυτ.φορ.','Tax'),
  (127,'Αυτή η κεφαλίδα έχει καταχωρηθεί','This header has been registered'),
  (128,'Αυτή η κράτηση έχει καταχωρηθεί','This deduction already exists'),
  (129,'Αυτή η μεταβλητή έχει καταχωρηθεί','This variable already exists'),
  (130,'Αυτή η περιγραφή υπάρχει ήδη','This description already exists'),
  (131,'Αυτό το επίδομα έχει καταχωρηθεί','This wages already exists'),
  (132,'Αυτό το λεκτικό έχει καταχωρηθεί','This word already exists'),
  (133,'Αυτός ο κωδικός υπάρχει ήδη','This code already exists'),
  (134,'Αυτός ο χρήστης δεν έχει δικαίωμα πρόσβασης σ΄ αυτή την εφαρμογή','This user doesn\'t have the permission to use this application'),
  (135,'Αυτός ο χρήστης είναι ανενεργός','This user is incative'),
  (136,'Αυτός ο χρήστης υπάρχει ήδη στην ομάδα χρηστών','This user already exists at the group'),
  (137,'Αυτοτελής φόρος','Autotelic tax'),
  (138,'Αυτοτελώς φορολογούμενα εισοδήματα','Autotelic tax wages'),
  (139,'Αφορολόγητα εισοδήματα','Duty free wages'),
  (140,'Βαθμός','Grade'),
  (141,'Βάση δεδομένων','Database'),
  (142,'Γενικά','Generally'),
  (143,'Γενική','Possessive'),
  (144,'ΓΕΝΙΚΟ ΣΥΝΟΛΟ','GRAND TOTAL'),
  (145,'Γενικό Σύνολο','Grand total'),
  (146,'Δ.Ο.Υ.','Tax office'),
  (147,'δέκα','ten'),
  (148,'Δεκαεννέα','Nineteen'),
  (149,'Δεκαέξι','Sixteen'),
  (150,'Δεκαεπτά','Seventeen'),
  (151,'Δεκαοχτώ','Eighteen'),
  (152,'Δεκαπέντε','Fifteen'),
  (153,'Δεκατέσσερις','Fourteen'),
  (154,'Δεκατρείς','Thirteen'),
  (155,'Δεκεμβρίου','December'),
  (156,'Δεν βρέθηκαν εγγραφές','No records found'),
  (157,'Δεν δώσατε αριθμό μισθοδοσίας','You must give the payroll number'),
  (158,'Δεν δώσατε αρχείο αντιγράφων ασφαλείας','You must give the backup file'),
  (159,'Δεν δώσατε βάση δεδομένων','You must give the database'),
  (160,'Δεν δώσατε ημ/νία','You must give the date'),
  (161,'Δεν δώσατε κείμενο προς αναζήτηση','You must give search criteria'),
  (162,'Δεν δώσατε κωδικό','You must give the code'),
  (163,'Δεν δώσατε όνομα φίλτρου','You must give the filter name'),
  (164,'Δεν δώσατε πεδίο','You must give the field'),
  (165,'Δεν δώσατε τελεστή','You must give the operator'),
  (166,'Δεν δώσατε την αρχή της περιόδου','You must give the start of the period'),
  (167,'Δεν δώσατε την ημ/νία απόδοσης','You must give the return date'),
  (168,'Δεν δώσατε την ημ/νία έναρξης','You must give the start date'),
  (169,'Δεν δώσατε την ημ/νία λήξης','You must give the end date'),
  (170,'Δεν δώσατε την ημ/νία της μισθοδοσίας','You must give the payroll date'),
  (171,'Δεν δώσατε την κατηγορία μισθοδοσίας','You must give the payroll category'),
  (172,'Δεν δώσατε την κατηγορία της μισθοδοσίας','You must give the payroll category'),
  (173,'Δεν δώσατε την κεφαλίδα','You must give the header'),
  (174,'Δεν δώσατε την λήξη της περιόδου','You must give the end of the period'),
  (175,'Δεν δώσατε την περιγραφή','You must give the description'),
  (176,'Δεν δώσατε την περιγραφή της απόδοσης','You must give the return description'),
  (177,'Δεν δώσατε την περιγραφή της μισθοδοσίας','You must give the Payroll description'),
  (178,'Δεν δώσατε την περιγραφή της ομάδας χρηστών','You must give the group description'),
  (179,'Δεν δώσατε την περιγραφή της περιόδου','You must give the period description'),
  (180,'Δεν δώσατε την περιγραφή της σταθεράς','You must give the constant description'),
  (181,'Δεν δώσατε την περιγραφή της χρήσης','You must give the season description'),
  (182,'Δεν δώσατε την περίοδο της μισθοδοσίας','You must give the period of payroll'),
  (183,'Δεν δώσατε τιμή','You must give the value'),
  (184,'Δεν δώσατε το επώνυμο του υπαλλήλου','You must give the employee surname'),
  (185,'Δεν δώσατε το όνομα χρήστη','You must give the user name'),
  (186,'Δεν δώσατε το φάκελο των εκτελέσιμων αρχείων','You must give the bin folder'),
  (187,'Δεν δώσατε τον διακομιστή','You must give the server'),
  (188,'Δεν δώσατε τον κωδικό','You must give the code'),
  (189,'Δεν δώσατε τον κωδικό πρόσβασης','You must give the access code'),
  (190,'Δεν δώσατε τον κωδικό της περιόδου','You must give the period code'),
  (191,'Δεν δώσατε τον κωδικό της σταθεράς','You must give the constant code'),
  (192,'Δεν δώσατε τον φάκελο των αντιγράφων ασφαλείας','You must give the backup folder'),
  (193,'Δεν επιλέξατε περίοδο μεταφοράς','You must select the period to transfer'),
  (194,'Δεν επιλέξατε χρήση','You must select the season'),
  (195,'Δεν επιλέξατε χρήστη','You must select a user'),
  (196,'Δεν έχετε δικαίωμα διαγραφής εγγραφών','You haven\'t the permission to delete records'),
  (197,'Δεν έχετε δικαίωμα προσθήκης εγγραφών','You haven\'t the permission to add records'),
  (198,'Δεν έχετε δόσει κριτήρια','You must give criteria'),
  (199,'Δεν έχετε δόσει σύνδεση κριτηρίων','You must give the join field'),
  (200,'Δεν έχετε επιλέξει επίδομα','You must select wages'),
  (201,'Δεν έχετε επιλέξει εργαζόμενο','You must select an employee'),
  (202,'Δεν έχετε επιλέξει κάποιο υπάλληλο','You must select an employee'),
  (203,'Δεν έχετε επιλέξει κράτηση','You must select a deduction'),
  (204,'Δεν έχετε επιλέξει μεταβλητή','You must select a variable'),
  (205,'Δεν έχετε επιλέξει φύλλα υπολογισμού','You must select one or more calculate sheet'),
  (206,'Δεν έχετε επιλέξει χρήση','You must select the season'),
  (207,'Δεξιά','Right'),
  (208,'Δημιουργία','Create'),
  (209,'Δημιουργία &αποδοχής-επιδόματος','Create &wages - Bonus'),
  (210,'Δημιουργία &κράτησης','Create &deduction'),
  (211,'Δημιουργία &μεταβλητής υπαλλήλου','Create employee &variable'),
  (212,'Δημιουργία αποδοχής - επιδόματος','Create wages - Bonus'),
  (213,'Δημιουργία αποδοχής-επιδόματος','Create wages - Bonus'),
  (214,'Δημιουργία κράτησης','Create deduction'),
  (215,'Δημιουργία μεταβλητής υπαλλήλου','Create employee variable'),
  (216,'Δημιουργία νέας μισθοδοσίας','Create new payroll'),
  (217,'Δημιουργία σύνθετου φίλτρου αναζήτησης','Create advanced filter'),
  (218,'Δημιουργία φίλτρου','Create filter'),
  (219,'Δημιουργία χρήσης','Create season'),
  (220,'Δι&αγραφή εγγραφής','&Delete record'),
  (221,'Διαγρ.','Del.'),
  (222,'Διαγραφή','Delete'),
  (223,'Διαγραφή εγγραφής','Delete record'),
  (224,'Διαγραφή επιλεγμένων εγγραφών','Delete selected records'),
  (225,'Διαγραφή της επιλεγμένης εγγραφής','Delete current record'),
  (226,'Διαγραφή φίλτρου','Delete filter'),
  (227,'Διαθέσιμα φίλτρα','Available filters'),
  (228,'Διακομιστής','Server'),
  (229,'διακόσια','Two hundred'),
  (230,'Διαμόρφωση σελίδας','Page setup'),
  (231,'Διαμόρφωση σελίδας εκτύπωσης','Page setup'),
  (232,'Διάταξη σελίδας','Page orientation'),
  (233,'Διαχείριση χρήσεων','Season administration'),
  (234,'Διαχειριστής','Administrator'),
  (235,'Διερεύνηση σε','Find to'),
  (236,'Διεύθυνση','Address'),
  (237,'Δικαιώματα','Copyright'),
  (238,'Δικαιώματα χρήσης: ΔΕΑΣ','Copyright: GPL'),
  (239,'Διπλοεγγραφή','Double record'),
  (240,'Δύο','Two'),
  (241,'δύο χιλιάδες','Two thousand'),
  (242,'δώδεκα','twelve'),
  (243,'Δώστε τα στοιχεία της απόδοσης','Enter deposit data'),
  (244,'Δώστε τα στοιχεία της νέας μισθοδοσίας','Enter payroll data'),
  (245,'Δώστε τον κωδικό και την περιγραφή του νέου φύλου υπολογισμού','Enter the code and the description of the new calculate sheet'),
  (246,'Ε&γγραφές','&Records'),
  (247,'Ε&κτυπώσεις','Re&ports'),
  (248,'εβδομήντα','seventy'),
  (249,'Ειδικότητα','Speciality'),
  (250,'Ειδικότητες εργαζομένων','Employee specialities'),
  (251,'Ειδικότητες υπαλλήλων','Employee specialities'),
  (252,'Είκοσι','Twenty'),
  (253,'Είκοσι δύο','Twenty-two'),
  (254,'Είκοσι εννέα','Twenty-nine'),
  (255,'Είκοσι έξι','Twenty-sex'),
  (256,'Είκοσι επτά','Twenty-seven'),
  (257,'Είκοσι μία','Twenty-one'),
  (258,'Είκοσι οχτώ','Twenty-eight'),
  (259,'Είκοσι πέντε','Twenty-five'),
  (260,'Είκοσι τέσσερις','Twenty-four'),
  (261,'Είκοσι τρεις','Twenty-three'),
  (262,'Είναι εργοδοτική ασφαλιστική εισφορά','Is employeer insurance wages'),
  (263,'Εισαγωγή ημ/νίας','Enter date'),
  (264,'Εισαγωγή κριτηρίων εκτύπωσης','Enter report criteria'),
  (265,'εκατό','One hundred'),
  (266,'εκατόν','One hundred'),
  (267,'Έκδοση','Resease'),
  (268,'Έκδοση Β.Δ.','DB version'),
  (269,'Έκδοση βάσης','DB version'),
  (270,'Εκτυπώσεις','Reports'),
  (271,'Εκτύπωση','Print'),
  (272,'Εκτύπωση ατομικών καταστάσεων','Print personal payrolls'),
  (273,'Εκτύπωση επιλεγμένης απόδοσης','Print selected deduction'),
  (274,'Εκτύπωση καταστάσεων χρήστη','Print user reports'),
  (275,'Εκτύπωση μισθοδοσίας','Print payroll'),
  (276,'Εκτύπωση συγκεντρωτικής κατάστασης','Print total payroll'),
  (277,'Εκτυπωτής','Printer'),
  (278,'Έκφραση υπολογισμού','Calculation form'),
  (279,'Ελέγξτε το όνομα χρήστη και τον κωδικό εισόδου','Enter the user name and password'),
  (280,'Έλεγχος πρόσβασης','Check access'),
  (281,'Εμφάνιση - Απόκριψη επιλογών','Show - hide treebar'),
  (282,'ένα','one'),
  (283,'Έναρξη','Start'),
  (284,'Ένας ή περισσότεροι υπάλληλοι υπάρχουν σε περισσότερα του ενός φύλλα υπολογισμού','One or more employees exist at one or more calculation sheets'),
  (285,'Ένδεκα','Eleven'),
  (286,'ενενήντα','ninety'),
  (287,'Ενέργεια','Action'),
  (288,'Ενεργός','Active'),
  (289,'Εννέα','Nine'),
  (290,'εννιακόσια','Nine hundred'),
  (291,'εξακόσια','Six hundred'),
  (292,'Εξέλιξη','Promotion'),
  (293,'εξήντα','sixty'),
  (294,'Έξι','Six'),
  (295,'Έξοδος','Exit'),
  (296,'Έξοδος από την εφαρμογή','Exit application'),
  (297,'Επαλήθευση','Confirmation'),
  (298,'Επαναπροσλ.','Re-employment'),
  (299,'Επαναφορά δεδομένων','Restore'),
  (300,'Επάνω','Up'),
  (301,'Επεξ.','Edit'),
  (302,'Επεξεργασία','Edit'),
  (303,'Επεξεργασία τύπου','Edit calculation form'),
  (304,'Επιγολή εργαζομένου','Select employee'),
  (305,'Επίδομα','Bonus'),
  (306,'Επιδόματα','Bonus'),
  (307,'Επιδόματα / Αποδοχές','Wages / Bonus'),
  (308,'Επιλεγμένες','Selected'),
  (309,'Επιλεγμένοι','Selected'),
  (310,'Επιλέξτε τα επιδόματα που θέλετε να καταχωρήσετε','Select wages that you want to register'),
  (311,'Επιλέξτε τις κρατήσεις που θέλετε να αποδώσετε','Select deductions that you want to deposit'),
  (312,'Επιλέξτε τις κρατήσεις που θέλετε να καταχωρήσετε','Select deductions that you want to register'),
  (313,'Επιλέξτε τον εργαζόμενο για τον οποίο θα εκδόσετε μισθοδοσία','Select the employee to create payroll'),
  (314,'Επιλέξτε τους εργαζόμενους για τους οποίους θα αποδώσετε κρατήσεις','Select the employees for whom you will deposit deductions'),
  (315,'Επιλογή','Select'),
  (316,'Επιλογή γραμμής','Select row'),
  (317,'Επιλογή εγγρα&φής','Select &record'),
  (318,'Επιλογή εκτύπωσης','Printing selection'),
  (319,'Επιλογή εργαζομένου','Select employee'),
  (320,'Επιλογή κατάστασης χρήστη','Select user report'),
  (321,'Επιλογή κρατήσεων','Select deductions'),
  (322,'Επιλογή όλων','Select all'),
  (323,'Επιλογή όλων &των εγγραφών','Select &all records'),
  (324,'Επιλογή περιόδων','Period selection'),
  (325,'Επιλογή υπαλλήλων','Select employees'),
  (326,'Επιλογή φύλλων υπολογισμού','Select payroll sheet(s)'),
  (327,'Επιλογή χρήσης','Select season'),
  (328,'Επιλογή χρήστη','User selection'),
  (329,'Επιστροφή','Return'),
  (330,'Επόμε&νη εγγραφή','&Next record'),
  (331,'Επόμενη','Next'),
  (332,'Επόμενη εγγραφή','Next record'),
  (333,'Επόμενο φίλτρο','Next filter'),
  (334,'Επτά','Seven'),
  (335,'επτακόσια','Seven hundred'),
  (336,'Επώνυμο','Surname'),
  (337,'Εργαζόμενοι','Employees'),
  (338,'Εργαζόμενοι για αλλαγή κλιμακίου','Empolyees to be promoted'),
  (339,'Εργαζόμενος','Employee'),
  (340,'Εργαλεία','Tools'),
  (341,'Εργασία','Work'),
  (342,'Εργοδοτικές ασφαλιστικές εισφορές','Employer insurance wages'),
  (343,'Εσωτερικό τηλ.','Inner phone'),
  (344,'Εταιρεία','Company'),
  (345,'Εύ&ρεση','&Find'),
  (346,'Εύρεση','Find'),
  (347,'Εύρεση επόμενου','Find next'),
  (348,'Εύρεση του','Find'),
  (349,'Εφαρμογή','Apply'),
  (350,'Έως','To'),
  (351,'Ζουμ','Zoom'),
  (352,'Ζυγές σελίδες','Even pages'),
  (353,'Η μισθοδοσία με αριθμό','The payroll No'),
  (354,'Η ομάδα χρηστών','The user group'),
  (355,'Η πρόσβαση δεν επιτρέπεται','Access denied'),
  (356,'Η σύνδεση στη βάση δεν πραγματοποιήθηκε','Database connection faild'),
  (357,'Η τιμή που δώσατε δεν είναι έγκυρη μορφή αριθμού','The value is not a valid number'),
  (358,'Η τιμή που δώσατε δεν είναι έγκυρη μορφή ημ/νίας','The value is not a valid date'),
  (359,'Η τιμή που δώσατε δεν είναι έγκυρη μορφή ώρας','The value is not a valid time'),
  (360,'Η τρέχουσα ημ/νία είναι εκτώς των ορίων χρήσης','Current date is beyond the season limits'),
  (361,'Ημ/νία','Date'),
  (362,'Ημ/νία απόδ.','Deposit date'),
  (363,'Ημ/νία γέν.','Birth date'),
  (364,'Ημ/νία γένν.','Birth date'),
  (365,'Ημ/νία Έκδ.','Rel. date'),
  (366,'Ημ/νία έκδοσης','Release date'),
  (367,'Ημ/νία έκδοσης μισθοδοσίας','Payroll release date'),
  (368,'Ημ/νία λήξης','End date'),
  (369,'Ημ/νία πλ.','Pay date'),
  (370,'Ημ/νία πληρ.','Pay date'),
  (371,'Ημ/νία πληρωμής','Pay date'),
  (372,'Ημ/νία πληρωμής μισθοδοσίας','Payroll payment date'),
  (373,'Ημερομηνία','Date'),
  (374,'Θέλετε να αντικατασταθεί;','Do you want to be replaced'),
  (375,'Θέλετε να εγκαταλείψετε την εφαρμογή;','Do you want to exit application'),
  (376,'Θέσεις εργαζομένων','Employee post'),
  (377,'Θέσεις υπαλλήλων','Employee post'),
  (378,'Θέσεις/Βαθμοί εργαζομένων','Employee post/grade'),
  (379,'Θέση','Post'),
  (380,'Θήλυ','Female'),
  (381,'Ιανουαρίου','January'),
  (382,'Ιδιότητα','Status'),
  (383,'Ιουλίου','July'),
  (384,'Ιουνίου','June'),
  (385,'Κά&τω','&Down'),
  (386,'Καθαρισμός','Clear'),
  (387,'Καθαρισμός ιστορικού','Clear history'),
  (388,'Κατακόρυφη τακτοποίηση παραθύρων','Arange windows vertically'),
  (389,'Καταστάσεις','Payrolls'),
  (390,'Καταστάσεις &μισθοδοσίας','&Payrolls'),
  (391,'Καταστάσεις μισθοδοσίας (αναλυτικά)','Payrolls (&details)'),
  (392,'Καταστάσεις μισθοδοσίας (συγκεντρωτικά)','Payrolls (group)'),
  (393,'Καταστάσεις χρήστη','User reports'),
  (394,'Κατάσταση κρατήσεων προς απόδοση','Deductions for depostition'),
  (395,'ΚΑΤΑΣΤΑΣΗ ΜΙΣΘΟΔΟΣΙΑΣ','PAYROLL'),
  (396,'Κατάσταση χρήστη','User report'),
  (397,'Κατηγορία','Category'),
  (398,'Κατηγορία μισθοδοσίας','Payroll category'),
  (399,'Κατηγορίες μισθοδοσίας','Payroll categories'),
  (400,'Κάτω','Down'),
  (401,'Κεφαλίδα','Header'),
  (402,'Κινητό','Mobil'),
  (403,'Κλάδος','Branch'),
  (404,'Κλείσιμο','Close'),
  (405,'Κλείσιμο ενεργού παραθύρου','Close active window'),
  (406,'Κλείσιμο του ενεργού παραθύρου','Close active window'),
  (407,'Κλιμ.','Pay pos'),
  (408,'Κλιμ. / βαθμός','Pay pos / grade'),
  (409,'Κλίμακα','Pay pos'),
  (410,'Κλιμάκιο','Pay pos'),
  (411,'Κρατήσεις','Deductions'),
  (412,'Κρατήσεις για ασφαλιστικά ταμεία','Deductions for insurance agencies'),
  (413,'ΚΡΑΤΗΣΕΙΣ ΠΟΥ ΔΕΝ ΕΧΟΥΝ ΑΠΟΔΟΘΕΙ','DEDUCTIONS FOR DEPOSITION'),
  (414,'Κρατήσεις που δεν έχουν αποδοθεί','Deductions for deposition'),
  (415,'Κρατήσεις προς απόδοση','Deductions for deposition'),
  (416,'Κράτηση','Deduction'),
  (417,'Κριτήρια εκτύπωσης','Print criteria'),
  (418,'Κωδ.','Code'),
  (419,'Κωδικός','Code'),
  (420,'Κωδικός φύλλου','Sheet code'),
  (421,'Λήξη','Expire'),
  (422,'Λίστα','List'),
  (423,'Λογότυπο','Logo'),
  (424,'Λοιπές κρατήσεις','Other deductions'),
  (425,'Μαΐου','May'),
  (426,'Μαρτίου','March'),
  (427,'Με την επιλογή αυτή θα μεταφερθούν οι απλήρωτες καταστάσεις μισθοδοσίας από την χρήση που θα επιλέξετε παρακάτω στην τρέχουσα','Payrolls that haven\'t been paid at selected season will be transfered to the current season'),
  (428,'Με την επιλογή αυτή θα μεταφερθούν τα σταθερά στοιχεία από την χρήση που θα επιλέξετε παρακάτω στην τρέχουσα','All constant tables will be transfered from the selected season to current'),
  (429,'Μέγεθος χαρτιού','Paper size'),
  (430,'Μέλη','Members'),
  (431,'Μέλος ομάδων','Group members'),
  (432,'Μεταβλητές','Custom fields'),
  (433,'Μεταβλητές υπαλλήλων','Employee custom fields'),
  (434,'Μεταβλητή','Custom field'),
  (435,'Μεταφορά &απλήρωτων καταστάσεων','Transfer &unrequited payrolls'),
  (436,'Μεταφορά &σταθερών στοιχείων','Transfer &static tables'),
  (437,'Μεταφορά απλήρωτων καταστάσεων από άλλη χρήση','Transfer unrequited payrolls from other season'),
  (438,'Μεταφορά απλήρωτων καταστάσεων μισθοδοσίας','Transfer unrequited payrolls'),
  (439,'Μεταφορά από χρήση','Transfer from season'),
  (440,'Μεταφορά μεταβλητών από υπάλληλο','Transfer custom fields'),
  (441,'Μεταφορά σταθερών στοιχείων από άλλη χρήση','Transfer static tables from other season'),
  (442,'Μεταφορά χρήσης','Transfer season'),
  (443,'Μεταφορές','Transfer'),
  (444,'Μητρώνυμο','Mother name'),
  (445,'Μητρώο','Reg. no'),
  (446,'Μία','One'),
  (447,'Μισθ. περίοδος','Payroll period'),
  (448,'Μισθοδοσία','Payroll'),
  (449,'Μισθοδοσίες','Payrolls'),
  (450,'Μισθολογική περίοδος','Payroll period'),
  (451,'Μονές σελίδες','Odd pages'),
  (452,'Μορφές δεδομένων','Data form'),
  (453,'Να γίνει η διαγραφή του επιλεγμένου φίλτρου;','Do you want to delete the selected filter?'),
  (454,'Να γίνει η διαγραφή;','Confirm deletion'),
  (455,'Να διαγαφή η τρέχουσα εγγραφή;','Do  you want to delete current record?'),
  (456,'Να διαγραφή η τρέχουσα εγγραφή;','Do  you want to delete current record?'),
  (457,'Να διαγραφούν οι επιλεγμένες εγγραφές;','Do you want to delete the selected records?'),
  (458,'Νέα &εγγραφή','&New record'),
  (459,'Νέα εγγραφή','New record'),
  (460,'Νέα εξέλιξη','Next promotion'),
  (461,'Νέα μισθοδοσία','New payroll'),
  (462,'Νέα ομάδα χρηστών','New user group'),
  (463,'Νέος χρήστης','New user'),
  (464,'Νές &εγγραφή','&New record'),
  (465,'Νοεμβρίου','November'),
  (466,'Ο κωδικός','The code'),
  (467,'Ο χρήστης','The user'),
  (468,'Ό&λες','&All'),
  (469,'ογδόντα','eighty'),
  (470,'Οδηγός καταχώρησης μισθοδοσίας','Payroll wizard'),
  (471,'Οι μεταφερόμενες καταστάσεις θα ανήκουν στην περίοδο που θα επιλέξετε','Select the new period for transfered payrolls'),
  (472,'Οικ. κατάστ.','Family status'),
  (473,'Οικ. κατάσταση','Family status'),
  (474,'Οικογενειακές καταστάσεις','Family status'),
  (475,'Οικογενειακή κατάσταση','Family status'),
  (476,'ΟΚ','OK'),
  (477,'Οκτωβρίου','October'),
  (478,'Όλα','All'),
  (479,'Όλα τα σταθερά στοιχεία της τρέχουσας χρήσης θα διαγραφούν','All static tables of current season will be deleted'),
  (480,'Όλες οι σελίδες','All pages'),
  (481,'Ομάδα χρηστών','User group'),
  (482,'Ομάδες χρηστών','User groups'),
  (483,'Όνομα','Name'),
  (484,'Όνομα διαχειριστή','Administrator name'),
  (485,'Όνομα εφαρμογής','Application title'),
  (486,'Όνομα φίλτρου','Filter name'),
  (487,'Όνομα χρήστη','Username'),
  (488,'Ονομαστική','Subjective'),
  (489,'Ονοματεπώνυμο','Full name'),
  (490,'Οριζόντια τακτοποίηση παραθύρων','Tile windows horizontally'),
  (491,'οχτακόσια','Eight hundred'),
  (492,'οχτώ','eight'),
  (493,'Π','P'),
  (494,'Π&ροβολή','&View'),
  (495,'Π&ροηγούμενη εγγραφή','&Previous record'),
  (496,'Παιδιά','Children'),
  (497,'Παράθυρο','Window'),
  (498,'ΠΑΡΑΚΑΛΩ ΠΕΡΙΜΕΝΕΤΕ','PLEASE WAIT'),
  (499,'Παρακρ.','T.D.'),
  (500,'Παρακρατηθέν φόρος','Retained taxes');

COMMIT;

#
# Data for the `afxtranslate` table  (LIMIT 500,500)
#

INSERT INTO afxtranslate (id, el, uk) VALUES 
  (501,'Παρακράτηση φόρου','Rataining taxes'),
  (502,'Παράμετροι','Parameters'),
  (503,'Παράμετροι εφαρμογής','Application parameters'),
  (504,'Παρατηρήσεις','Notes'),
  (505,'ΠΑΡΤΕ ΑΝΤΙΓΡΑΦΑ ΑΣΦΑΛΕΙΑΣ','TAKE BACKUP'),
  (506,'Πατρώνυμο','Father name'),
  (507,'Πεδίο','Field'),
  (508,'πενήντα','fifty'),
  (509,'πεντακόσια','Five hundred'),
  (510,'Πέντε','Five'),
  (511,'Περιγραφή','Description'),
  (512,'Περιγραφή απόδοσης','Deposit description'),
  (513,'Περιγραφή αποδοχής - επιδόματος','Wages / Bonus description'),
  (514,'Περιγραφή αποδοχής / επιδόματος','Wages / Bonus description'),
  (515,'Περιγραφή θέσης','Post description'),
  (516,'Περιγραφή ιδιότητας','Status description'),
  (517,'Περιγραφή κατάστασης','Report description'),
  (518,'Περιγραφή κατηγορίας','Category description'),
  (519,'Περιγραφή κράτησης','Deduction description'),
  (520,'Περιγραφή μεταβλητής','Custom field description'),
  (521,'Περιγραφή μισθοδοσίας','Payroll description'),
  (522,'Περιγραφή οικογενειακής κατάστασης','Family status description'),
  (523,'Περιγραφή περιόδου','Period description'),
  (524,'Περιγραφή σταθεράς','Constant description'),
  (525,'Περιγραφή ταμείου','Insurance agency description'),
  (526,'Περιγραφή τμήματος','Department description'),
  (527,'Περιγραφή φύλλου','Sheet description'),
  (528,'Περιθώρια','Margins'),
  (529,'Περίοδοι μισθοδοσίας','Payroll periods'),
  (530,'Περίοδος μεταφοράς','Transfer period'),
  (531,'Περίοδος μισθοδοσίας','Payroll period'),
  (532,'Περιοχή','Area'),
  (533,'Περιοχή σελίδων','Page range'),
  (534,'Πίνακες','Tables'),
  (535,'Πλάτος','Width'),
  (536,'Πληκτρολογήστε αριθμούς σελίδων ή/και περιοχές σελίδων χωρισμένα με κόμματα','Enter page numbers or/and page range separeted by commas'),
  (537,'Πλήρες όνομα','Full name'),
  (538,'Πληροφορίες για την εφαρμογή','Information about the application'),
  (539,'Πληροφορίες εφαρμογής','Application information'),
  (540,'Πληρώθηκε?','Paid?'),
  (541,'Πληρωμένες καταστάσεις','Paid payrolls'),
  (542,'ΠΛΗΡΩΜΕΝΕΣ ΚΑΤΑΣΤΑΣΕΙΣ ΜΙΣΘΟΔΟΣΙΑΣ','PAID  PAYROLLS'),
  (543,'Πληρωμένες καταστάσεις μισθοδοσίας (ανά εργαζόμενο)','Paid payrolls (per employee)'),
  (544,'ΠΛΗΡΩΜΗ','PAYMENT'),
  (545,'Πληρωμή','Payment'),
  (546,'Πληρωμή μισθοδοσίας','Payroll payment'),
  (547,'Πληρωτέο','Payable'),
  (548,'Πόλη','City'),
  (549,'Ποσό','Money'),
  (550,'Ποσότητα','Quantity'),
  (551,'Πρέπει να επιλέξετε τουλάχιστον έναν υπάλληλο','You must select one employee at least'),
  (552,'Πρέπει να επιλέξετε τουλάχιστον μία κράτηση','You must select one deduction at least'),
  (553,'Πρέπει να επιλέξετε τουλάχιστον μία κράτηση για απόδοση','You must select one deduction at least'),
  (554,'Πρέπει να καταχωρήσετε τουλάχιστον την ονομαστική','You must enter the subjective'),
  (555,'Προβο&λή όλων','View &all'),
  (556,'Προβολή','View'),
  (557,'Προβολή  - επεξεργασία της επιλεγμένης εγγραφής','Edit - view current record'),
  (558,'Προβολή - επεξεργασία της επιλεγμένης εγγραφής','View-edit selected record'),
  (559,'Προβολή επιλογών','View options'),
  (560,'Προβολή όλων','View all'),
  (561,'Προβολή όλων των εγγραφών','View all records'),
  (562,'Προηγούμενη','Previous'),
  (563,'Προηγούμενη εγγραφή','Previous record'),
  (564,'Προηγούμενο φίλτρο','Previous filter'),
  (565,'Πρόκειται για κρίσιμη διαδικασία','Its a crucial step'),
  (566,'Πρόσβαση','Access'),
  (567,'Προσθ.','Add'),
  (568,'Προσθήκη','Add'),
  (569,'Προσθήκη νέας εγγραφής','Insert new record'),
  (570,'Πρόσληψη','Employment'),
  (571,'ΠΡΟΣΟΧΗ','CAUSION'),
  (572,'Προσοχή','Causion'),
  (573,'Προστατ. μέλη','Protect. memb.'),
  (574,'Προσφ.','Title'),
  (575,'Προσωπικά','Personal'),
  (576,'Πρώτ&η εγγραφή','&First record'),
  (577,'Πρώτη εγγραφή','First record'),
  (578,'Πτώσεις','Grammar'),
  (579,'Σ&ε επικάλυψη','&Cascade'),
  (580,'Σ&υρραφή','&Collate'),
  (581,'σαράντα','fourty'),
  (582,'Σειριακός αριθμός','Serial number'),
  (583,'Σελίδα','Page'),
  (584,'Σεπτεμβρίου','September'),
  (585,'ΣΕΡΡΕΣ','SERRES'),
  (586,'ΣΕΡΡΕΣ, ΤΗΛ.: (23210)-41206','SERRES, PHONE: (+3023210 41206)'),
  (587,'Σημειώσεις','Notes'),
  (588,'Σκούταρι - Σερρών (ΕΛΛΑΔΑ)','Skoutari - Serres (GREECE)'),
  (589,'Σταθερά στοιχεία','Static tables'),
  (590,'Σταθερές','Constants'),
  (591,'Στήλες','Columns'),
  (592,'Στοιχεία αποδοχής - επιδόματος','Wages / Bonus details'),
  (593,'Στοίχεια εκτύπωσης','Print details'),
  (594,'Στοιχεία εργαζομένου','Employee details'),
  (595,'Στοιχεία κατάστασης','Custom report details'),
  (596,'Στοιχεία κράτησης','Deduction details'),
  (597,'Στοιχεία μεταβλητής','Custom field details'),
  (598,'Στοιχεία μισθοδοσίας','Payroll details'),
  (599,'Στοιχεία φύλλου υπολογισμού','Payroll sheet details'),
  (600,'Στοιχεία χρήσης','Season details'),
  (601,'Στρογγυλοποίηση ποσών','Round digits'),
  (602,'Συγκεντρωτικά','Group'),
  (603,'ΣΥΓΚΕΝΤΡΩΤΙΚΑ ΜΙΣΘΟΔΟΣΙΑΣ','PAYROLL TOTALS'),
  (604,'Συγκεντρωτικά περιόδου ανά υπάλληλο','Period totals per employee'),
  (605,'Συγκεντρωτικά πληρωμένων καταστάσεων (ανά εργαζόμενο)','Paid payrolls totals (per employee)'),
  (606,'Συγκεντρωτικά πληρωμών','List of payments'),
  (607,'Συγκεντρωτική κατάσταση μισθοδοσιών','List of payrolls'),
  (608,'ΣΥΓΚΕΝΤΡΩΤΙΚΗ ΚΑΤΑΣΤΑΣΗ ΠΛΗΡΩΜΩΝ','LIST OF PAID PAYROLLS'),
  (609,'Σύζυγος','spouse'),
  (610,'Σύνδεση','Join'),
  (611,'Σύνθετο &φίλτρο','Advanced &filter'),
  (612,'ΣΥΝΟΛΙΚΕΣ ΚΡΑΤΗΣΕΙΣ','TOTAL DEDUCTIONS'),
  (613,'Συνολικές κρατήσεις','Total deductions'),
  (614,'Σύνολο','Total'),
  (615,'Σύνολο αποδοχών - επιδομάτων','Wages/Bonus total'),
  (616,'Σύνολο κρατήσεων','Total deductions'),
  (617,'Σύνολο κράτησης','Total for deduction'),
  (618,'ΣΥΝΟΛΟ ΜΙΣΘΟΔΟΣΙΑΣ','TOTAL FOR PAYROLL'),
  (619,'Σύνολο υπαλλήλων','Total employees'),
  (620,'Συνοπτική κατάσταση','Brief payroll list'),
  (621,'Συνοπτική κατάσταση μισθοδοσίας','Brief payroll list'),
  (622,'Σχεδιασμός','Design'),
  (623,'Σχεδιασμός καταστάσεων','Custom reports'),
  (624,'Σχετικά','About'),
  (625,'Σχηματισμός έκφρασης υπολογισμού','Build expresion'),
  (626,'Ταίριασμα','Match'),
  (627,'Τακτοποίηση παραθύρων σε επικάλυψη','Cascade windows'),
  (628,'Τακτοποίηση των ελαχιστοποιημένων παραθύρων','Tile minimized windows'),
  (629,'Ταξ.','Ord'),
  (630,'Ταχ. κώδ.','Area code'),
  (631,'Ταχ. κώδικας','Area code'),
  (632,'Τελεστής','Operator'),
  (633,'Τελευταία εγγραφή','&Last record'),
  (634,'Τελική ανάλυση','Final analysis'),
  (635,'τέσσερα','four'),
  (636,'Τέσσερις','Four'),
  (637,'τετρακόσια','Four hundred'),
  (638,'Τηλέφ. εργασ.','Work phone'),
  (639,'Τηλέφωνο','Phone'),
  (640,'Τιμή','Value'),
  (641,'Τίτλος','Title'),
  (642,'Τίτλος εργασίας','Work title'),
  (643,'Τμήμα','Department'),
  (644,'Τμήματα υπηρεσίας','Departments'),
  (645,'Το όνομα του φίλτρου υπάρχει','Filter name already exists'),
  (646,'Τομέας','Sector'),
  (647,'Τράπεζα','Bank'),
  (648,'Τρέ&χουσα σελίδα','&Current page'),
  (649,'Τρεις','Three'),
  (650,'τρεις χιλιάδες','Three thousand'),
  (651,'τρία','three'),
  (652,'τριακόσια','Three hundred'),
  (653,'Τριάντα','Thirty'),
  (654,'Τριάντα μία','Thirty-one'),
  (655,'Τσακιρίδης Σωτήριος','Tsakiridis Sotiris'),
  (656,'Τύπος υπολογισμού','Expression'),
  (657,'Υπάλληλοι','Employees'),
  (658,'υπάρχει ήδη','already exists'),
  (659,'Υπογρ.','Sign'),
  (660,'Υπόκειται σε ασφαλιστικές κρατήσεις','Has deductions for insurance offices'),
  (661,'Υπόκειται σε αυτοτελή φορολόγηση','Has autotelic taxes'),
  (662,'Υπόκειται σε παρακράτηση φόρου','Has tax deductions'),
  (663,'Υπολογισμός αποδοχών/επιδομάτων','Calculate wages/bonus'),
  (664,'Υποσημείωση','Footer'),
  (665,'Υπότιτλος','Subtitle'),
  (666,'Φάκελος αντιγραφής','Backup folder'),
  (667,'Φάκελος αντιγράφων ασφαλείας','Backup folder'),
  (668,'Φάκελος εκτελέσιμων','bin folder'),
  (669,'Φάκελος εκτελέσιμων αρχείων mysql','Mysql bin folder'),
  (670,'Φαξ','Fax'),
  (671,'Φεβρουαρίου','February'),
  (672,'Φίλτρο','Filter'),
  (673,'Φόρμα','Form'),
  (674,'Φορολογητέα εισοδήματα','Wages/bonus that has taxes'),
  (675,'Φόρος αυτοτελώς φορολογούμενων εισοδημάτων','Autotelic taxes'),
  (676,'Φόρτωμα φίλτρου','Load filter'),
  (677,'Φόρτωση αρχείου','Load file'),
  (678,'Φύλα υπολογισμού','Payroll sheets'),
  (679,'Φύλο','Sex'),
  (680,'Χάρακες','Rulers'),
  (681,'χίλια','One thousand'),
  (682,'Χρήσεις','Seasons'),
  (683,'Χρήση','Season'),
  (684,'Χρήστες','Users'),
  (685,'Χρήστης','User'),
  (686,'Οχτώ','Eight'),
  (687,'Δέκα','Ten'),
  (688,'Δώδεκα','Twelve'),
  (689,'ένδεκα','eleven'),
  (690,'τριάντα','thirty'),
  (691,'είκοσι','twenty'),
  (692,'δύο','two'),
  (693,'πέντε','five'),
  (694,'έξι','six'),
  (695,'επτά','seven'),
  (696,'εννέα','nine'),
  (697,'Σ&υρραφή','&Collate'),
  (698,'Δεν δώσατε κριτήρια','You must give criteria'),
  (699,'&ΟΚ','&OK'),
  (700,'Διαχειριστής εφαρμογής','Project administrator'),
  (701,'Εξ΄ ορισμού','Default'),
  (702,'Κατακόρυφα','Portrait'),
  (703,'Οριζόντια','Landscape'),
  (704,'Ναι','Yes'),
  (705,'Όχι','No'),
  (706,'Έκδοση Β.Δ. που απαιτείται','D.B. version required'),
  (707,'Εισαγωγή, επεξεργασία ή διαγραφή χρήσεων. Σημειώστε ότι δεν μπορείτε να διαγράψετε την χρήση στην οποία εργάζεστε!!!','Insert, edit or delete payroll seasons. Please note that you can\'t delete the working season!!!'),
  (708,'Πρέπει να εισάγετε τουλάχιστον μία χρήση!','You must insert at least one season!'),
  (709,'Οδηγός διαμόρφωσης μισθοδοσίας','Payroll setup wizard');

COMMIT;

#
# Data for the `misth_zpxrisi` table  (LIMIT 0,500)
#

INSERT INTO misth_zpxrisi (kodxrisi, descxrisi, startdate, enddate, maskposo, maskposot, maskdate, eteria, eteriadesc, address, tk, city, phone, fax, maskdate_e, maskposo_e, maskposot_e, afm, doy, round, prn_logo1, prn_logo2, prn_logo3, prn_logo4, prn_logo5, prn_sign1_prosf, prn_sign1_name, prn_sign2_prosf, prn_sign2_name, prn_sign3_prosf, prn_sign3_name, prn_notes1, prn_notes2, prn_notes3) VALUES 
  ('0001','Default season','2005-01-01','2006-12-31','###,##0.00','###,##0.00','dd/mm/yyyy','COMPANY NAME','Company description','Company address','','City','0000000','0000001','dd/mm/yyyy','###,##0.00','###,##0.00','','',2,'Logo1','Logo2','Logo3','Logo4','Logo5','Sign1 - Title','Sign1 - Name','Sign2 - Title','Sign2 - Name','Sign3 - Title','Sign3 - Name','Footer1','Footer2','Footer3');

COMMIT;

#
# Data for the `misth_zpperiod` table  (LIMIT 0,500)
#

INSERT INTO misth_zpperiod (kodperiod, kodxrisi, descperiod, orderno) VALUES 
  ('01','0001','Default period',1);

COMMIT;

#
# Data for the `misth_zpkat` table  (LIMIT 0,500)
#

INSERT INTO misth_zpkat (kodkat, kodxrisi, desckat) VALUES 
  ('01','0001','Default category');

COMMIT;

#
# Data for the `misth_zptmima` table  (LIMIT 0,500)
#

INSERT INTO misth_zptmima (kodtmima, kodxrisi, desctmima) VALUES 
  ('01','0001','Default department');

COMMIT;

#
# Data for the `misth_zpoikog` table  (LIMIT 0,500)
#

INSERT INTO misth_zpoikog (kodoikog, kodxrisi, descoikog) VALUES 
  ('01','0001','Married'),
  ('02','0001','Single'),
  ('03','0001','Divorced');

COMMIT;

#
# Data for the `misth_zpepidom` table  (LIMIT 0,500)
#

INSERT INTO misth_zpepidom (kodepidom, kodxrisi, descepidom, hasforo, expr, isasf, autoforos, hasasf) VALUES 
  ('SAL','0001','SALARY',1,NULL,0,0,0);

COMMIT;

#
# Data for the `misth_zpkrat` table  (LIMIT 0,500)
#

INSERT INTO misth_zpkrat (kodkrat, kodxrisi, desckrat, isforos, isasf, isautoforos) VALUES 
  ('PEN','0001','PENALTY',0,0,0),
  ('TAX','0001','TAXES',1,0,0);

COMMIT;

#
# Data for the `misth_zpyvar` table  (LIMIT 0,500)
#

INSERT INTO misth_zpyvar (kodyvar, kodxrisi, descyvar, expr) VALUES 
  ('SAL','0001','SALARY',NULL);

COMMIT;

