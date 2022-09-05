public class TeamProjecttheone_main {
    public static void main(String[] args){
        System.out.println("선택");

        TermProjectPolls polls = new TermProjectPolls();
        int val = polls.PollFunction();

        TermProjectStatics Statics = new TermProjectStatics();
        int val2 = Statics.StaticsFunction();

        return;
    }
}
