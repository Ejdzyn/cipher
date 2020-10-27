package com.Ejdzyn;

public class AtBashCipher {

    private final char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public String encode(String pass){

        StringBuilder encodedPass = new StringBuilder();

        /*for(char c:pass.toUpperCase().toCharArray()){
            for(int i = 0 ; i < alphabet.length;i++){
                if(alphabet[i]==c){
                    encodedPass.append(alphabet[alphabet.length-1-i]);
                    break;
                }
            }
        }*/

        for(int i = 0 ; i < pass.length();i++){
            char checked = pass.toUpperCase().charAt(i);
            if(Character.isAlphabetic(checked)){
                for(int y = 0 ; y < alphabet.length;y++){
                    if(alphabet[y]==checked){
                        encodedPass.append(alphabet[alphabet.length-1-y]);
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
