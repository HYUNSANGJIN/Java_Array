
public class Ex01_Array {

    public static void main(String[] args) {
        // 다차원 배열(2차원)
        // [행][열]
        // 예) 좌석(교실의 좌석), 지도 좌표값(경도,위도), 바둑, 영화관 좌석
        
        int[][] score = new int[3][2];
        System.out.println(score[0][0]);  // 초기화한것이 아니라, default값이 있는거다.
        score[0][0] = 100;
        score[0][1] = 100;
        
        score[1][0] = 300;
        score[1][1] = 400;
        
        score[2][0] = 500;
        score[2][1] = 600;
        
        // 2차원 배열의 값을 출력하라
        // (for문 하나로 출력 불가)
        // (for문 2개는 기본적으로 필요)
        // 행의 개수 : 배열이름.length  -> score.length하면 행의 개수가 나옴
        // 열의 개수: 배열이름[0].length
        //  ㄴ 열의 개수는 행마다 다를 수 있다.
        
        for(int i=0; i<score.length; i++) {
            for(int j=0; j<score[i].length; j++) {
                             // ㄴ열의 개수를 나타냄
                System.out.printf("score[%d][%d]=%d\t",i,j,score[i][j]);
            }
            System.out.println();
        }
        
        // 초기화한것
        int[][] score3 = new int[][] {
            {11, 12},
            {13, 14},
            {15, 16}
        };  // 3행 2열짜리 배열을 만든것이다(초기화를 통해서..)
        
        //퀴즈
        // 개선된 for문을 통해서 score3 배열을 값을 출력하세요(2개)
        //   ㄴfor(int value : Array){}
        // 힌트 : 처음 주는 값이 주소(어떤주소? -> 열 배열의 주소 -> 무슨 타입일까?)
        // 2차원 배열의 그림
        
        int[] arr = {10,20,30};
        for(int value : arr) {
            System.out.println(value);
        }
        // 처음...주소(어던주소(열 배열의 주소...어떤 타입일까))
        for(int[] col : score3) {
            for(int value : col) {
                System.out.println("값 : " + value);
            }
        }
        
    }

}
