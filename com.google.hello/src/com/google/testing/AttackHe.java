package com.google.testing;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AttackHe {

	public AttackHe() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Characters> characterList = new ArrayList<Characters>();
		characterList.add(new Characters("�����", "�𹿰�", 50, 50));
		characterList.add(new Characters("��˽�", "�ųݶ���", 40, 20));
		characterList.add(new Characters("ɳɮ", "������", 30, 40));
		characterList.add(new Characters("��ɮ", "�", 10, 50));
		System.out.println("ţħ��:ţħ���������ǰŽ��ȣ�ս����20������100\n");

		System.out.println("�������ɫ���ѡ���ɫ��ţħ����ս;");
		System.out.println("1.�����:����յ������ǽ𹿰���ս����50������50");
		System.out.println("2.��˽�:��˽�������Ǿųݶ��ң�ս����40������20");
		System.out.println("3.ɳɮ:ɳɮ����������������ս����30������40");
		System.out.println("4.��ɮ:��ɮ�����������ս����Ϊ10������50");
		
		Scanner sc = new Scanner(System.in);
		int chrooseCharacter = sc.nextInt() - 1;
		// System.out.println(characterList.get(chrooseCharacter).getName());
		fight(characterList.get(chrooseCharacter));
		sc.close();
	}

	static void fight(Characters player) {
		Characters boos = new Characters("ţħ��", "�Ž���", 20, 100);
		Random r = new Random();
		float randomOfAttack = 0;
		while (true) {
			randomOfAttack = r.nextFloat();
			if (boos.getHp() > 0) {
				if (randomOfAttack > 0.5) {
					player.takeDamage(boos.getDamage());
					System.out.println(boos.getName() +"ʹ��"+boos.getWeapon()+ "������" + player.getName() + " ����˺�" + boos.getDamage() + " ʣ��HP"
							+ player.getHp());
				}
			} else {
				System.out.println(player.getName() + "ʤ��");
				return;
			}
			randomOfAttack = r.nextFloat();
			if (player.getHp() > 0) {
				if (randomOfAttack > 0.5) {
					boos.takeDamage(player.getDamage());
					System.out.println(player.getName() +"ʹ��"+player.getWeapon()+ "������" + boos.getName() + " ����˺�" + player.getDamage()
							+ " ʣ��HP" + boos.getHp());
				}
			} else {
				System.out.println(boos.getName() + "ʤ��");
				return;
			}

		}

	}
}
