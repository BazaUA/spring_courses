package bazalytskyi.hom2work2;

public class Shevchenko implements Poem {
	private static String[] LINES = { "Садок вишневий коло хати,", "Хрущі над вишнями гудуть,",
			"Плугатарі з плугами йдуть,", "Співають ідучи дівчата,", "А матері вечерять ждуть.",
			"Сем'я вечеря коло хати,", "Вечірня зіронька встає.", "Дочка вечерять подає,", "А мати хоче научати,",
			"Так соловейко не дає.", "Поклала мати коло хати ", "Маленьких діточок своїх;", "Сама заснула коло їх.",
			"Затихло все, тілько дівчата", "Та соловейко не затих." };

	public Shevchenko() {
	}

	public void recite() {
		for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}
	}
}
