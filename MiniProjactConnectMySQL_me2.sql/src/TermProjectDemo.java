public class TermProjectDemo {
    public static void main(String[] args){
        // Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); // (*conn 클래스 성격 알고 가기 )
        // Statement stmt = conn.createStatement(); //(*워크벤치의 Tab이 Statement다)
        System.out.println("선택");

        TermProjectPolls polls = new TermProjectPolls();
        int val = polls.PollFunction();

        TermProjectStatics Statics = new TermProjectStatics();
        int val2 = Statics.StaticsFunction();


        return;
    }
}
