
package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        PhraseList callToActionPhrases = new PhraseList();
        PhraseList itemPhrases = new PhraseList();
        PhraseList brandPhrases = new PhraseList();
        PhraseList prepositionPhrases = new PhraseList();
        PhraseList placePhrases = new PhraseList();

        callToActionPhrases.addRange(new String[]{
                "Купи",
                "Выбери",
                "Найди",
                "Забери"
        });

        itemPhrases.addRange(new String[]{
                "машину",
                "квартиру",
                "телефон",
                "пылесос",
                "стиральную машинку"
        });

        brandPhrases.addRange(new String[]{
                "Apple",
                "Samsung",
                "Звезда",
                "Philips",
                "Дружба"
        });

        prepositionPhrases.addRange(new String[]{
                "в",
                "на"
        });

        placePhrases.addRange(new String[]{
                "торговом центре",
                "доме отдыха",
                "чёрном рынке",
                "магазине",
                "базаре"
        });


        PromoPhrasesGenerator promoPhrasesGenerator = new PromoPhrasesGenerator(callToActionPhrases, itemPhrases, brandPhrases, prepositionPhrases, placePhrases);

        MenuManager menuManager = new MenuManager(promoPhrasesGenerator);
        menuManager.execute();
    }
}