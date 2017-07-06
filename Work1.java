package cn.zhaoqiang.work1;

public class Work1 {
	/*
	 * 第五章上机练习一：计算100以内的偶数之和：
	 * 
	 * 声明
	 * 初始化变量 sum = 0；
	 * 循环条件  num<=100；
	 * 改变值 sum += num;
	 */

	public static void main(String[] args) {
		int sum = 0; // 当前之和
		int num = 2; // 加数
		while (num <= 100) {
			sum += num;
			num += 2;

		}
		System.out.println("100之内的偶数之和为：" + sum);

	}

}
