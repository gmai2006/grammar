SELECT  misth_zpkrat.desckrat ,
           sum(misth_final_ypal_krat.poso) as sum_poso
    
        FROM misth_final_ypal_krat ,
           misth_zpkrat     
        WHERE ( misth_final_ypal_krat.kodkrat = misth_zpkrat.kodkrat ) and          ( misth_zpkrat.kodxrisi = misth_final_ypal_krat.kodxrisi ) and          ( ( misth_final_ypal_krat.kodfinal = :arg_kodfinal ) and          ( misth_final_ypal_krat.kodxrisi = :arg_kodxrisi ) ) 
        GROUP BY misth_zpkrat.kodkrat ,
           misth_zpkrat.desckrat   