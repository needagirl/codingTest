//가운데 글자 가져오기
//문제 설명
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//제한사항
//s는 길이가 1 이상, 100이하인 스트링입니다.
//입출력 예
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
