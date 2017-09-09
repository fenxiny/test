package xin.yuan.feng;

import java.util.*;
import java.io.*;
public class Test
{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String[] Buffer = new String[6];
		for (int i=0;i<6;i++){
			Buffer[i]=sc.nextLine();
		}
		sc.close();
		FileWriter file = new FileWriter("d:/dest.txt");
		BufferedWriter bw = new BufferedWriter(file);
		for (int i=0;i<6 ;i++ )
		{
			bw.write(Buffer[i]+',');
		}
		bw.close();
		BufferedReader br =new BufferedReader(new FileReader("d:/dest.txt")); 
		String content = br.readLine();
		System.out.println(content);
		int[] newAry = strToArray(content.trim());
		for (int i =5; i>=0; i-- ){
			System.out.println(newAry[i]);
		}
		br.close();
	}
	private static int[] strToArray(String str){
		String[] strAry = str.split(",");
		int[] ary = new int[strAry.length];
		for(int i =0; i< strAry.length; i++){
			ary[i]= Integer.parseInt(strAry[i]);
		}
		return ary;
	}
}