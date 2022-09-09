package SQL;

public class SQLMaster {
    public static void main(String[] args) {
        //데이터 베이스 생성
        String create="CREATE DATABASE database";
        //데이터 베이스 만든거 보기
        String viewDatabase="SHOW database";
        //데이터 베이스 사용하기
        String useDatabase="USE database";
        //데이터 베이스 삭제
        String deleteDatabase="DROP DATABASE database";
        //테이블 전체 보기
        String seleteAll="SELETE * FROM dataBase";
        //데이터 베이스 주석
        String Post = "--";
        //테이블에서 컬럼 선택하여 보기
        String seleteCol="Selete CustomerNameCol FROM dataBase";
        //중복 선택이 가능합니다!
        //테이블 로우 선택하여 보기
        String seleteRow="Selete CustomerNameRow FROM dataBase";
        //조건식으로 데이터베이스 찾기
        String seleteif="Selete databasetable WHERE EMPLOYEES(테이블 이름)=3";
        //테이블 정렬시키기
        String seleteSort="Selete databasetable ORDER BY (내림차순 오름차순)";
        //컬럼 추가하기
        String adColL="ALTER TABLE databasetable ADD (자료형) FIRST";
        //컬럼 원하는 위치에 추가하기
        String AddAfter="ALTER TABLE databasetable ADD (자료형) AFTRER (앞 컬럼 네임)";
        //notNull붙이기
        String notNull="value type() NOT NULL";
        //val추가
        String addVal="INSERT INTO table_name VALUES (1105, '테스트', '대한민국')";

        String seeTable="SELECT * FROM database";
    }
}
