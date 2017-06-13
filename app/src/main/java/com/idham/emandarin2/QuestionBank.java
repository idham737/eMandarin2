package com.idham.emandarin2;

/**
 * Created by IDHAM on 08-Jun-17.
 */

public class QuestionBank{
    private String mQuestions[]={
            "1. What is 公牛 or gōng niú?",
            "2. What is 奶牛 or nǎi niú?",
            "3. What is 德国 or dé guó?",
            "4. What is 巧克力 or qiǎokèlì?",
            "5. What is 橙汁 or Chéngzhī?",
            "6. What 星期三 in Pinyin?",
            "7. What 七月 in Pinyin?",
            "8. Christmas is written as?",
            "9. Nǐ jiào shénme míngzì written as?",
            "10. Tā zài nǎlǐ gōngzuò is written as?"
    };

    private String mChoices[][]={
            {"Bull","Donkey", "Zebra","Bat"},
            {"Monkey","Tiger","Deer","Cow"},
            {"Germany", "Britain","Italian","Malaysian"},
            {"Sushi","Chocolate","Rice", "Prawn"},
            {"Coffee","Green Tea","Orange Juice","Milk"},
            {"Xīngqí sān","Xīngqí liù","Xīngqí tiān","Xīngqí yī"},
            {"Wǔ yuè","Èr yuè","Qī yuè","Sì yuè"},
            {"圣诞","丰收节","生日","新年"},
            {"你叫什么名字?","我叫雷·莱。 你呢?","我很好，谢。 你呢?","他是谁?"},
            {"嗨，你结婚了吗?","你叫什么名字?","做你的妈妈有没有工作?","他在哪里工作?"}
    };

    private String mCorrectAnswers[]={"Bull","Cow","Germany","Chocolate","Orange Juice","Xīngqí sān","Qī yuè","圣诞","你叫什么名字?","他在哪里工作?"};

    public String getQuestion(int a){
        String question=mQuestions[a];
        return question;
    }

    public int getLength(){return mQuestions.length;}

    public String getChoice1(int a){
        String choice0=mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1=mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2=mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3=mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswers[a];
        return answer;
    }
}
