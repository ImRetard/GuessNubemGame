package lesson_35_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        String book = "Док Штраус сказал што я должен писать все што я думаю и помню и все што случаеца со мной с севодня. Я не знаю пачему но он гаварит што это важно штобы они могли увидить што я падхажу им. Я надеюсь што падхажу им потому што мис Кинниан сказала они могут сделать меня умным. Я хочю быть умным. Меня завут Чярли Гордон я работаю в пикарне Доннера где мистер Доннет плотит мне 11 доларов в ниделю и дает хлеп или перожок когда я захочю, Мне 32 года и через месец у меня день рождения. Я сказал доку Штраусу и профу Немуру што я не могу харашо писать но он сказал што это ничево и што я должен писать как гаварю и как пишу сачинения на уроках у мис Кинниан в колеже Бекмана для умствено атсталых куда я хажу 3 раза в ниделю по вечерам. Док Штраус гаварит пишы все што думаеш и што случаеца с тобой но я уже не могу думать и по этому мне нечево писать так што я закончю на севодня… Искрине ваш Чярли Гордон.";
        Set<String> uWords;


        uWords = uniqWords(parseBook(book));
        System.out.println(uWords.size());
        Iterator<String> iterator = uWords.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    public static String[] parseBook(String text) {
        String[] words = text.split("\\s");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }
        System.out.println(words.length);


        return words;
    }

    public static Set<String> uniqWords(String[] words) {
        Set<String> uWords = new TreeSet<>();
        for (int i = 0; i < words.length; i++) {
            uWords.add(words[i]);

        }
        return uWords;
    }
}

