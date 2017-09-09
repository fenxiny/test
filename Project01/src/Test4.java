import java.util.ArrayList;
public class Test4{
	public static void main(String[] args){
		double i=2,j=1;
		ArrayList<Double> list=new ArrayList<>();
		while(list.size()<20){
			list.add(i/j);
			double temp=i;
			i+=j;
			j=temp;
		}
		
		double result=0;
		for(Double s : list){
			result+=s;
		}
		
		System.out.println(result);
		
	}

}
