select  misth_ypal.kodypal, misth_ypal.kodxrisi, misth_ypal.surname, misth_ypal.name, misth_ypal.fathername, misth_ypal.klimakio, misth_ypal.exeldate from misth_ypal  WHERE misth_ypal.kodxrisi = :arg_kodxrisi And misth_ypal.exeldate <= :arg_date  