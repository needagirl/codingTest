//����� ����
//���� ����
//����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�. 2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
//
//���� ����
//��� arr1, arr2�� ��� ���� ���̴� 500�� ���� �ʽ��ϴ�.
//����� ��
//arr1	arr2	return
//[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//[[1],[2]]	[[3],[4]]	[[4],[6]]
public class ArraySum {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		 int[][] answer = new int[arr1.length][arr1[0].length];
	        for(int i=0; i<arr1.length; i++){
	            for(int j=0; j<arr1[i].length; j++){
	                answer[i][j] = arr1[i][j]+ arr2[i][j];;
	            }
	        }
	               
        return answer;
    }
}

