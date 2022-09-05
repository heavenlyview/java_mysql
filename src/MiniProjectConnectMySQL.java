import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MiniProjectConnectMySQL {
    public static void main(String[] args) {
        // MYSQL - Java 연결 순서
        // 1. MySQL Workbench 실행 (* mysql-connector J)
        // 2. [Database] -> [Connect to Database] (* )
        // 3. [Connection Method]: [Standard (TCP/IP) (* jdbc:mysql)] / [Parameters] -> [Hostname]: [localhost], [Username]: [root], [Password]: [tbrs00002b]
        final String DB_URL = "jdbc:mysql://localhost/world"; 
        final String USER = "root";
        final String PASS = "tbrs00002b";
        String QUERY = "select id, name, population "+ 
                        "from city "+
                        "where 1=1 " +
                        "and population >= 9230000 "   // 마지막에 띄어쓰기 꼭 해주기
        ;
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); // (*conn 클래스 성격 알고 가기 )
            Statement stmt = conn.createStatement(); //(*워크벤치의 Tab이 Statement다)
            ResultSet rs = stmt.executeQuery(QUERY);  // (* 쿼리를 실행했을 때 나오는 결과값이 담기는 집합)

            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("ID"));
                System.out.print(", Name: " + rs.getString("Name"));
                System.out.println(", Population: " + rs.getInt("Population"));
             }
     } catch (SQLException e) {
            e.printStackTrace();
        }
        // 4. 3번과 이어서... [Default Schema]: [스키마 이름 설정] / 설정 다 했으면 Ok 버튼 클릭
        // 5. 쿼리창을 띄어서 명령어 입력 (Select * from [Table name];) 후 출력값과 action output 확인

        return ;
        
    }
}