import java.util.Arrays;
import java.util.Scanner;

public class Sales {
	private int department;				// 부서 갯수
	private final int SEPARATE = 4;		// 분기
	private String[] departmentName;	// 부서 명
	private int[][] takes; 				// 매출액
	
	// 기본 생성자
	public Sales() {
		department = 5;
		departmentName = new String[department];
		takes = new int[department][SEPARATE];
		for(int i = 0; i < department; i++) {
			departmentName[i] = "영업" + (i+1) + "팀";
		}
	}
	
	// 부서수, 부서명, 매출액 받는 생성자
	public Sales(int department, String[] departmentName, int[][] takes) {
		this.department = department;
		this.departmentName = departmentName;
		this.takes = takes;
	}
	
	// 부서별 전체 매출액 출력
	public void printEachDepartmentTotal() {
		int[] total = new int[department];
		
		for(int i = 0; i < department; i++) {
			for(int j = 0 ; j < SEPARATE; j++) {
				total[i] += takes[i][j];
			}
		}
		
		for(int i = 0; i < department; i++)
		{
			System.out.println(departmentName[i] + " 전체 매출액 : " + total[i]);
		}
	}
	
	// 분기별 전체 매출액 출력
	public void printEachSeparateTotal() {
		int[] total = new int[SEPARATE];
		
		for(int i = 0; i < SEPARATE; i++) {
			for(int j = 0; j < department; j++) {
				total[i] += takes[j][i];
			}
		}
		
		for(int i = 0; i < SEPARATE; i++)
		{
			System.out.println((i+1) + "/4분기 전체 매출액 : " + total[i]);
		}
	}
	
	// 분기별 전체의 평균 매출액 출력
	public void printAverageSeparateTotal() {
		int[] total = new int[SEPARATE];
		double[] average = new double[SEPARATE];
		
		for(int i = 0; i < SEPARATE; i++) {
			for(int j = 0; j < department; j++) {
				total[i] += takes[j][i];
			}
			average[i] = total[i] / (department * 1.0);
		}
		
		for(int i=0; i<SEPARATE; i++)
		{
			System.out.printf("%d/4분기 전체 평균 매출액 : %.2f\n", (i+1), average[i]);
		}
	}
	
	// 년간 회사 총 매출 출력
	public void printYearTotal() {
		int total;
		total = 0;
		
		for(int i=0; i<department; i++) {
			for(int j=0; j<SEPARATE; j++) {
				total+=takes[i][j];
			}
		}
		System.out.println("1년 회사 총 매출액 : " + total);
	}
	
	// 매출액 설정
	public void setTakes() {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < department; i++)
		{
			for(int j = 0; j < SEPARATE; j++) {
				while(true) {
					System.out.print(departmentName[i] + "의 " + (j+1) + "/4분기의 매출액 입력 : ");
					takes[i][j] = input.nextInt();
					
					// 음수 체크
					if(takes[i][j] >= 0) {
						break;
					}
					System.out.println("음수가 아닌 값을 넣어주십시오.");
				}
			}	
		}
		
	}
	// 부서명 반환
	public String[] getDepartmentName() {
		return departmentName;
	}
	// 부서명 설정
	public void setDepartmentName(String[] departmentName) {
		this.departmentName = departmentName;
	}
	// 매출액 반환
	public int[][] getTakes() {
		return takes;
	}
	
	@Override
	public String toString() {
		return "Sales [department=" + department + ", SEPARATE=" + SEPARATE + ", departmentName="
				+ Arrays.toString(departmentName) + ", takes=" + Arrays.toString(takes) + "]";
	}
}
