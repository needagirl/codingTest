//��� ���� ��������
//���� ����
//�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
//
//���ѻ���
//s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
//����� ��
//s	return
//"abcde"	"c"
//"qwer"	"we"
public class Center {
	public static String solution(String s) {
        String answer = "";
        int center = s.length()/2;
        if(s.length()%2 == 0){
            answer = s.substring(center-1, center + 1 );
        }
        else {
            answer = s.substring(center , center + 1);
        }
        return answer;
    }
	public static void main(String[] args) {
	
		String s = "qwer";
        System.out.println(solution(s));
	}

}
