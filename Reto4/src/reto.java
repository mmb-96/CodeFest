/**
 * 
 */

/**
 * @author manu
 *
 */
public class reto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] datosEntrada = { 
                { "AM8469868734", "07/11/2019", "09:40", "80", "15" },
				{ "AM1891138259", "07/11/2019", "18:20", "100", "7" },
				{ "AM2945601577", "13/11/2019", "18:20", "295", "26" },
				{ "AM5814783773", "09/11/2019", "19:30", "30", "18" },
				{ "AM0125818690", "08/11/2019", "20:30", "115", "18" },
				{ "AM4974134825", "14/11/2019", "17:40", "120", "2" },
				{ "AM0353236673", "11/11/2019", "16:20", "50", "5" },
				{ "AM8805944880", "11/11/2019", "17:10", "255", "7" },
				{ "AM9965762069", "12/11/2019", "17:40", "130", "18" },
				{ "AM9284502045", "14/11/2019", "10:00", "40", "15" },
				{ "AM3127897596", "09/11/2019", "11:40", "290", "29" },
				{ "AM0708760773", "14/11/2019", "09:20", "210", "25" },
				{ "AM9401283085", "13/11/2019", "12:40", "175", "18" },
				{ "AM2579720496", "11/11/2019", "18:20", "185", "16" },
				{ "AM1854382689", "14/11/2019", "20:30", "105", "24" },
				{ "AM1231804926", "11/11/2019", "13:10", "45", "23" },
				{ "AM3300077211", "14/11/2019", "14:20", "115", "12" },
				{ "AM5828920642", "12/11/2019", "12:00", "20", "4" },
				{ "AM1842441344", "07/11/2019", "11:30", "160", "2" },
				{ "AM4558500517", "14/11/2019", "15:30", "280", "23" },
				{ "AM4797311780", "09/11/2019", "18:20", "25", "7" },
				{ "AM8387562973", "07/11/2019", "13:50", "225", "18" },
				{ "AM0890820622", "14/11/2019", "10:30", "295", "7" },
				{ "AM2578290215", "12/11/2019", "16:20", "200", "8" },
				{ "AM2116159851", "07/11/2019", "19:10", "90", "3" },
				{ "AM2512284699", "10/11/2019", "19:30", "80", "29" },
				{ "AM8809351895", "14/11/2019", "18:40", "240", "28" },
				{ "AM1195497166", "11/11/2019", "20:10", "290", "17" },
				{ "AM9272599036", "13/11/2019", "16:10", "165", "10" },
				{ "AM1253271536", "14/11/2019", "17:30", "70", "29" },
				{ "AM7647730463", "06/11/2019", "11:50", "90", "13" },
				{ "AM7894169303", "11/11/2019", "13:20", "30", "6" },
				{ "AM0208740068", "14/11/2019", "17:10", "300", "11" },
				{ "AM0601359049", "08/11/2019", "19:50", "285", "27" },
				{ "AM7433915724", "06/11/2019", "10:40", "220", "21" },
				{ "AM2040314539", "09/11/2019", "11:20", "255", "14" },
				{ "AM6400035948", "13/11/2019", "11:20", "295", "25" },
				{ "AM1975707931", "06/11/2019", "20:40", "55", "20" },
				{ "AM1578463656", "11/11/2019", "19:40", "260", "7" },
				{ "AM0872143550", "09/11/2019", "15:40", "35", "25" },
				{ "AM4773888223", "13/11/2019", "10:40", "195", "21" },
				{ "AM4511728652", "07/11/2019", "17:40", "205", "5" },
				{ "AM7424034964", "08/11/2019", "09:20", "110", "12" },
				{ "AM4940266487", "12/11/2019", "14:30", "260", "13" },
				{ "AM2543036142", "10/11/2019", "14:30", "205", "21" },
				{ "AM6783151827", "10/11/2019", "13:10", "60", "6" },
				{ "EB9588452883", "13/11/2019", "19:40", "290", "19" },
				{ "EB0044400069", "13/11/2019", "18:40", "55", "3" },
				{ "EB8352924820", "11/11/2019", "09:20", "170", "29" },
				{ "EB9947711712", "10/11/2019", "16:40", "150", "27" },
				{ "EB6252613170", "12/11/2019", "11:30", "125", "28" },
				{ "EB8634875787", "09/11/2019", "19:30", "215", "25" },
				{ "EB1223395692", "06/11/2019", "16:30", "25", "20" },
				{ "EB1364530610", "07/11/2019", "17:10", "25", "22" },
				{ "EB7839008058", "06/11/2019", "18:00", "65", "20" },
				{ "EB7512236194", "11/11/2019", "09:10", "225", "6" },
				{ "EB7154525030", "13/11/2019", "17:50", "150", "28" },
				{ "EB7120179514", "12/11/2019", "15:30", "155", "8" },
				{ "EB8795807959", "10/11/2019", "09:30", "125", "6" },
				{ "EB1720702202", "12/11/2019", "16:30", "100", "24" },
				{ "EB5603671587", "12/11/2019", "11:20", "40", "10" },
				{ "EB8096334025", "09/11/2019", "11:30", "115", "15" },
				{ "EB5952625050", "08/11/2019", "20:20", "30", "19" },
				{ "EB4845507703", "06/11/2019", "15:30", "140", "25" },
				{ "EB3881084322", "11/11/2019", "14:20", "100", "18" },
				{ "EB7079328035", "07/11/2019", "16:20", "25", "26" },
				{ "EB3693684382", "14/11/2019", "17:40", "120", "22" },
				{ "EB9414215527", "12/11/2019", "15:30", "150", "29" },
				{ "EB2034854881", "10/11/2019", "11:10", "155", "19" },
				{ "HM5922914749", "08/11/2019", "12:10", "40", "29" },
				{ "HM3102016672", "10/11/2019", "18:30", "230", "12" },
				{ "HM7525327612", "06/11/2019", "16:10", "240", "17" },
				{ "HM9834552652", "14/11/2019", "15:10", "170", "13" },
				{ "HM0246603067", "11/11/2019", "18:40", "30", "28" },
				{ "HM5689247285", "06/11/2019", "09:50", "220", "28" },
				{ "HM4466822322", "09/11/2019", "16:50", "35", "18" },
				{ "HM1828730269", "08/11/2019", "19:00", "210", "11" },
				{ "HM9745559050", "08/11/2019", "12:00", "285", "24" },
				{ "HM8735818979", "06/11/2019", "12:10", "240", "9" },
				{ "HM4494125110", "07/11/2019", "19:40", "255", "13" },
				{ "HM3924924484", "12/11/2019", "20:10", "255", "13" },
				{ "HM6559133831", "08/11/2019", "11:10", "130", "25" },
				{ "HM7614585913", "11/11/2019", "15:40", "220", "2" },
				{ "HM6562439089", "08/11/2019", "17:30", "95", "8" },
				{ "HM3850374336", "09/11/2019", "20:00", "95", "27" },
				{ "HM1012535499", "11/11/2019", "10:50", "235", "15" },
				{ "HM0553235438", "10/11/2019", "13:10", "285", "15" },
				{ "HM7694148372", "10/11/2019", "09:10", "155", "17" },
				{ "HM4067308646", "13/11/2019", "16:50", "215", "4" },
				{ "HM7025310463", "08/11/2019", "16:20", "60", "27" },
				{ "HM5591288896", "06/11/2019", "09:20", "240", "4" },
				{ "HM0281364378", "09/11/2019", "13:50", "245", "13" },
				{ "HM3214893078", "09/11/2019", "11:40", "155", "26" },
				{ "HM4620528686", "10/11/2019", "17:50", "175", "10" },
				{ "HM9452966410", "12/11/2019", "13:30", "245", "12" },
				{ "HM3106698172", "08/11/2019", "12:10", "205", "25" },
				{ "HM2580842727", "06/11/2019", "17:10", "205", "14" },
				{ "HM7291150281", "10/11/2019", "20:30", "55", "18" },
				{ "HM7480286347", "12/11/2019", "20:30", "170", "21" },
				{ "HM2993478539", "11/11/2019", "20:50", "30", "18" },
				{ "HM1775559227", "06/11/2019", "09:40", "100", "5" },
				{ "HM1090921172", "07/11/2019", "14:30", "160", "12" },
				{ "HM6925592665", "06/11/2019", "10:30", "205", "11" },
				{ "HM5671077083", "06/11/2019", "09:10", "135", "5" },
				{ "HM4677145682", "13/11/2019", "16:30", "245", "23" },
				{ "HM5421819476", "08/11/2019", "16:40", "60", "3" },
				{ "HM2246020991", "06/11/2019", "17:00", "210", "13" },
				{ "HM1370750850", "14/11/2019", "20:20", "290", "6" },
				{ "HM4893946236", "14/11/2019", "13:40", "225", "2" },
				{ "HM2219242721", "12/11/2019", "14:40", "245", "18" },
				{ "HM8654779432", "10/11/2019", "14:30", "75", "29" },
				{ "HM8586190905", "13/11/2019", "11:30", "240", "18" },
				{ "HM1279754860", "08/11/2019", "09:40", "60", "22" },
				{ "HM6647178376", "11/11/2019", "15:40", "255", "17" },
				{ "HM5045501818", "06/11/2019", "20:20", "90", "10" },
				{ "HM1835930297", "06/11/2019", "14:30", "215", "16" },
				{ "HM3665832264", "07/11/2019", "09:10", "230", "14" },
				{ "HM7265700355", "08/11/2019", "09:00", "180", "8" },
				{ "JO7397841609", "14/11/2019", "10:40", "150", "15" },
				{ "JO1501731432", "14/11/2019", "16:00", "220", "19" },
				{ "JO3075364148", "06/11/2019", "09:40", "40", "19" },
				{ "JO6668939470", "08/11/2019", "12:40", "140", "7" },
				{ "JO0769834609", "06/11/2019", "16:50", "90", "8" },
				{ "JO6613601457", "11/11/2019", "12:00", "235", "13" },
				{ "JO0165599234", "07/11/2019", "12:00", "265", "14" },
				{ "JO1522300561", "12/11/2019", "13:20", "245", "16" },
				{ "JO9956014969", "13/11/2019", "09:50", "210", "23" },
				{ "JO8471412499", "10/11/2019", "09:30", "35", "25" },
				{ "JO7959499075", "07/11/2019", "18:20", "75", "17" },
				{ "JO4309511845", "08/11/2019", "17:00", "195", "15" },
				{ "JO0540810319", "08/11/2019", "16:30", "25", "13" },
				{ "JO1652793560", "07/11/2019", "16:20", "115", "4" },
				{ "JO5948839793", "14/11/2019", "13:40", "170", "25" },
				{ "JO9862532087", "11/11/2019", "13:00", "205", "12" },
				{ "JO3379516760", "12/11/2019", "16:40", "170", "5" },
				{ "JO5799919774", "12/11/2019", "18:40", "220", "19" },
				{ "JO7536622142", "13/11/2019", "12:30", "80", "9" },
				{ "JO4124924116", "09/11/2019", "13:00", "20", "17" },
				{ "JO6211883274", "10/11/2019", "12:20", "175", "12" },
				{ "JO4545010424", "14/11/2019", "17:30", "45", "5" },
				{ "JO6622915140", "11/11/2019", "12:10", "145", "2" },
				{ "JO0432458246", "14/11/2019", "13:10", "245", "9" },
				{ "JO5321896435", "11/11/2019", "17:30", "165", "3" },
				{ "JO5284418402", "11/11/2019", "20:30", "60", "15" },
				{ "JO4004951067", "13/11/2019", "20:40", "55", "22" },
				{ "JO4249491906", "11/11/2019", "18:10", "105", "26" },
				{ "JO7357980330", "14/11/2019", "16:40", "40", "20" },
				{ "JO2176738136", "09/11/2019", "18:10", "230", "19" },
				{ "JO1036174928", "14/11/2019", "09:40", "35", "29" },
				{ "JO0472070778", "06/11/2019", "16:20", "160", "7" },
				{ "JO7963878159", "06/11/2019", "14:20", "295", "28" },
				{ "JO3671138439", "06/11/2019", "16:10", "45", "5" },
				{ "JO8217877829", "14/11/2019", "12:40", "280", "22" },
				{ "JO5939056312", "07/11/2019", "10:30", "20", "29" },
				{ "JO7596297896", "14/11/2019", "15:30", "110", "25" },
				{ "JO7984810403", "11/11/2019", "15:20", "260", "2" },
				{ "JO7365133335", "12/11/2019", "18:20", "105", "27" },
				{ "JO0196723256", "09/11/2019", "10:30", "160", "2" },
				{ "JO9785105574", "06/11/2019", "11:10", "15", "3" },
				{ "JO4740257114", "11/11/2019", "09:20", "115", "24" },
				{ "JO3565194019", "06/11/2019", "12:40", "270", "6" },
				{ "JO2383963499", "09/11/2019", "11:30", "85", "12" },
				{ "JO3434480456", "10/11/2019", "17:20", "220", "6" },
				{ "JO5393765020", "10/11/2019", "20:10", "105", "27" },
				{ "JO9590926868", "12/11/2019", "09:20", "95", "22" },
				{ "MM4811466547", "11/11/2019", "10:40", "160", "6" },
				{ "MM7834357988", "08/11/2019", "20:20", "220", "29" },
				{ "MM0802153203", "09/11/2019", "18:10", "115", "8" },
				{ "MM0678312729", "06/11/2019", "14:30", "20", "14" },
				{ "MM9285433974", "09/11/2019", "17:00", "255", "7" },
				{ "MM5153267484", "07/11/2019", "10:50", "300", "5" },
				{ "MM6734918058", "08/11/2019", "11:30", "105", "3" },
				{ "MM0814400270", "08/11/2019", "15:20", "115", "28" },
				{ "MM5898234032", "06/11/2019", "18:10", "130", "2" },
				{ "MM8951269158", "11/11/2019", "11:20", "85", "27" },
				{ "MM0601879766", "11/11/2019", "15:10", "215", "20" },
				{ "MM5414363207", "09/11/2019", "17:20", "175", "20" },
				{ "MM6722395239", "08/11/2019", "19:30", "240", "11" },
				{ "MM4043392086", "11/11/2019", "20:30", "20", "6" },
				{ "MM8208867735", "11/11/2019", "18:40", "135", "21" },
				{ "MM1678140238", "13/11/2019", "15:00", "235", "25" },
				{ "MM0343253710", "09/11/2019", "11:20", "150", "20" },
				{ "MM2142402170", "06/11/2019", "11:00", "175", "8" },
				{ "MM7510897109", "13/11/2019", "11:40", "80", "14" },
				{ "MM4050989947", "12/11/2019", "17:30", "300", "27" },
				{ "MM8373105770", "06/11/2019", "16:40", "100", "12" },
				{ "MM4898463166", "07/11/2019", "13:30", "185", "29" },
				{ "MM0134610172", "09/11/2019", "14:30", "35", "5" },
				{ "MM3857840546", "14/11/2019", "10:40", "235", "18" },
				{ "MM7913206978", "09/11/2019", "14:10", "35", "15" },
				{ "MM9153645744", "14/11/2019", "14:20", "240", "11" },
				{ "MM4017295013", "11/11/2019", "12:40", "235", "10" },
				{ "MM6545735189", "11/11/2019", "09:30", "20", "22" },
				{ "ZA4304331865", "09/11/2019", "20:10", "900", "18" },
				{ "ZA7602977167", "14/11/2019", "15:50", "1800", "5" },
				{ "ZA7115852053", "10/11/2019", "10:40", "2550", "25" },
				{ "ZA0472730062", "07/11/2019", "11:30", "1100", "3" },
				{ "ZA9209066351", "14/11/2019", "17:40", "1150", "18" },
				{ "ZA1388004429", "09/11/2019", "11:20", "800", "27" },
				{ "ZA5690237899", "08/11/2019", "11:50", "250", "24" },
				{ "ZA4404116146", "09/11/2019", "12:30", "1500", "6" },
				{ "ZA4504923499", "10/11/2019", "18:40", "1400", "20" },
				{ "ZA9755149702", "09/11/2019", "20:30", "1700", "23" },
				{ "ZA5023487435", "08/11/2019", "16:30", "1250", "9" },
				{ "ZA8937851344", "08/11/2019", "19:30", "1000", "24" },
				{ "ZA1246799643", "12/11/2019", "10:40", "600", "3" },
				{ "ZA3752729797", "12/11/2019", "20:20", "1850", "18" },
				{ "ZA5907190959", "07/11/2019", "14:50", "650", "15" },
				{ "ZA5644027166", "11/11/2019", "14:40", "1350", "12" },
				{ "ZA9572528663", "08/11/2019", "13:20", "1900", "5" },
				{ "ZA5936545773", "13/11/2019", "14:40", "1200", "29" },
				{ "ZA3300523647", "10/11/2019", "09:30", "700", "24" },
				{ "ZA4624933930", "07/11/2019", "11:10", "950", "15" },
				{ "ZA1345635392", "12/11/2019", "15:20", "2150", "24" },
				{ "ZA6312426083", "07/11/2019", "20:30", "2950", "15" },
				{ "ZA1338132740", "06/11/2019", "19:00", "850", "12" },
				{ "ZA1186380083", "10/11/2019", "17:40", "600", "23" },
				{ "ZA7012016967", "13/11/2019", "09:40", "1950", "6" },
				{ "ZA7785142003", "12/11/2019", "11:40", "700", "28" },
				{ "ZA3120971133", "07/11/2019", "11:50", "1250", "16" },
				{ "ZA6135779519", "06/11/2019", "18:20", "800", "29" },
				{ "ZA5232380114", "10/11/2019", "11:50", "2250", "27" },
				{ "ZA5296110799", "10/11/2019", "15:10", "300", "20" },
				{ "ZA6832875096", "07/11/2019", "13:50", "3000", "6" },
				{ "ZA9692957655", "09/11/2019", "15:30", "1800", "3" },
				{ "ZA4452662022", "14/11/2019", "13:10", "500", "9" },
				{ "ZA5393754855", "09/11/2019", "16:10", "2300", "8" },
				{ "ZA9278598612", "10/11/2019", "19:50", "950", "25" },
				{ "ZA3682673381", "12/11/2019", "09:20", "900", "6" },
				{ "ZA1170336227", "09/11/2019", "10:50", "2500", "20" },
				{ "ZA6840187504", "10/11/2019", "15:10", "2250", "16" },
				{ "ZA9274747280", "07/11/2019", "09:00", "2050", "4" },
				{ "ZA8697155347", "13/11/2019", "09:20", "150", "17" },
				{ "ZA1202280590", "06/11/2019", "12:30", "1200", "22" },
				{ "ZA3235806832", "08/11/2019", "20:00", "2600", "5" },
				{ "ZA8141810401", "06/11/2019", "20:30", "1200", "10" }
		};
		
		System.out.println(datosEntrada.dtoString());

	}

}
