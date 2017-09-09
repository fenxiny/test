import java.util.ArrayList;

public class Test3{
	public static void main(String[] args){
		ArrayList<Integer> result=new ArrayList<Integer>();
		int[] num={1,2,3,4};
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(i==j) 
					continue;
				for(int k=0;k<4;k++){
					if(k==j || k==i) 
						continue;
					result.add(num[i]*100+num[j]*10+num[k]);
				}
			}
		}
		
		System.out.println(result.size());
		
		for(Integer n : result){
			System.out.println(n);
		}
	}
}

