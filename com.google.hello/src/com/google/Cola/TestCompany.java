package com.google.Cola;
/**
 * @author ��N
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 ��ӭ��������bug
 * @function ��ʾ��̬
 * @bug ��
 */
public class TestCompany {
	/*4�� Cola��˾�Ĺ�Ա��Ϊ���������ࣺ(֪ʶ�㣺��̬) [������]
	4.1  ColaEmployee ����������Ա���ܵĸ��࣬���ԣ�Ա��������,Ա���������·ݡ�������getSalary(int month) ���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾����⽱��100 Ԫ��
	4.2  SalariedEmployee ��	ColaEmployee �����࣬�ù̶����ʵ�Ա�������ԣ���н
	4.3  HourlyEmployee ��ColaEmployee �����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5 �����ʷ��š����ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��
	4.4  SalesEmployee ��ColaEmployee �����࣬������Ա�������������۶������ʾ��������ԣ������۶�����
	4.5  ����һ����Company���ڸ�����дһ�����������ø÷������Դ�ӡ��ĳ��ĳ��Ա���Ĺ������дһ��������TestCompany,��main�����������ɸ������͵�Ա������һ��ColaEmployee ���������Ԫ��������ÿ��Ա�����µĹ��ʡ�
	*/
	public static void main(String[] args) {
		Company cp=new Company();
		ColaEmployee[] ce={new SalariedEmployee("bob",1,1,200),new HourlyEmployee("Charlie", 2, 1, 170, 60),new SalesEmployee("Archer", 3, 2, 1000, 1.3)}	;
		for(ColaEmployee c :ce)
		cp.tell(c);
	}

}
