package cn.zhaoqiang.work1;

public class Work1 {
	/*
	 * �������ϻ���ϰһ������100���ڵ�ż��֮�ͣ�
	 * 
	 * ����
	 * ��ʼ������ sum = 0��
	 * ѭ������  num<=100��
	 * �ı�ֵ sum += num;
	 */

	public static void main(String[] args) {
		int sum = 0; // ��ǰ֮��
		int num = 2; // ����
		while (num <= 100) {
			sum += num;
			num += 2;

		}
		System.out.println("100֮�ڵ�ż��֮��Ϊ��" + sum);

	}

}
