package by.academy.java.shchukin.classwork.lesson3;

public class ThreeFour {
	public static void main(String[] args) {
		int i = 17;
		while (i <= 28) {
			if ((i % 13) == 0) {
				break; // ��������� ���� ���� while(�.�. �� ���������, ��������� ���), ����� ����������
						// ������ ����� ����� ������ (12)
			}
			i++;
		}
		System.out.println("First number is : " + i);
	}
}
