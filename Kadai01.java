package java3kadai;
import java.util.Scanner;

public class Kadai01 {


	public static void main(String[] args) {
		//scannerをインスタンス化
	    Scanner scanner  = new Scanner(System.in);
	    //数字を入力してください。と出力
	    System.out.println("数字を入力してくださいー！");



		//入力された値をnumとして取得
	    int num = scanner.nextInt();
	    //入力された数値の最大値をmaxnumとしてインスタンス化
	    int maxnum = num * num;
		//最大値の桁数をlengthとして取得
	    int length = String.valueOf(maxnum).length();

		//1から入力された数値まで繰り返し1ずつプラスし処理(かけられる数)
		for(int num1 = 1; num1 <= num; num1++) {
			//1から入力された数値まで繰り返し1ずつプラスし処理(かける数)
			for(int num2 = 1; num2 <= num; num2++) {

				//num1とnum2の積をresultとして取得
				int result = num1 * num2;
			    //最大値の桁数に応じて結果を整えて出力
				System.out.printf("%"+ length +"d ",result);
			}
			//改行
			System.out.println();
		}
		//scannerを閉じる
		scanner.close();

	}

}
