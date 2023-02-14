package arrayex;
/*
* int[][] score = {
{90,80,70},{95,85,75},{70,80,75},{75,70,85},{70,75,80}}; 
* [결과]
*        국어  영어  수학  총점  평균
1번학생 :  90   80   70  240  80.0
2번학생 :   95   85   75  255 99.9
3번학생 :   70   80   75  225 99.9
4번학생 :   75   70   85  230 99.9
5번학생 :   70   75   80  225 99.9
과목합계:  400  390  385  1175 99.9
국어평균 : 99.9
영어평균 : 99.9
수학평균 : 99.9
*/
public class Exam3 {
	public static void main(String[] args) {
		int[][] score = {
		{90,80,70},{95,85,75},{70,80,75},{75,70,85},{70,75,80}};
		int[] sumarr = new int[3];
		System.out.printf("%6s %3s %3s %3s %3s %3s\n",
				  " ","국어","영어","수학","총점","평균");
		int total = 0;
		for(int i=0;i<score.length;i++) {
			int sum=0;
			System.out.print((i+1)+"번학생");
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%5d",score[i][j]);
				sum += score[i][j];
				sumarr[j] += score[i][j];
				total += score[i][j];
			}
			System.out.printf("%5d %5.1f\n",
					sum,(float)sum/score[i].length);
		}
		System.out.print("과목합계");
		System.out.printf("%5d%5d%5d",sumarr[0],sumarr[1],sumarr[2]);
		System.out.printf("%5d %5.1f\n",
				total,(float)total/score[0].length);
		System.out.println("국어평균:"+(float)sumarr[0]/score.length);
		System.out.println("영어평균:"+(float)sumarr[1]/score.length);
		System.out.println("수학평균:"+(float)sumarr[2]/score.length);

	}
}
