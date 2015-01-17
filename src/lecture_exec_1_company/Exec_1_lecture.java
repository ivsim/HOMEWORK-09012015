package lecture_exec_1_company;

import java.util.ArrayList;

/*
 *  Направете клас Company с 4 полета: име адрес, брой служители и web страница
	Направете List с 3 произволни компании
	Намерете Компанията с най-много служители и я премахнете от списъка
	Добавете още 2 компании
	Добавете още 1 компания на мястото на компанията с най-дълго име
 */

public class Exec_1_lecture {

	public static void main(String[] args) {

		Company apple = new Company ("Apple", "USA, Cupertino", 234, "www.apple.com");
		Company microsoft = new Company ("MSoft", "USA, Seattle", 15, "www.ms.com");
		Company vereja = new Company ("Vereja", "BG, Stara Zagora", 190, "www.vereja.bg" );
		Company monbat = new Company ("Monbat", "BG, Montana", 101, "www.monbat.bg");
		
		ArrayList<Company> companies = new ArrayList<Company>();
		
		companies.add(apple);
		companies.add(microsoft);
		companies.add(vereja);
		companies.add(monbat);
		
		int max = 0;
		int index = 0;
		int indexMax = 0;
		
		for (Company x: companies){
			
			if (x.numEmployee > max){
				max = x.numEmployee;
				indexMax = index;
			}
			
			index++;			
		}
		
		(companies.get(indexMax)).printEmployee();
		
		companies.remove(indexMax);//removing member with max num of employees...
		
		companies.add(new Company("NEXT", "USA, LA", 125, "www.next.com"));
		companies.add(new Company("Kalashnikov", "Russia, Moscow", 1257, "www.kal.com"));
		
		max = 0; indexMax = 0; index = 0;
		
		for (Company x: companies){
			
			if (x.name.length() > max){
				max = x.name.length();
				indexMax = index;
			}
			
			index++;			
		}
		
		System.out.println(companies.get(indexMax).name);
		
		companies.set(indexMax, new Company ("Mercedes", "Germany, Stuttgart", 126, "www.merc.de"));
		
		for (Company x: companies){
			System.out.println(x.name);
		}		
		
	}

}
