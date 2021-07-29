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
		//ここにNGワードを弾く処理を書く
		boolean isOK = true;
		String check=nickName;
		
		if (!check.matches("^[0-9]*$")) {
			isOK=false;
		}
		
		if(check.contains("@"))isOK=false;
		if(check.contains("県"))isOK=false;
		if(check.contains("都"))isOK=false;
		if(check.contains("道"))isOK=false;
		if(check.contains("府"))isOK=false;
		if(check.contains("市"))isOK=false;
		if(check.contains("うんこ"))isOK=false;
		if(check.contains("ばか"))isOK=false;
		if(check.contains("バカ"))isOK=false;
		if(check.contains("馬鹿"))isOK=false;
		if(check.contains("あほ"))isOK=false;
		if(check.contains("死"))isOK=false;
		if(check.contains("タヒ"))isOK=false;
		if(check.toUpperCase().contains("SEX"))isOK=false;
		if(check.contains("殺"))isOK=false;
		int length = check.length();	
		if(length >= 16 || length==0){
			isOK = false;
		}
		
		return isOK;

	}

}
