package SQL;

public class SQLMaster {
    public static void main(String[] args) {
        //데이터 베이스 전체 보기
        String SeleteAll="SELETE * FROM dataBase";
        //데이터 베이스 주석
        String Post = "--";
        //데이터 베이스에서 컬럼 선택하여 보기
        String SeleteCol="Selete CustomerNameCol FROM dataBase";
        //중복 선택이 가능합니다!
        //데이터 베이스 로우 선택하여 보기
        String SeleteRow="Selete CustomerNameRow FROM dataBase";
        //조건식으로 데이터베이스 찾기
        String Seleteif="Selete databasetable WHERE EMPLOYEES(테이블 이름)=3";
        //데이터베이스 정렬시키기
        String SeleteSort="Selete databasetable ORDER BY (내림차순 오름차순)";
        //컬럼 추가하기
        String ADDCOL="ALTER TABLE databasetable ADD (자료형) FIRST";
        //컬럼 원하는 위치에 추가하기
        String ADDAFTER="ALTER TABLE databasetable ADD (자료형) AFTRER (앞 컬럼 네임)";
    }
}
