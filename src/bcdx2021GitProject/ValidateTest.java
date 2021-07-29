package bcdx2021GitProject;

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

		boolean isOK = true;
		
		//ここにNGワードを弾く処理を書く
		if(nickName.contains("Sex")) {
			isOK = false;
		}
		
		if(nickName.contains("sex")) {
			isOK = false;
		}
		
		if(nickName.contains("SEX")) {
			isOK = false;
		}
		
		if(nickName.contains("馬鹿")) {
			isOK = false;
		}
		
		if(nickName.contains("バカ")) {
			isOK = false;
		}
		
		if(nickName.contains("ばか")) {
			isOK = false;
		}
		
		if(nickName.contains("アホ")) {
			isOK = false;
		}
		
		if(nickName.contains("死ね")) {
			isOK = false;
		}
		
		if(nickName.contains("タヒね")) {
			isOK = false;
		}

		return isOK;

	}

}
