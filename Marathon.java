import java.util.Arrays;
import java.util.HashMap;

//�������� ���� ����
//���� ����
//������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
//
//�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//���ѻ���
//������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
//completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
//�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
//������ �߿��� ���������� ���� �� �ֽ��ϴ�.
//����� ��
//participant	completion	return
//["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
//["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
//["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
//����� �� ����
//���� #1
//"leo"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
//
//���� #2
//"vinko"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
//
//���� #3
//"mislav"�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.
public class Marathon {
	static String[] participant = {"leo", "kiki", "eden"};
	static String[] completion = {"eden", "kiki"};
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){
            if (!participant[i].equals(completion[i])){
            	return participant[i];
            }
        }
        return participant[i];
    }
	public static void main(String[] args) {
		String result = solution(participant, completion);
		System.out.println(result);
	}

}
