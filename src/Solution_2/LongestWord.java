package Solutions_2;

public class LongestWord {

    public static void main(String[] args) {
        String s="Speed is the best remedy for stress!";
        String[] word=s.split(" ");
        String rts=" ";
        for(int i=0;i<word.length;i++){
            if(word[i].length()>=rts.length()){
                rts=word[i];
            }
        }
        System.out.println(rts);
        System.out.println(rts.length());
    }
}






