public class Quote {
    public static String randomQuoteNumber () {
        byte randomNum =  (byte) (Math.ceil(Math.random() * 4) + 1);
        System.out.println(randomNum);
        switch (randomNum) {
            case 1: return "\"Number 1 is the one!\"";
            case 2: return "\"Number 2, ya foo!\"";
            case 3: return "\"Number 3's for me!\"";
            case 4: return "\"Number 4 is a bore.\"";
            default: return "\"This ain't it chief...\"";
        }
    }
}
