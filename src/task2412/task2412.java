package task2412;


public class task2412 {
    public static void main(String[] args){
        String[] roles ={
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        //Твой код здесь
        String role, role_text;
        StringBuilder[] res_arr = new StringBuilder[roles.length];
        for (int i = 0; i < roles.length; i++) {
            res_arr[i] = new StringBuilder();
            res_arr[i].append(roles[i]);
            res_arr[i].append(":");
            res_arr[i].append('\n');
        }

        for (int i = 0; i < textLines.length; i++) {
            role = textLines[i].substring(0, textLines[i].indexOf(":"));
            role_text = textLines[i].substring(textLines[i].indexOf(":") + 1);
            for (int j = 0; j < roles.length; j++) {
                if (roles[j].equals(role)) {
                    res_arr[j].append(i + 1);
                    res_arr[j].append(")");
                    res_arr[j].append(role_text);
                    res_arr[j].append('\n');
                    break;
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder sb: res_arr) {
            res.append(sb.toString());
            res.append('\n');
        }

        //return res.toString();
        System.out.println(res.toString());

    }
}
