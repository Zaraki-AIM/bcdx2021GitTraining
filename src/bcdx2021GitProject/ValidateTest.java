package bcdx2021GitProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ValidateTest {

	public static void main(String[] args) {
		int validateCount = 0;
		int totalCount = 0;
		String filename = "src/sample.txt";

		try (BufferedReader in = new BufferedReader(new FileReader(new File(filename)))) {
			String line;
			while ((line = in.readLine()) != null) {
				totalCount++;
				if (!checkNickName(line)) {
					System.out.println(line + "：NG!");
					validateCount++;
				} else {
					System.out.println(line + "：OK!");
				}
			}

			//結果表示
			System.out.println(
					"NGワード：" + validateCount + "/" + totalCount + ":" + validateCount * 100 / totalCount + "%");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(-1); // 0 以外は異常終了
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	/*
	 * return true:OKワード,false:NGワード
	 * */
	public static boolean checkNickName(String nickName) {
		boolean isOK = true;
		//ここにNGワードを弾く処理を書く
		String[] strArray = nickName.split("");
		for (int i = 0; i < strArray.length; i++) {
		}


		//空文字
		if (nickName == "") {
			isOK = false;
}
		if (nickName.contains("北海道")) {
			return false;
		}

		//文字が16文字以上
		if (strArray.length > 16) {
			isOK = false;
		}
		
		/*//電話番号作り途中
		for(int i=0; i<strArray.length; i++) {
			char c = strArray[i].toCharArray();
			if(strArray[i].)
		}*/

		return isOK;

	}

}