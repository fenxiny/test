public class Demo 
{
	public static void main(String[] args) 
	{
		//�������(��ʼֵ��1)(�����ǿ���ѭ������)
		//���1--10 
		//���� ���� ������ ���� ����(dowhileѭ��)
		//dowhile ѭ������ִ��һ��()
		//dowhile ��ִ�к��ж�
		/*
		int i=11;
		do{
			System.out.println(i);
			//��ѭ��(ѭ����Զ�������)
			i++;
		}while(i<=10);
		
		//���ж���ִ��(һ�ζ���ִ��)
		int i=11;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		//dowhile while ��ִ�л������ж�
		��ʼѭ������
		ѭ������ֹ����
		ѭ�������ĵ���
		
		
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}

		

		int i=1;
		for(;i<=10;){
			System.out.println(i);
			i++;
		}
		

		int i=1;
		for(;;){
			if(i>10){
				//�˳�ѭ��
				//�˳���ǰ��ѭ��
				//�˳���ǰѭ��
				break;
			}
			System.out.println(i);
			i++;
		}

		
		//\t ��ʾһ���Ʊ��(TAB)
		//������
		for(int i=1;i<10;i++){
			//������
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<10;i++){
			for(int j=10;j-i>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}

		
		//���ÿ��ǰ��Ŀո�
		for(int i=1;i<10;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int j=10;j-i>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		

		for(int i=1;i<10;i++){
			for(int j=10;j-i-1>0;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		*/


		//����
		/*
		for(int i=1;i<=5;i++){
			for(int j=5;j-i>0;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=9;j-(2*i)>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		//��1�ӵ�100
		/*
		int result=0;
		for(int i=1;i<=100;i++){
			result+=i;
		}
		System.out.println(result);
		*/

		//while һ���ж��Ƿ�Χ
		//for һ����ѭ�������Ƚ�ȷ��

		//����(��ͬ���Ͷ������)
		//��С
		//����
		//int[] nums;
		//����40���ֽڵ������Ŀռ� nums�洢���40���ֽڿռ���׵�ַ
		//nums=new int[10];
		//λ��(�±�) 0  --  length-1

		/*
		int[] nums=new int[10];
		nums[0]=10;
		nums[1]=20;
		nums[9]=300;


		int[] nums1={1,2,3,4,5,6,7,78,8,9};

		int[] nums2=new int[]{1,2,3,4,5,6,76,7,8};
		*/
		//��������(���ǲ��Ƽ�ʹ��)
		//������һ����������
		//int nums3[]={1,2,3,4,5,6,7,8,9};
		/*
		for(int i=0;i<nums3.length;i++){
			System.out.println(nums3[i]);
		}
		*/

		//for(int n : nums3){
		//	System.out.println(n);
		//}




	}	

}
