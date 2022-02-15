public class Blackjack {

    public int parseCard(String card) {
        int result;

        switch(card) {
            case "ace":
                result =  11;
                break;
            case "two":
                result =  2;
                break;
            case "three":
                result =  3;
                break;
            case "four":
                result =  4;
                break;
            case "five":
                result =  5;
                break;
            case "six":
                result =  6;
                break;
            case "seven":
                result =  7;
                break;
            case "eight":
                result =  8;
                break;
            case "nine":
                result =  9;
                break;
            case "ten": case "jack": case "queen": case "king":
                result =  10;
                break;
            default:
                result =  0;
                break;
        }
        return result;
    }

    public boolean isBlackjack(String card1, String card2) {
        int cardOne = parseCard(card1);
        int cardTwo = parseCard(card2);
        int sum = cardOne + cardTwo;

        if (sum == 21) {
            return true;
        } else {
            return false;
        }
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && (dealerScore != 11 && dealerScore != 10 && dealerScore != 0)) {
            return "W";
        } else if (isBlackjack && (dealerScore == 11 || dealerScore == 10 || dealerScore == 0)) {
            return "S";
        } else {
            return "P";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if ((handScore >= 12 && handScore <= 16) && dealerScore >= 7) {
            return "H";
        } else if ((handScore >= 12 && handScore <= 16) && dealerScore < 7) {
            return "S";
        } else {
            return "H";
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}