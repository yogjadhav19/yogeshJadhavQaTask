package com.dictionary;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DictionaryChecker {
    private static final OkHttpClient client = new OkHttpClient();

    public static boolean isValidEnglishWord(String word) {
        try {
            Request request = new Request.Builder()
                .url("https://api.dictionaryapi.dev/api/v2/entries/en/" + word)
                .build();

            try (Response response = client.newCall(request).execute()) {
                return response.isSuccessful();
            }
        } catch (Exception e) {
            return false;
        }
    }
}
