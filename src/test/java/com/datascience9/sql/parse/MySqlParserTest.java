package com.datascience9.sql.parse;

import com.datascience9.mysql.MySqlHelper;
import com.datascience9.mysql.parse.MySqlParser;
import java.util.logging.Logger;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.tree.ParseTree;

public class MySqlParserTest {
	private final static Logger logger = Logger.getLogger(MySqlParserTest.class.getName());

	public static void main(String[] args) throws Exception {
//		runFromResource("/selecttest.query");
//		String query = "SELECT *, oc_order.*, or_order.store_name as test3, invoice_no as test4, (SELECT os.name FROM oc_order_status os WHERE os.order_status_id = o.order_status_id AND os.language_id = o.language_id) AS order_status, (select language_id from oc_option_value_description) as another FROM oc_order o WHERE o.order_id = 'param0'";
//		String query = "SELECT oc_address.*, SUM(address_id) as total, customer_id, CURRENT_DATE as current, TRIM(city) FROM oc_address WHERE customer_id = 'param0' AND address_id = param1 LIMIT 1";
//    String query = "SELECT * FROM oc_address WHERE customer_id = 'param0' AND address_id = param1 LIMIT 1";
//    String query = "SELECT * FROM oc_address WHERE customer_id = 'param0' AND address_id > 'param1' LIMIT 1";
//		String query = "SELECT * FROM oc_address WHERE customer_id = 'param0' AND address_id in ( 'param1', 'param2', 'param3') LIMIT 1";
//		String query = "select  misth_zpepidom.descepidom, misth_final_ypal_epidom.poso, misth_final_ypal_epidom.notes, sum(misth_final_ypal_epidom.poso) as sum_poso from misth_final_ypal_epidom, misth_zpepidom, misth_final, misth_final_ypal join misth_final_ypal_epidom on misth_final_ypal_epidom.kodepidom = misth_zpepidom.kodepidom join misth_final_ypal_epidom on misth_final_ypal_epidom.kodxrisi = misth_zpepidom.kodxrisi join misth_final_ypal on misth_final_ypal.kodfinal = misth_final_ypal_epidom.kodfinal join misth_final_ypal on misth_final_ypal.kodypal = misth_final_ypal_epidom.kodypal join misth_final_ypal on misth_final_ypal.kodxrisi = misth_final_ypal_epidom.kodxrisi join misth_final on misth_final.kodfinal = misth_final_ypal.kodfinal join misth_final on misth_final.kodxrisi = misth_final_ypal.kodxrisi where misth_final_ypal_epidom.kodxrisi = :arg_kodxrisi and misth_final_ypal_epidom.kodypal = :arg_kodypal and misth_final_ypal.plirdate >= :arg_fromdate and misth_final_ypal.plirdate <= :arg_todate  order by misth_final_ypal_epidom.aa ASC";
//			String query = "select  misth_final_ypal_epidom.poso, misth_zpepidom.descepidom, misth_final_ypal_epidom.kodepidom, misth_final_ypal_epidom"
//					+ ".kodxrisi, sum(misth_final_ypal_epidom.poso) as cm_sumposo from misth_final_ypal_epidom, misth_zpepidom, misth_final_ypal join misth_final_ypal_epidom on misth_final_ypal_epidom.kodepidom = misth_zpepidom.kodepidom join misth_final_ypal_epidom on misth_final_ypal_epidom.kodxrisi = misth_zpepidom.kodxrisi join misth_final_ypal on misth_final_ypal.kodfinal = misth_final_ypal_epidom.kodfinal join misth_final_ypal on misth_final_ypal.kodypal = misth_final_ypal_epidom.kodypal join misth_final_ypal on misth_final_ypal.kodxrisi = misth_final_ypal_epidom.kodxrisi where misth_final_ypal_epidom.kodxrisi = :arg_kodxrisi and misth_final_ypal_epidom.kodypal = :arg_kodypal and misth_zpepidom.isasf = 1 and misth_final_ypal.plirdate is not null  order by misth_zpepidom.descepidom ASC";
//		String query = "select  misth_zpkrat.kodkrat, misth_zpkrat.kodxrisi, misth_zpkrat.desckrat, 0 as issel from misth_zpkrat  where misth_zpkrat.kodxrisi = :arg_kodxrisi  order by misth_zpkrat.desckrat ASC";
//		String query = "SELECT  misth_ypal.surname ,\n"
//				+ "           misth_ypal.name ,\n"
//				+ "           misth_ypal.fathername ,\n"
//				+ "           misth_ypal.mitroo ,\n"
//				+ "           misth_ypal.adt ,\n"
//				+ "           misth_ypal.afm ,\n"
//				+ "           misth_ypal.doy ,\n"
//				+ "           misth_ypal.bankno ,\n"
//				+ "           misth_ypal.bank ,\n"
//				+ "           misth_ypal.childs ,\n"
//				+ "           misth_ypal.prostmeli ,\n"
//				+ "           misth_ypal.klimakio ,\n"
//				+ "           misth_ypal.bathmos ,\n"
//				+ "           misth_ypal.klados ,\n"
//				+ "           misth_ypal.birthdate ,\n"
//				+ "           misth_ypal.hireddate ,\n"
//				+ "           misth_zpoikog.descoikog ,\n"
//				+ "           misth_zpidikot.descidikot ,\n"
//				+ "           misth_zpthesi.descthesi ,\n"
//				+ "           misth_zptmima.desctmima ,\n"
//				+ "           misth_final.kodfinal ,\n"
//				+ "\t\t\t  misth_final.aa,\n"
//				+ "           misth_final.descfinal ,\n"
//				+ "           misth_final.datefinal ,\n"
//				+ "\t\t\t  misth_final.title,\n"
//				+ "           misth_final_ypal.kodypal ,\n"
//				+ "           misth_zptamio.desctamio  \n"
//				+ "        FROM misth_ypal LEFT OUTER JOIN misth_zpoikog ON misth_ypal.kodoikog = misth_zpoikog.kodoikog AND misth_ypal.kodxrisi = "
//				+ "misth_zpoikog.kodxrisi LEFT OUTER JOIN misth_zpidikot ON misth_ypal.kodidikot = misth_zpidikot.kodidikot AND misth_ypal.kodxrisi = misth_zpidikot.kodxrisi LEFT OUTER JOIN misth_zpthesi ON misth_ypal.kodthesi = misth_zpthesi.kodthesi AND misth_ypal.kodxrisi = misth_zpthesi.kodxrisi LEFT OUTER JOIN misth_zptmima ON misth_ypal.kodtmima = misth_zptmima.kodtmima AND misth_ypal.kodxrisi = misth_zptmima.kodxrisi LEFT OUTER JOIN misth_zptamio ON misth_ypal.kodtamio = misth_zptamio.kodtamio AND misth_ypal.kodxrisi = misth_zptamio.kodxrisi ,\n"
//				+ "           misth_final_ypal ,\n"
//				+ "           misth_final    \n"
//				+ "        WHERE ( misth_final_ypal.kodfinal = misth_final.kodfinal ) and          ( misth_final_ypal.kodxrisi = misth_final.kodxrisi ) and          ( misth_final_ypal.kodypal = misth_ypal.kodypal ) and          ( misth_final_ypal.kodxrisi = misth_ypal.kodxrisi ) and          ( ( misth_final_ypal.kodfinal = :arg_kodfinal ) and          ( misth_final_ypal.kodxrisi = :arg_kodxrisi ) ) \n"
//				+ "        ORDER BY misth_ypal.surname          ASC,\n"
//				+ "           misth_ypal.name          ASC,\n"
//				+ "           misth_ypal.fathername          ASC  ";
//		String query = "select  if(misth_final.datefinal > 300, 0, 1) as test4, CURRENT_DATE() as date1, TRUNCATE(misth_final.kodfinal, 2), "
//				+ "DATE(misth_final_ypal.kodypal), "
//				+ "misth_final_ypal"
//				+ ".plirdate, MAX(TEST) AS max1, if(isnull(misth_final_ypal.plirdate), 0, 1) as cm_paid from misth_final, misth_final_ypal join "
//				+ "misth_final_ypal on misth_final_ypal.kodfinal = misth_final.kodfinal join misth_final_ypal on misth_final_ypal.kodxrisi = misth_final.kodxrisi where misth_final_ypal.kodypal = :arg_kodypal and misth_final_ypal.kodxrisi = :arg_kodxrisi  order by misth_final.datefinal ASC";

//		final String query = "select  afxfilterd.kodfilterd, afxfilterd.kodfilter, afxfilterd.pedio, afxfilterd.telestis, \n"
//				+ "afxfilterd.timi, afxfilterd.joint from afxfilterd  where afxfilterd.kodfilter = :kodfilter  \n"
//				+ "order by afxfilterd.kodfilterd ASC";

//		String query = "SELECT o.lastname, (SELECT os.name FROM oc_order_status os WHERE os.order_status_id = o.order_status_id AND os.language_id = o"
//				+ ".language_id) AS order_status FROM oc_order o WHERE o.order_id = :param0";

		final String query = "select  misth_zpepidom.descepidom, misth_final_ypal_epidom.poso, misth_final_ypal_epidom.notes, sum"
				+ "(misth_final_ypal_epidom.poso) as sum_poso from misth_final_ypal_epidom, misth_zpepidom, misth_final, misth_final_ypal join misth_final_ypal_epidom on misth_final_ypal_epidom.kodepidom = misth_zpepidom.kodepidom join misth_final_ypal_epidom on misth_final_ypal_epidom.kodxrisi = misth_zpepidom.kodxrisi join misth_final_ypal on misth_final_ypal.kodfinal = misth_final_ypal_epidom.kodfinal join misth_final_ypal on misth_final_ypal.kodypal = misth_final_ypal_epidom.kodypal join misth_final_ypal on misth_final_ypal.kodxrisi = misth_final_ypal_epidom.kodxrisi join misth_final on misth_final.kodfinal = misth_final_ypal.kodfinal join misth_final on misth_final.kodxrisi = misth_final_ypal.kodxrisi where misth_final_ypal_epidom.kodxrisi = :arg_kodxrisi and misth_final_ypal_epidom.kodypal = :arg_kodypal and misth_final_ypal.plirdate >= :arg_fromdate and misth_final_ypal.plirdate <= :arg_todate  order by misth_final_ypal_epidom.aa ASC";

//		final String query = "select  misth_final.datefinal, misth_final.descfinal, misth_final.kodfinal, misth_final_ypal.kodypal, misth_final_ypal"
//				+ ".plirdate, if(isnull(misth_final_ypal.plirdate), 0, 1) as cm_paid from misth_final as o, misth_final_ypal join misth_final_ypal on "
//				+ "misth_final_ypal.kodfinal = misth_final.kodfinal join misth_final_ypal on misth_final_ypal.kodxrisi = misth_final.kodxrisi where misth_final_ypal.kodypal = :arg_kodypal and misth_final_ypal.kodxrisi = :arg_kodxrisi  order by misth_final.datefinal ASC";

//		String query = "SELECT * FROM oc_address WHERE customer_id = :param0 AND address_id in (:param1, :param2) LIMIT 1";

//		String query = "select  misth_zpepidom.descepidom, misth_final_ypal_epidom.poso, misth_final_ypal_epidom.notes, sum(misth_final_ypal_epidom"
//				+ ".poso) as sum_poso from misth_final_ypal_epidom, misth_zpepidom, misth_final, misth_final_ypal join misth_final_ypal_epidom on misth_final_ypal_epidom.kodepidom = misth_zpepidom.kodepidom join misth_final_ypal_epidom on misth_final_ypal_epidom.kodxrisi = misth_zpepidom.kodxrisi join misth_final_ypal on misth_final_ypal.kodfinal = misth_final_ypal_epidom.kodfinal join misth_final_ypal on misth_final_ypal.kodypal = misth_final_ypal_epidom.kodypal join misth_final_ypal on misth_final_ypal.kodxrisi = misth_final_ypal_epidom.kodxrisi join misth_final on misth_final.kodfinal = misth_final_ypal.kodfinal join misth_final on misth_final.kodxrisi = misth_final_ypal.kodxrisi where misth_final_ypal_epidom.kodxrisi = :arg_kodxrisi and misth_final_ypal_epidom.kodypal = :arg_kodypal and misth_final_ypal.plirdate >= :arg_fromdate and misth_final_ypal.plirdate <= :arg_todate  order by misth_final_ypal_epidom.aa ASC";

//		String query = "select  misth_zpkrat.kodkrat, misth_zpkrat.kodxrisi, misth_zpkrat.desckrat, 0 as issel from misth_zpkrat  where misth_zpkrat.kodxrisi = :arg_kodxrisi  order by misth_zpkrat.desckrat ASC";

//		String query = "SELECT * FROM oc_address WHERE customer_id = :param0 AND address_id = :param1 LIMIT 1";
//		final String query = "SELECT * FROM oc_address WHERE customer_id = :param0 AND address_id in (:param1, :param2) LIMIT 1";
//		final String query = "select  misth_zpkrat.desckrat, misth_final_ypal_krat.poso, misth_final_ypal_krat.notes, sum(misth_final_ypal_krat.poso) as sum_poso from misth_final_ypal_krat, misth_zpkrat, misth_final, misth_final_ypal join misth_final_ypal_krat on misth_final_ypal_krat.kodkrat = misth_zpkrat.kodkrat join misth_final_ypal_krat on misth_final_ypal_krat.kodxrisi = misth_zpkrat.kodxrisi join misth_final_ypal on misth_final_ypal.kodfinal = misth_final_ypal_krat.kodfinal join misth_final_ypal on misth_final_ypal.kodypal = misth_final_ypal_krat.kodypal join misth_final_ypal on misth_final_ypal.kodxrisi = misth_final_ypal_krat.kodxrisi join misth_final on misth_final.kodfinal = misth_final_ypal.kodfinal join misth_final on misth_final.kodxrisi = misth_final_ypal.kodxrisi where misth_final_ypal_krat.kodxrisi = :arg_kodxrisi and misth_final_ypal_krat.kodypal = :arg_kodypal and misth_final_ypal.plirdate >= :arg_fromdate and misth_final_ypal.plirdate <= :arg_todate  order by misth_final_ypal_krat.aa ASC";

//		final String query = "select misth_fylo_ypal.kodfylo, misth_fylo_ypal.kodypal, misth_fylo_ypal.kodxrisi, misth_ypal.surname, misth_ypal.name, "
//				+ "misth_ypal.fathername from misth_fylo_ypal, misth_ypal join misth_fylo_ypal on misth_fylo_ypal.kodypal = misth_ypal.kodypal join misth_fylo_ypal on misth_fylo_ypal.kodxrisi = misth_ypal.kodxrisi where misth_fylo_ypal.kodfylo = ? and misth_fylo_ypal.kodxrisi = ? order by misth_ypal.surname ASC, misth_ypal.name ASC, misth_ypal.fathername ASC";
//		final String query = "select  misth_zpkrat.desckrat, misth_final_ypal_krat.kodkrat, misth_final_ypal_krat.kodxrisi, misth_final_ypal_krat.poso, sum(misth_final_ypal_krat.poso) as cm_sumposo from misth_final_ypal_krat, misth_zpkrat, misth_final_ypal WHERE misth_zpkrat.kodkrat = misth_final_ypal_krat.kodkrat AND misth_zpkrat.kodxrisi = misth_final_ypal_krat.kodxrisi AND misth_final_ypal.kodfinal = misth_final_ypal_krat.kodfinal AND misth_final_ypal.kodypal = misth_final_ypal_krat.kodypal AND misth_final_ypal.kodxrisi = misth_final_ypal_krat.kodxrisi AND ( misth_final_ypal_krat.kodypal = :arg_kodypal and misth_final_ypal_krat.kodxrisi = :arg_kodxrisi and misth_zpkrat.isforos = 1 and misth_zpkrat.isautoforos = 0 and misth_final_ypal.plirdate is not null  ) order by misth_zpkrat.desckrat ASC";
//		final String query = "select  misth_zpxrisi.kodxrisi, misth_zpxrisi.descxrisi from misth_zpxrisi  WHERE misth_zpxrisi.kodxrisi not like "
//				+ ":arg_kodxrisi  order by misth_zpxrisi.kodxrisi ASC";
		runFromString(query);
	}

	private static void runFromResource(String path) throws Exception {
		MySqlParser parser = MySqlHelper.getMySqlParser(MySqlParserTest.class.getResourceAsStream(path));
		ParseTree tree = parser.root();
		Trees.inspect(tree, parser);
	}

	private static void runFromString(String query) {
		MySqlParser parser = MySqlHelper.getMySqlParser(query);
		ParseTree tree = parser.root();
		Trees.inspect(tree, parser);
	}
}