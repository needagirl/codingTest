//¦���� Ȧ��
//���� ����
//���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
//
//���� ����
//num�� int ������ �����Դϴ�.
//0�� ¦���Դϴ�.
//����� ��
//num	return
//3	"Odd"
//4	"Even"
public class EvenOdd {
	public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer="Even";
        }else{
            answer="Odd";
        }
        
        return answer;
    }
}
