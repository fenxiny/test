public class Calculator
{
	//��һ���п��Դ�����ͬ�������Ķ������(����һ��Ҫ��ͬ)
	//�ж��ı�׼�ǲ���(����ֵ�����뵱ǰ���ж�)
	//�����Ĳ�ͬ��Ϊ����:1:������������ͬ 2:���������Ͳ�ͬ
	//һ�����д������������������ϵ���ͬ�������Ƶ��ǲ�����ͬ�ķ�����Ϊ��������
	public int calc(int i){
		return i+10;
	}
	public int calc(int i,int j){
		return i+j;
	}

	public double calc(int i,double j){
		return i+j;
	}

	public double calc(double i,int j){
		return i+j;
	}

	public double calc(double i,double j){
		return i+j;
	}

	public String calc(String i,String j){
		return i+j;
	}

	public String calc(String i,double j){
		return i+j;
	}
}
