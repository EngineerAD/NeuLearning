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
		characterList.add(new Characters("ÀÔŒÚø’", "Ωπø∞Ù", 50, 50));
		characterList.add(new Characters("÷Ì∞ÀΩ‰", "æ≈≥›∂§∞“", 40, 20));
		characterList.add(new Characters("…≥…Æ", "‘¬—¿≤˘", 30, 40));
		characterList.add(new Characters("Ã∆…Æ", "ƒÓæ≠", 10, 50));
		System.out.println("≈£ƒßÕı:≈£ƒßÕıµƒŒ‰∆˜ «∞≈Ω∂…»£¨’Ω∂∑¡¶20£¨ƒÕ¡¶100\n");

		System.out.println("«Î ‰»ÎΩ«…´–Ú∫≈—°‘ÒΩ«…´”Î≈£ƒßÕı∂‘’Ω;");
		System.out.println("1.ÀÔŒÚø’:ÀÔŒÚø’µƒŒ‰∆˜ «Ωπø∞Ù£¨’Ω∂∑¡¶50£¨ƒÕ¡¶50");
		System.out.println("2.÷Ì∞ÀΩ‰:÷Ì∞ÀΩ‰µƒŒ‰∆˜ «æ≈≥›∂§∞“£¨’Ω∂∑¡¶40£¨ƒÕ¡¶20");
		System.out.println("3.…≥…Æ:…≥…ÆµƒŒ‰∆˜ «‘¬—¿≤˘°£’Ω∂∑¡¶30£¨ƒÕ¡¶40");
		System.out.println("4.Ã∆…Æ:Ã∆…ÆµƒŒ‰∆˜ «ƒÓæ≠£¨’Ω∂∑¡¶Œ™10£¨ƒÕ¡¶50");
		
		Scanner sc = new Scanner(System.in);
		int chrooseCharacter = sc.nextInt() - 1;
		// System.out.println(characterList.get(chrooseCharacter).getName());
		fight(characterList.get(chrooseCharacter));
		sc.close();
	}

	static void fight(Characters player) {
		Characters boos = new Characters("≈£ƒßÕı", "∞≈Ω∂…»", 20, 100);
		Random r = new Random();
		float randomOfAttack = 0;
		while (true) {
			randomOfAttack = r.nextFloat();
			if (boos.getHp() > 0) {
				if (randomOfAttack > 0.5) {
					player.takeDamage(boos.getDamage());
					System.out.println(boos.getName() +" π”√"+boos.getWeapon()+ "π•ª˜¡À" + player.getName() + " ‘Ï≥……À∫¶" + boos.getDamage() + "  £”‡HP"
							+ player.getHp());
				}
			} else {
				System.out.println(player.getName() + " §¿˚");
				return;
			}
			randomOfAttack = r.nextFloat();
			if (player.getHp() > 0) {
				if (randomOfAttack > 0.5) {
					boos.takeDamage(player.getDamage());
					System.out.println(player.getName() +" π”√"+player.getWeapon()+ "π•ª˜¡À" + boos.getName() + " ‘Ï≥……À∫¶" + player.getDamage()
							+ "  £”‡HP" + boos.getHp());
				}
			} else {
				System.out.println(boos.getName() + " §¿˚");
				return;
			}

		}

	}
}
