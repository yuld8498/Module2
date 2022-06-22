package source;

public class TennisGame {
    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE ="Deuce";
    public static final String AD_PLAYER1 = "Advantage player1";
    public static final String AD_PLAYER2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FOURTY = "Forty";
    public static String callScore(int player1Score) {
        switch (player1Score) {
            case 0:
                return LOVE_ALL;
            case 1:
                return FIFTEEN_ALL;
            case 2:
                return THIRTY_ALL;
            case 3:
                return FORTY_ALL;
            default:
                return DEUCE;
        }
    }

    public static String callWin(int Score1, int Score2) {
        int result = Score1 - Score2;
        switch (result) {
            case -1:
                return AD_PLAYER2;
            case 1:
                return AD_PLAYER1;
            default: if (result>=2){
                return WIN_FOR_PLAYER_1;
            }else{
                return WIN_FOR_PLAYER_2;
            }
        }
    }
    public static String callPlayerScore(int score){
        switch (score){
            case 0: return LOVE;
            case 1: return FIFTEEN;
            case 2: return THIRTY;
            case 3:return FOURTY;
            default: return "";
        }
    }


    public static String getScore(int player1Score, int player2Score) {
        if (player1Score == player2Score) {
           return callScore(player1Score);
        }
        if (player1Score >= 4 || player2Score >= 4){
          return   callWin(player1Score,player2Score);
        }

           return callPlayerScore(player1Score) + "-" + callPlayerScore(player2Score);
    }
}

