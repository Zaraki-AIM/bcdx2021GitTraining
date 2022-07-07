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
		String[] nGWords = { "-", "－", "うんこ", "ばか", "バカ", "馬鹿", "あほ", "死ね", "タヒね", "SEX", "sex", "Sex", "殺す",
				"@gmail.com", "@docomo.ne.jp", "outlook.jp" };
		String[] prefectures = { "兵庫県", "神奈川県", "東京都", "大阪府", "北海道" };
		final int WORD_LENGTH_MAX = 16;

		boolean isOK = true;
		//ここにNGワードを弾く処理を書く
		for (String nGWord : nGWords) {
			if (nickName.contains(nGWord)) {// NGワードが含まれている
				isOK = false;
				break;
			} else if (nickName.length() > WORD_LENGTH_MAX) {// 文字数が多すぎる
				isOK = false;
				break;
			} else if (nickName.contains(prefectures)) {
				isOK = false;
				break;
			}
		}

		return isOK;

	}

}
