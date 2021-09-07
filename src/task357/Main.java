package task357;



public class Main{
    public static void main(String[] args){
        TextAnalyzer[] ta = new TextAnalyzer[3];
        //SpamAnalyzer sa
//        ta[0] = new SpamAnalyzer(new String[] {"spam1","spam2","spam3"});
//        //NegativeTextAnalyzer nta
//        ta[1] = new NegativeTextAnalyzer();
//        //TooLongTextAnalyzer lta
//        ta[2] = new TooLongTextAnalyzer(20);

        String[] s = {"ttt mmm spam1",
        "negative text :(",
        "toooooooooooooooooo long"};
        //String[] s = new String[3];
        for (String str: s){
            if (str!=null)
            System.out.println(checkLabels(ta,str));
        }
    }


    //для вызова добавил static, на "https://platform.java-mentor.com/user/courses/2/3/5/7"
    //static отсутствует
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        //Твой код здесь
        for (TextAnalyzer a : analyzers) {
            if (a==null) continue;
            Label l = a.processText(text);
            if (l != Label.OK) {
                return l;
            }
        }
        return Label.OK;
    }

}



