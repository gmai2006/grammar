select  misth_report_ypal.kodreport, misth_report_ypal.kodypal, misth_report_ypal.kodxrisi, misth_ypal.surname, misth_ypal.name, misth_ypal.fathername, misth_ypal.mitroo from misth_report_ypal, misth_ypal WHERE misth_report_ypal.kodypal = misth_ypal.kodypal AND misth_report_ypal.kodxrisi = misth_ypal.kodxrisi AND ( misth_report_ypal.kodreport = :arg_kodreport and misth_report_ypal.kodxrisi = :arg_kodxrisi  ) order by misth_ypal.surname ASC, misth_ypal.name ASC, misth_ypal.fathername ASC