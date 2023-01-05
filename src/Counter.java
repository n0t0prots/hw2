public class Counter {
    public int wordsCounter(String str) {
        String[] strArray = str.split("\\s+");
        int HowMany=0;
        for(String element:strArray){
            if(element.matches("(\\p{P}?([a-zA-Z\\-]+)\\p{P}?)")){
                HowMany++;
            }
        }
        return HowMany;
    }
    public static void main(String[] args) {
        Counter count = new Counter();
        int HowMany=count.wordsCounter("Dear Eugeniya, sorry for my homework performance");
        System.out.println(HowMany);
    }
}
