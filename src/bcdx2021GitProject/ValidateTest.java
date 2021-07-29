package bcdx2021GitProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;

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
		
		String[] badWord = {"うんこ", "うんち", "sex", "死ね", "あほ", "馬鹿", "ばか", "タヒね", "殺す"};
		//ここにNGワードを弾く処理を書く
		
		nickName = Normalizer.normalize(nickName, Normalizer.Form.NFC);
		nickName = Normalizer.normalize(nickName, Normalizer.Form.NFD);
		nickName = Normalizer.normalize(nickName, Normalizer.Form.NFKC);
		nickName = Normalizer.normalize(nickName, Normalizer.Form.NFKD);
		nickName = nickName.toLowerCase();
			
		
		if(nickName == null || nickName.trim() == "") {
			isOK = false;
		} else if(nickName.matches("")) {
			isOK = false;
		} else if (nickName.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}") || nickName.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
			isOK = false;
		} else if (nickName.length() > 16) {
			isOK = false;
		} else if (nickName.contains("-")) {
			isOK = false;
		} else if (nickName.contains("@")) {
			isOK = false;
		} else if (nickName.contains("県") || nickName.contains("府") || nickName.contains("都") || nickName.contains("市")) {
			isOK = false;
		}else {
			for(String badString : badWord) {
				if(badString.equals(nickName)) {
					isOK = false;
					break;
				}
			}
		}
		
		return isOK;

	}

}