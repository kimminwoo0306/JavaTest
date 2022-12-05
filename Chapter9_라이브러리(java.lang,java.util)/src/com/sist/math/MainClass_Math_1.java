package com.sist.math;
/*
   Math : �⺻���� ���� ��꿡 �ʿ��� ���̺귯��
          ===========================> ����
          �� : ���а���� ���� ���� (����Ŭ)
          random() : ���� => Random => nextInt(100) -> 0~99
          ----- ������ ���� ����
          public static double random()
          *** MathŬ������ static �޼ҵ�� (�޸� �Ҵ��� ���� ����� ����)
          *** import java.lang.Math => ������ ����
                    => Math.random()
          *** import static java.lang.Math.random
                     => random()
                      ---------- 0.0 ~ 0.99 ������ ������ �� ����
          ceil() : �ø��Լ� => ������������
          round() : �ݿø��Լ� => ��� (�Ҽ��� ���) ==> �ڵ� �ݿø� (printf("%.2f"))
 */
import static java.lang.Math.round;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import static java.lang.Math.ceil;
import static java.lang.Math.random;
public class MainClass_Math_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.2f\n",87.555);
		System.out.println(round(87.6555));
		System.out.println(ceil(87.1222));
		System.out.println((int)(random()*100));
	//	System.out.println(Math.round(87.222));
	//	System.out.println(Math.ceil(87.111));
	//	System.out.println((int)Math.random()*100);
	}

}
