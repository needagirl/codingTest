//�ڸ��� ���ϱ�
//���� ����
//�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
//������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
//
//���ѻ���
//N�� ���� : 100,000,000 ������ �ڿ���
//����� ��
//N	answer
//123	6
//987	24
//����� �� ����
//����� �� #1
//������ ���ÿ� �����ϴ�.
//
//����� �� #2
//9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.
public class SumAll {
	public static void main(String[] args) {
	int[] arr= {2,3,4,5,6};
	Integer n = 324234;
	int temp = 0;
	while (n!=0) {
		temp += n%10;
		n=n/10;
	}
	
	System.out.println(temp);
	
	}
}
