package bcdx2022GitProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ValidateTest {

	public static void main(String[] args)
	{
		int validateCount = 0;
		int totalCount = 0;
		String filename = "src/sample.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename)))){
            String line;
            while((line = in.readLine()) != null){
            	totalCount++;
            	if(!checkNickName(line)){
            		System.out.println(line + "：NG!");
            		validateCount++;
            	}else{
            		System.out.println(line + "：OK!");
            	}
            }

            //結果表示
            System.out.println("NGワード：" + validateCount + "/" + totalCount + ":" + validateCount*100/totalCount +"%");
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(-1); // 0 以外は異常終了
        } catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
	}

	/*
	 * return true:OKワード,false:NGワード
	 * */
	public static boolean checkNickName(String nickName){

		// Nullまたは空文字の場合はfalseを返す
		if (nickName == null || "".equals(nickName)) {
			return false;
		}

		// 16文字以上の文字列の場合はfalseを返す
		if (nickName.length() >= 16) {
			return false;
		}

		// 郵便番号を含む場合はfalseを返す
		if (nickName.matches("^.*[0-9]{3}-[0-9]{4}.*$")) {
			return false;
		}

		// 電話番号を含む場合はfalseを返す
		if (nickName.matches("^.*[0-9]{3}-[0-9]{4}-[0-9]{4}.*$")) {
			return false;
		}

		return true;

	}

}
