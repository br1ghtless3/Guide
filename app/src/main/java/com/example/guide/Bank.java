package com.example.guide;

public class Bank {

    private String oneotvet, twootvet, threeotvet, foureotvet, fiveotvet, quis, ans;
    private String userSelAns;

    public Bank(String oneotvet, String twootvet, String threeotvet, String foureotvet, String fiveotvet, String quis, String ans, String userSelAns) {
        this.oneotvet = oneotvet;
        this.twootvet = twootvet;
        this.threeotvet = threeotvet;
        this.foureotvet = foureotvet;
        this.fiveotvet = fiveotvet;
        this.quis = quis;
        this.ans = ans;
        this.userSelAns = userSelAns;
    }

    public String getOneotvet() {
        return oneotvet;
    }

    public String getTwootvet() {
        return twootvet;
    }

    public String getThreeotvet() {
        return threeotvet;
    }

    public String getFoureotvet() {
        return foureotvet;
    }

    public String getFiveotvet() {
        return fiveotvet;
    }

    public String getQuis() {
        return quis;
    }

    public String getAns() {
        return ans;
    }

    public String getUserSelAns() {
        return userSelAns;
    }
}
