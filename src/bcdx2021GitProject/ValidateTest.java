package bcdx2021GitProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ValidateTest {

	
	/*
	 * return true:OKワード,false:NGワード
	 * */

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
        if(nickName.equals(null)) isOK=false;
        if(nickName.equals("")) isOK=false;
        if(nickName.length()>15) isOK=false;
        if(nickName.contains("090")) isOK = false;
		if(nickName.contains("県")) isOK = false;
		if(nickName.contains("都")) isOK = false;
		if(nickName.contains("道")) isOK = false;
		if(nickName.contains("府")) isOK = false;
		if(nickName.contains("@")) isOK = false;
		if(nickName.contains("丁目")) isOK = false;
        
        String[] dangerouStrings = {"うんこ","ばか","バカ","馬鹿","あほ","死ね","タヒね","SEX","sex","Sex","殺す"};
        for(int i =0; i < dangerouStrings.length; i++) {
        	if(nickName.contains(dangerouStrings[i])) isOK=false;
        }
        
        return isOK;
    }

}

