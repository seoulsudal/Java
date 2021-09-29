package phone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

import phone.MenuViewer;

public class PhoneBookManager {

	private final File dataFile = new File("PhoneBook.dat");
	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();
	
	static PhoneBookManager inst = null;
	PhoneInfo info = new PhoneInfo();
	
	public static PhoneBookManager createManagerInst() {
		if(inst == null) {
			inst = new PhoneBookManager();
		}
		return inst;
	}
	
	private PhoneBookManager() {
		readFromFile();
	}
	
	private PhoneInfo readFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo readUnivFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("전공 : ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.println("학년 : ");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	private PhoneInfo readCompanyFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("회사 : ");
		String company = MenuViewer.keyboard.nextLine();
		MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}
	
	public void inputData() throws MenuChoiceException{
		System.out.println("데이터 입력을 시작합니다...");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> ");
		
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		
		if(choice < INPUT_SELECT.NORMAL || choice > INPUT_SELECT.COMPANY) {
			throw new MenuChoiceException(choice);
		}
		switch(choice) {
		case INPUT_SELECT.NORMAL :
			info = readFriendInfo();
			break;
		case INPUT_SELECT.UNIV :
			info = readUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY :
			info = readCompanyFriendInfo();
			break;
		}
		
		boolean isAdded = infoStorage.add(info);
		if (isAdded == true) {
			System.out.println("데이터 입력이 완료되었습니다. \n");
		}
		else {
			System.out.println("이미 저장된 데이터입니다. \n");
		}
	}
	
	 public void searchData() {
		System.out.println("데이터 검색을 시작합니다..");
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		PhoneInfo info = search(name);
		if (info == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}
		else {
			info.showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}
	
	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다...");
		System.out.print("이름 :");
		String name = MenuViewer.keyboard.nextLine();
		
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while(itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if(name.compareTo(curInfo.getName()) == 0) {
				itr.remove();
				System.out.println("데이터 삭제가 완료되었습니다. \n");
				return;
			}
		}
		System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
	}
	
	private PhoneInfo search(String name) {
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while(itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if(name.compareTo(curInfo.getName()) == 0) {
				return curInfo;
			}
		}
		return null;
	}
	
	public void storeToFile() {
		try {
			FileOutputStream file = new FileOutputStream(dataFile);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			Iterator<PhoneInfo> itr = infoStorage.iterator();
			while(itr.hasNext()) {
				out.writeObject(itr.next());
			}
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readFromFile() {
		try {
			FileInputStream file = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(file);
			
			while(true) {
				PhoneInfo info = (PhoneInfo) in.readObject();
				if(info == null) {
					break;
				}
				infoStorage.add(info);
			}
			in.close();
		} catch (IOException e) {
			return;
		} catch (ClassNotFoundException e) {
			return;
		}
	}
	
}
