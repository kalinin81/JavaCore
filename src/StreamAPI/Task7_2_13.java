package StreamAPI;

import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Task7_2_13 {
    public static class MailMessage extends AbstractClass{
        private String content;
        public MailMessage(String from, String to, String content) {
            super(from, to);
            this.content = content;
        }
        public String getContent() {
            return content;
        }
        @Override
        public <E> void accept(Map<String, List<E>> map) {
            List<String> lst = new ArrayList<>();
            lst.add(content);
            map.merge(getTo(), (List<E>) lst, (oldValue, newValue) -> {oldValue.add(newValue.get(0)); return oldValue;} );
        }
    }

    public static class Salary extends AbstractClass{
        private Integer content;
        public Salary(String from, String to, int content) {
            super(from, to);
            this.content = content;
        }
        public Integer getContent() {
            return content;
        }
        @Override
        public <E> void accept(Map<String, List<E>> map) {
            List<Integer> lst = new ArrayList<>();
            lst.add(content);
            map.merge(getTo(), (List<E>) lst, (oldValue, newValue) -> {oldValue.add(newValue.get(0)); return oldValue;} );
        }
    }
    public static class my<K,V> extends HashMap<K,V> {
        @Override
        public V get(Object key) {
            return super.getOrDefault(key, (V) Collections.EMPTY_LIST);
        }
    }
    public static abstract class AbstractClass {
        protected String from;
        protected String to;
        protected AbstractClass(String form, String to) {
            this.from = form;
            this.to = to;
        }
        protected String getTo() {
            return to;
        }
        protected String getFrom() {
            return from;
        }
        public abstract <E> void accept(Map<String, List<E>> map);
    }
    public static class MailService<E> implements Consumer<AbstractClass>
    {
        Map<String, List<E>> map = new my<>();
        public Map<String, List<E>> getMailBox() {
            return map;
        }
        @Override
        public void accept(AbstractClass abstractClass) {
            abstractClass.accept(map);
/*
            List<E> lst = new ArrayList<>();
            if (abstractClass instanceof MailMessage) {
                lst.add((E) (((MailMessage) abstractClass).getContent()));
            } else {
                lst.add((E) (((Salary) abstractClass).getContent()));
            }
            map.merge(abstractClass.getTo(), lst, (oldValue, newValue) -> {oldValue.add(newValue.get(0)); return oldValue;} );
*/

        }
    }
    public static void main(String[] args) {

        // Random variables
        String randomFrom = "..."; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        String randomTo = "...";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        int randomSalary = 100;  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.


        // Создание списка из трех почтовых сообщений.
        MailMessage firstMessage = new MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        );

        assert firstMessage.getFrom().equals("Robert Howard") : "Wrong firstMessage from address";
        assert firstMessage.getTo().equals("H.P. Lovecraft") : "Wrong firstMessage to address";
        assert firstMessage.getContent().endsWith("Howard!") : "Wrong firstMessage content ending";


        MailMessage secondMessage = new MailMessage(
                "Jonathan Nolan",
                "Christopher Nolan",
                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
        );

        MailMessage thirdMessage = new MailMessage(
                "Stephen Hawking",
                "Christopher Nolan",
                "Я так и не понял Интерстеллар."
        );

        List<MailMessage> messages = Arrays.asList(
                firstMessage, secondMessage, thirdMessage
        );

        // Создание почтового сервиса.
        MailService<String> mailService = new MailService<>();


        // Обработка списка писем почтовым сервисом
        messages.stream().forEachOrdered(mailService);

        // Получение и проверка словаря "почтового ящика",
        //   где по получателю можно получить список сообщений, которые были ему отправлены
        Map<String, List<String>> mailBox = mailService.getMailBox();


        assert mailBox.get("H.P. Lovecraft").equals(
                Arrays.asList(
                        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
                )
        ) : "wrong mailService mailbox content (1)";

        assert mailBox.get("Christopher Nolan").equals(
                Arrays.asList(
                        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                        "Я так и не понял Интерстеллар."
                )
        ) : "wrong mailService mailbox content (2)";

        assert mailBox.get(randomTo).equals(Collections.<String>emptyList()) : "wrong mailService mailbox content (3)";




        // Создание списка из трех зарплат.
        Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
        Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);

        // Создание почтового сервиса, обрабатывающего зарплаты.
        MailService<Integer> salaryService = new MailService<>();

        // Обработка списка зарплат почтовым сервисом
        Arrays.asList(salary1, salary2, salary3).forEach(
                salaryService
               // System.out::println
        );

        // Получение и проверка словаря "почтового ящика",
        //   где по получателю можно получить список зарплат, которые были ему отправлены.
        Map<String, List<Integer>> salaries = salaryService.getMailBox();

        assert salaries.get(salary1.getTo()).equals(Arrays.asList(1)) : "wrong salaries mailbox content (1)";
        assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)) : "wrong salaries mailbox content (2)";
        assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)) : "wrong salaries mailbox content (3)";



    }
}
