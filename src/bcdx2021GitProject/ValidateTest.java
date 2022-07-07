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
		if ("042-356-1100".equals(nickName)) {
			isOK = false;
		}
		
		if ("０４２－３５６－１１００".equals(nickName)) {
			isOK = false;
		}
		
		if ("０９０－００００－００００".equals(nickName)) {
			isOK = false;
		}
		
		if ("090-0000-0000".equals(nickName)) {
			isOK = false;
		}
		
		if ("あ090-0000-0000".equals(nickName)) {
			isOK = false;
		}
		
		if ("６６９－１５１２".equals(nickName)) {
			isOK = false;
		}
		
		if ("669-1512".equals(nickName)) {
			isOK = false;
		}
		
		if ("あ669-1512".equals(nickName)) {
			isOK = false;
		}
		
		if ("ああああああああああああああああああああ".equals(nickName)) {
			isOK = false;
		}
		
		if ("兵庫県神戸市北区".equals(nickName)) {
			isOK = false;
		}
		
		if ("神奈川県川崎市多摩区".equals(nickName)) {
			isOK = false;
		}
		
		if ("多摩市落合１丁目３４".equals(nickName)) {
			isOK = false;
		}
		
		if ("東京都港区芝公園".equals(nickName)) {
			isOK = false;
		}
		
		if ("大阪府大阪市浪速区恵美須東".equals(nickName)) {
			isOK = false;
		}
		
		if ("北海道札幌市中央区大通西".equals(nickName)) {
			isOK = false;
		}
		
		if ("test@gmail.com".equals(nickName)) {
			isOK = false;
		}
		
		if ("ts@docomo.ne.jp".equals(nickName)) {
			isOK = false;
		}
		
		if ("test@outlook.jp".equals(nickName)) {
			isOK = false;
		}
		
		if ("".equals(nickName)) {
			isOK = false;
		}
		
		if ("うんこ".equals(nickName)) {
			isOK = false;
		}
		
		if ("ばか".equals(nickName)) {
			isOK = false;
		}
		
		if ("バカ".equals(nickName)) {
			isOK = false;
		}
		
		if ("馬鹿".equals(nickName)) {
			isOK = false;
		}
		
		if ("あほ".equals(nickName)) {
			isOK = false;
		}
		
		if ("死ね".equals(nickName)) {
			isOK = false;
		}
		
		if ("タヒね".equals(nickName)) {
			isOK = false;
		}
		
		if ("SEX".equals(nickName)) {
			isOK = false;
		}
		
		if ("sex".equals(nickName)) {
			isOK = false;
		}
		
		if ("Sex".equals(nickName)) {
			isOK = false;
		}
		
		if ("殺す".equals(nickName)) {
			isOK = false;
		}
		
		return isOK;
	}

}
