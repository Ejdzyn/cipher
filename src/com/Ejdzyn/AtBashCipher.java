package com.Ejdzyn;

public class AtBashCipher implements Cipher{

    private final char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private final String ab = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";


    @Override
    public String decode(String message) {
        StringBuilder encodedPass = new StringBuilder();
        for(int i = 0 ; i < message.length();i++){
            char checked = message.charAt(i);
            if(Character.isAlphabetic(checked)){
                for(int y = 0 ; y < alphabet.length;y++){
                    if(checked==alphabet[y]){
                        encodedPass.append(alphabet[alphabet.length-1-y]);
                        break;
                    }else if(checked==Character.toLowerCase(alphabet[y])){
                        encodedPass.append(Character.toLowerCase(alphabet[alphabet.length-1-y]));
                        break;
                    }
                }
            } else {
                encodedPass.append(checked);
            }
        }
        return String.valueOf(encodedPass);
    }

    @Override
    public String encode(String message) {
        StringBuilder encodedPass = new StringBuilder();
        for(int i = 0 ; i < message.length();i++){
            char checked = message.charAt(i);
            if(Character.isAlphabetic(checked)){
                for(int y = 0 ; y < alphabet.length;y++){
                    if(checked==alphabet[y]){
                        encodedPass.append(alphabet[alphabet.length-1-y]);
                        break;
                    }else if(checked==Character.toLowerCase(alphabet[y])){
                        encodedPass.append(Character.toLowerCase(alphabet[alphabet.length-1-y]));
                        break;
                    }
                }
            } else {
                encodedPass.append(checked);
            }
        }
        return String.valueOf(encodedPass);
    }
}

